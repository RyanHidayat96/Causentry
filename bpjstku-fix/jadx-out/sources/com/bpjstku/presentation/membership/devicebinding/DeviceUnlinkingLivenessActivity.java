package com.bpjstku.presentation.membership.devicebinding;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.appsflyer.internal.AFg1xSDK;
import com.bpjstku.R;
import com.bpjstku.data.devicebinding.model.request.LivenessEndRequest;
import com.bpjstku.data.devicebinding.model.response.LivenessBeginResponse;
import com.bpjstku.data.devicebinding.model.response.LivenessEndResponse;
import com.bpjstku.data.devicebinding.model.response.SubmitDeviceBindingResponse;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.databinding.ActivityDeviceUnlinkingLivenessBinding;
import com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity;
import com.bpjstku.presentation.queueing.BookingAntreanFormActivity;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import defpackage.AppCompatSpinnerDropDownAdapter;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda4;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.ExperimentalCamera2Interop;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.OutputConfigurationCompatApi33Impl;
import defpackage.TwilightManager;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.acquireBuffer;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.checkShowingFlags;
import defpackage.createButton;
import defpackage.deInitSession;
import defpackage.deriveCodec;
import defpackage.dumpAudioCapabilities;
import defpackage.getConfigs;
import defpackage.getContentPaddingRight;
import defpackage.getDropDownHorizontalOffset;
import defpackage.getEventTime;
import defpackage.getRealtimeCaptureLatency;
import defpackage.getStringOrNull;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onCameraAvailable;
import defpackage.onRestoreInstanceState;
import defpackage.onResume;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00148UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0007\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0015\u001a\u00020\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0015\u0010\u0011\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0015\u0010\u000e\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0015\u0010#\u001a\u00020\r8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0015\u0010\b\u001a\u00020\r8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b$\u0010\u001dR\u0016\u0010\t\u001a\u00020%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0015\u0010\n\u001a\u00020\r8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b(\u0010\u001dR\u0015\u0010\u001c\u001a\u00020\r8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b)\u0010\u001dR\u0015\u0010*\u001a\u00020\r8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0017\u0010\u000b\u001a\u0004\u0018\u00010\r8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b+\u0010\u001dR\u0017\u0010\"\u001a\u0004\u0018\u00010\r8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0017\u0010\f\u001a\u0004\u0018\u00010\r8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b*\u0010\u001dR\u0017\u0010$\u001a\u0004\u0018\u00010\r8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b,\u0010\u001dR\u0017\u0010,\u001a\u0004\u0018\u00010\r8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b-\u0010\u001dR\u0018\u0010(\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u0010!\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u001a\u00100\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u00105R\u0016\u0010)\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u0010/R\u0016\u0010&\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010/R\u0016\u00106\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010/R\u0018\u00101\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0018\u0010-\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010/R\u0018\u00107\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010/R\u0018\u00108\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010/"}, d2 = {"Lcom/bpjstku/presentation/membership/devicebinding/DeviceUnlinkingLivenessActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityDeviceUnlinkingLivenessBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "INotificationSideChannel", "cancelAll", "", "g", "()Ljava/lang/String;", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)V", "onDestroy", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "LAppCompatSpinnerDropDownAdapter;", "notify", "Lkotlin/Lazy;", "LcheckShowingFlags;", "LacquireBuffer;", "Lcom/bpjstku/data/lib/PreferenceManager;", "INotificationSideChannelStub", "onTransact", "d", "getInterfaceDescriptor", "", "write", "Z", "INotificationSideChannelDefault", "read", "cancel", "getRoot", "RemoteActionCompatParcelizer", "disconnect", "getExtras", "Ljava/lang/String;", "MediaBrowserCompat", "connect", "INotificationSideChannelStubProxy", "", "Ljava/io/File;", "Ljava/util/List;", "IconCompatParcelizer", "getItem", "getNotifyChildrenChangedOptions"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceUnlinkingLivenessActivity extends BindingBaseActivity<ActivityDeviceUnlinkingLivenessBinding> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long getItem;
    private static int getSessionToken;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final Lazy g;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    private String INotificationSideChannelStub;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String disconnect;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String connect;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private String INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String getItem;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String getNotifyChildrenChangedOptions;

    /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
    private String INotificationSideChannelDefault;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private boolean asInterface;
    private static final byte[] $$a = {55, -47, -47, 67, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 139;
    private static int sendCustomAction = 0;
    private static int getNotifyChildrenChangedOptions = 0;
    private static int search = 1;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: AppCompatRatingBar
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            return (String) DeviceUnlinkingLivenessActivity.b(objArr, 2140977970, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -2140977966);
        }
    });

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final Lazy a = LazyKt.lazy(new Function0() { // from class: tryGetActivity
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceUnlinkingLivenessActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private final Lazy asBinder = LazyKt.lazy(new Function0() { // from class: onDropForTextView
        private static final byte[] $$c = {93, -77, 2, Base64.padSymbol};
        private static final int $$f = 200;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {15, -9, 64, -81, 9, -20, 28, -27, -10, 2, -10, 2, 14, -24, -16, 6, -1, -24, 6, -10, 2, 16, -24, -17, -9, 11, -19, -6};
        private static final int $$e = 39;
        private static final byte[] $$a = {6, -86, -9, -124, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
        private static final int $$b = 134;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {57187, 57191, 60060, 57188, 60055, 60117, 60046, 60054, 60045, 60056, 57186, 60083, 60049, 60048, 60041, 57190, 60034, 60062, 60040, 60050, 60053, 60088, 60079, 60058, 60051, 60043, 57189, 60073, 57184, 60052, 60063, 60047, 57193, 60072, 57192, 60090};
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 57191;

        private static void a(short s, short s2, int i, Object[] objArr) {
            byte[] bArr = $$a;
            int i2 = (s2 * 14) + 84;
            int i3 = (s * 52) + 4;
            byte[] bArr2 = new byte[53 - i];
            int i4 = 52 - i;
            int i5 = -1;
            if (bArr == null) {
                i3++;
                i2 = (i3 + i2) - 10;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i2;
                if (i5 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    byte b = bArr[i3];
                    i3++;
                    i2 = (i2 + b) - 10;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002c  */
        /* JADX WARN: Code duplicated, block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(int r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 24
                int r7 = 27 - r7
                int r8 = r8 * 24
                int r0 = r8 + 1
                int r6 = r6 * 17
                int r6 = 115 - r6
                byte[] r1 = defpackage.onDropForTextView.$$d
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L17
                r6 = r7
                r3 = r8
                r4 = r2
                goto L2e
            L17:
                r3 = r2
                r5 = r7
                r7 = r6
                r6 = r5
            L1b:
                byte r4 = (byte) r7
                r0[r3] = r4
                int r6 = r6 + 1
                int r4 = r3 + 1
                if (r3 != r8) goto L2c
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L2c:
                r3 = r1[r6]
            L2e:
                int r3 = -r3
                int r7 = r7 + r3
                int r7 = r7 + (-5)
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.onDropForTextView.d(int, short, short, java.lang.Object[]):void");
        }

        private static void c(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2;
            int i4 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            long j = 0;
            int i5 = 1770390596;
            int i6 = 13;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $11 + i6;
                    $10 = i8 % 128;
                    if (i8 % i3 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(j));
                                int modifierMetaStateMask = 2266 - ((byte) KeyEvent.getModifierMetaStateMask());
                                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 33;
                                byte b2 = (byte) ($$c[i3] + 1);
                                byte b3 = (byte) (b2 - 3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, modifierMetaStateMask, iIndexOf, -1927765101, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i7 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cIndexOf = (char) TextUtils.indexOf("", "");
                                int iLastIndexOf = 2266 - TextUtils.lastIndexOf("", '0', 0, 0);
                                int bitsPerPixel = 32 - ImageFormat.getBitsPerPixel(0);
                                byte b4 = (byte) ($$c[2] + 1);
                                byte b5 = (byte) (b4 - 3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iLastIndexOf, bitsPerPixel, -1927765101, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            i7++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i3 = 2;
                    j = 0;
                    i5 = 1770390596;
                    i6 = 13;
                }
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cMyTid = (char) (Process.myTid() >> 22);
                int iMyPid = 2267 - (Process.myPid() >> 22);
                int tapTimeout = 33 - (ViewConfiguration.getTapTimeout() >> 16);
                byte b6 = (byte) ($$c[2] + 1);
                byte b7 = (byte) (b6 - 3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMyTid, iMyPid, tapTimeout, -1927765101, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i9 = $10 + 63;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        obj = obj2;
                    } else {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char size = (char) (View.MeasureSpec.getSize(0) + 49267);
                            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 3261;
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 30;
                            byte b8 = $$c[2];
                            byte b9 = (byte) (b8 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size, offsetAfter, minimumFlingVelocity, -127612708, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                byte b10 = (byte) 0;
                                byte b11 = b10;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 22879), 594 - TextUtils.getOffsetAfter("", 0), ExpandableListView.getPackedPositionChild(0L) + 18, 1570859318, false, $$g(b10, b11, b11), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                            int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                            int i12 = $11 + 7;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i14 = $10 + 1;
                                $11 = i14 % 128;
                                int i15 = i14 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                            } else {
                                int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    obj2 = obj;
                }
            }
            for (int i20 = 0; i20 < i; i20++) {
                cArr4[i20] = (char) (cArr4[i20] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char deadChar = (char) (31533 - KeyEvent.getDeadChar(0, 0));
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 921;
                int gidForName = Process.getGidForName("") + 29;
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                a(bArr[80], bArr[37], (byte) 52, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, iNormalizeMetaState, gidForName, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{18, 21, ' ', '\f', 25, 23, '#', 0, 24, 23, 3, '#', '\f', 22, '#', '\r', '\t', 19, 5, 28, 7, 15}, (byte) (91 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{16, 5, 19, 29, 23, '\f', '!', 24, 23, 29, 1, Typography.quote, 25, '\r', 13883}, (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 60), 15 - TextUtils.indexOf("", "", 0), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16808749);
                int i2 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 920;
                int i3 = 27 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                byte b = $$a[80];
                byte b2 = b;
                Object[] objArr5 = new Object[1];
                a(b, b2, b2, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, i2, i3, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cRed = (char) (Color.red(0) + 31533);
                    int iLastIndexOf = 920 - TextUtils.lastIndexOf("", '0', 0);
                    int windowTouchSlop = 28 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte[] bArr2 = $$a;
                    Object[] objArr6 = new Object[1];
                    a(bArr2[37], bArr2[80], bArr2[33], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRed, iLastIndexOf, windowTouchSlop, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iNextInt = new Random().nextInt();
                int i4 = 1213594566 + ((~((~iNextInt) | (-17836161))) * 433) + (((~((-950866716) | iNextInt)) | (-823212929)) * (-433)) + (((~(iNextInt | (-823212929))) | (-968702876)) * 433) + 1668906869;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{18, 21, ' ', '\f', 25, 23, '#', 0, 19, 29, 29, 1, '!', 11, 1, 25, 7, 20, Typography.quote, '\r', 18, 28, 15, '\f', 18, '#'}, (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 71), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{'\n', 7, 13890, 13890, 14, 23, ' ', 30, 13892, 13892, 1, 22, 11, 21, 1, 25, 26, 23}, (byte) (Gravity.getAbsoluteGravity(0, 0) + 90), 18 - KeyEvent.getDeadChar(0, 0), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if ((!(applicationContext instanceof ContextWrapper)) || ((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                        int i7 = TuitionPaymentFragmentbindingInflater1 + 21;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                        int i8 = i7 % 2;
                    } else {
                        applicationContext = null;
                    }
                }
                Object[] objArr10 = new Object[1];
                c(new char[]{17, 18, 11, 20, 0, 5, 18, 21, 3, 0, Typography.quote, 15, 19, 30, '\r', 11}, (byte) (103 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getEdgeSlop() >> 16) + 16, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new char[]{18, 31, 14, 23, 1, 25, Typography.quote, '\r', 17, 29, 24, 30, 23, 27, '#', '\f'}, (byte) (ExpandableListView.getPackedPositionGroup(0L) + 29), 16 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1668906869};
                    byte[] bArr3 = $$d;
                    byte b3 = bArr3[16];
                    byte b4 = (byte) (b3 + 1);
                    byte b5 = (byte) (-b3);
                    Object[] objArr13 = new Object[1];
                    d(b4, b5, b5, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b6 = (byte) (-bArr3[16]);
                    byte b7 = (byte) (b6 - 1);
                    Object[] objArr14 = new Object[1];
                    d(b6, b7, b7, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cMakeMeasureSpec = (char) (31533 - View.MeasureSpec.makeMeasureSpec(0, 0));
                        int i9 = 922 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int i10 = 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte[] bArr4 = $$a;
                        Object[] objArr16 = new Object[1];
                        a(bArr4[37], bArr4[80], bArr4[33], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMakeMeasureSpec, i9, i10, -1142834547, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{18, 21, ' ', '\f', 25, 23, '#', 0, 24, 23, 3, '#', '\f', 22, '#', '\r', '\t', 19, 5, 28, 7, 15}, (byte) ((Process.myPid() >> 22) + 91), 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{16, 5, 19, 29, 23, '\f', '!', 24, 23, 29, 1, Typography.quote, 25, '\r', 13883}, (byte) ((Process.myTid() >> 22) + 60), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0));
                            int doubleTapTimeout = 921 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int i11 = 29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            byte b8 = $$a[80];
                            byte b9 = b8;
                            Object[] objArr19 = new Object[1];
                            a(b8, b9, b9, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, doubleTapTimeout, i11, -778300370, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c = (char) (31533 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                            int iResolveSize = 921 - View.resolveSize(0, 0);
                            int keyRepeatTimeout = 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            byte[] bArr5 = $$a;
                            Object[] objArr20 = new Object[1];
                            a(bArr5[80], bArr5[37], (byte) 52, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iResolveSize, keyRepeatTimeout, -1048449946, false, (String) objArr20[0], null);
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
            int i12 = ((int[]) objArr[1])[0];
            int i13 = ((int[]) objArr[3])[0];
            if (i13 == i12) {
                int i14 = ((int[]) objArr[0])[0];
                Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i15 = i14 + ((~((-539066449) | iIdentityHashCode)) * 521) + 1448148144 + (((~((~iIdentityHashCode) | (-539066449))) | 1176248579) * 521);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr21[0])[0] = i17 ^ (i17 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    for (String str : strArr) {
                        int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
                        TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                        int i19 = i18 % 2;
                        arrayList.add(str);
                    }
                }
                int[] iArr = new int[i13];
                int i20 = i13 - 1;
                iArr[i20] = 1;
                Toast.makeText((Context) null, iArr[((i13 * i20) % 2) - 1], 1).show();
                int i21 = ((int[]) objArr[0])[0];
                Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i22 = i21 + (-730941379) + (((~((-1342275360) | iUptimeMillis)) | (-1505623936)) * (-502)) + ((~((~iUptimeMillis) | (-1073819652))) * (-502)) + (((~(iUptimeMillis | (-431804285))) | (-1342275360)) * TypedValues.PositionType.TYPE_DRAWPATH);
                int i23 = (i22 << 13) ^ i22;
                int i24 = i23 ^ (i23 >>> 17);
                ((int[]) objArr22[0])[0] = i24 ^ (i24 << 5);
            }
            return DeviceUnlinkingLivenessActivity.g(this.b);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r6, byte r7, short r8) {
            /*
                int r6 = 116 - r6
                int r7 = r7 * 2
                int r7 = r7 + 4
                int r8 = r8 * 3
                int r0 = 1 - r8
                byte[] r1 = defpackage.onDropForTextView.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                int r8 = 0 - r8
                if (r1 != 0) goto L17
                r3 = r7
                r6 = r8
                r4 = r2
                goto L2a
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L25:
                r3 = r1[r7]
                r5 = r3
                r3 = r7
                r7 = r5
            L2a:
                int r6 = r6 + r7
                int r7 = r3 + 1
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.onDropForTextView.$$g(short, byte, short):java.lang.String");
        }
    });

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Lazy notify = LazyKt.lazy(new Function0() { // from class: getTickMark
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceUnlinkingLivenessActivity.asInterface(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy cancel = LazyKt.lazy(new Function0() { // from class: applyTickMarkTint
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceUnlinkingLivenessActivity.cancelAll(this.b);
        }
    });

    /* JADX INFO: renamed from: getRoot, reason: from kotlin metadata */
    private final Lazy INotificationSideChannel = LazyKt.lazy(new Function0() { // from class: AppCompatSeekBar
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceUnlinkingLivenessActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Lazy onTransact = LazyKt.lazy(new Function0() { // from class: AppCompatSeekBarHelper
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            return (String) DeviceUnlinkingLivenessActivity.b(objArr, 30514129, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -30514124);
        }
    });

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy cancelAll = LazyKt.lazy(new Function0() { // from class: setTickMark
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceUnlinkingLivenessActivity.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Lazy getInterfaceDescriptor = LazyKt.lazy(new Function0() { // from class: setTickMarkTintMode
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            return (String) DeviceUnlinkingLivenessActivity.b(objArr, -587216275, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 587216278);
        }
    });

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    private final Lazy RemoteActionCompatParcelizer = LazyKt.lazy(new Function0() { // from class: getTickMarkTintList
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceUnlinkingLivenessActivity.d(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final List<File> MediaBrowserCompat = new ArrayList();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String read = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String write = "0.0";

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String IconCompatParcelizer = "0.0";

    static final /* synthetic */ class TuitionPaymentFragmentbindingInflater1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 b;

        TuitionPaymentFragmentbindingInflater1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.b = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.b.invoke(obj);
        }
    }

    public static /* synthetic */ Object b(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~i6;
        int i11 = i9 | (~(i10 | i5));
        int i12 = (~(i5 | i7)) | (~(i8 | i10));
        int i13 = ~(i | i6);
        int i14 = i12 | i13;
        int i15 = i13 | i11;
        int i16 = i + i6 + i4 + ((-1585779005) * i3) + (640148872 * i2);
        int i17 = i16 * i16;
        int i18 = (i * 308833806) + 153878528 + (308833806 * i6) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i4) + (1159200768 * i3) + ((-734003200) * i2) + (2089549824 * i17);
        int i19 = (i * (-1291220770)) + 263398195 + (i6 * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * TypedValues.Custom.TYPE_FLOAT) + (i4 * (-1291221671)) + (i3 * (-1079815989)) + (i2 * 669414472) + (i17 * 145489920);
        switch (i18 + (i19 * i19 * (-1699479552))) {
            case 1:
                return b(objArr);
            case 2:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            case 3:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 4:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 5:
                return d(objArr);
            case 6:
                return a(objArr);
            case 7:
                return asBinder(objArr);
            default:
                return TuitionPaymentFragmentbindingInflater1(objArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity.$$a
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r8 = r8 + 1
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2c:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-11)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity.c(byte, short, short, java.lang.Object[]):void");
    }

    public DeviceUnlinkingLivenessActivity() {
        final DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity = this;
        this.b = LazyKt.lazy(new Function0<AppCompatSpinnerDropDownAdapter>() { // from class: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity$special$$inlined$viewModel$default$1
            private static final byte[] $$c = {110, -73, -111, 99};
            private static final int $$f = 153;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {99, -43, -44, -62, -8, 63, -70, 11, 2, -4, -19, 9, -15, 15, -21, 72, -61, -7, -8, 13, -15, 2, 11, -13, 60, -67, -3, 9, -15, 15, -21, 3, -5, -3, 67, -71, 8, -7, 5, -7, 5, 53, -39, -24, -7, 5, -7, 5, 16, -36, 17, -19, 14, -17, 7, 5, -5, 20, -33, 72, -49, -36, 17, -19, 14, -17, 7, 5, -5, 20, -33, 29, -21, -19, 12, -15, -6, 15, -15, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, -1, 1, 9, 0, -8, 6, -13, 1, -7, 0, 1, -7, 7, -1, -20, 11, 2, -20, 40, -36, 9, -3, -9, 6, -3, -3, 3, -22, 7, -10, 65};
            private static final int $$e = 220;
            private static final byte[] $$a = {31, 115, -100, -11, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
            private static final int $$b = 57;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {60055, 60040, 60063, 60072, 60049, 60083, 60047, 60048, 60073, 60043, 60088, 60045, 60050, 60051, 60056, 60058, 60060, 60057, 60117, 60054, 60041, 60034, 60062, 60053, 60052};
            private static char b = 57188;
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            private static void a(int i, int i2, int i3, Object[] objArr) {
                int i4 = (i3 * 3) + 97;
                byte[] bArr = $$a;
                int i5 = (i * 10) + 4;
                byte[] bArr2 = new byte[11 - i2];
                int i6 = 10 - i2;
                int i7 = -1;
                if (bArr == null) {
                    int i8 = i6 + (-i5);
                    i5++;
                    i4 = i8 - 5;
                    i7 = -1;
                }
                while (true) {
                    int i9 = i7 + 1;
                    bArr2[i9] = (byte) i4;
                    if (i9 == i6) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    int i10 = i4;
                    int i11 = i5;
                    int i12 = i10 + (-bArr[i5]);
                    i5 = i11 + 1;
                    i4 = i12 - 5;
                    i7 = i9;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(byte r6, short r7, int r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 23
                    int r0 = r6 + 53
                    int r8 = r8 * 75
                    int r8 = r8 + 4
                    byte[] r1 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity$special$$inlined$viewModel$default$1.$$d
                    int r7 = r7 * 21
                    int r7 = 105 - r7
                    byte[] r0 = new byte[r0]
                    int r6 = r6 + 52
                    r2 = 0
                    if (r1 != 0) goto L19
                    r3 = r8
                    r4 = r2
                    r8 = r6
                    goto L30
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    if (r3 != r6) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L27:
                    r4 = r1[r8]
                    int r3 = r3 + 1
                    r5 = r8
                    r8 = r7
                    r7 = r4
                    r4 = r3
                    r3 = r5
                L30:
                    int r7 = -r7
                    int r8 = r8 + r7
                    int r7 = r8 + (-2)
                    int r8 = r3 + 1
                    r3 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity$special$$inlined$viewModel$default$1.d(byte, short, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:34:0x0130  */
            /* JADX WARN: Code duplicated, block: B:36:0x013c  */
            /* JADX WARN: Code duplicated, block: B:39:0x0152  */
            /* JADX WARN: Code duplicated, block: B:40:0x0166  */
            /* JADX WARN: Code duplicated, block: B:43:0x01b0 A[Catch: all -> 0x0364, TryCatch #0 {all -> 0x0364, blocks: (B:41:0x0168, B:43:0x01b0, B:44:0x0224), top: B:73:0x0168 }] */
            /* JADX WARN: Code duplicated, block: B:47:0x0237  */
            /* JADX WARN: Code duplicated, block: B:50:0x0274 A[Catch: all -> 0x038c, TryCatch #1 {all -> 0x038c, blocks: (B:7:0x002a, B:9:0x0038, B:10:0x006b, B:14:0x0086, B:16:0x0097, B:17:0x00c6, B:48:0x0239, B:50:0x0274, B:51:0x02dc), top: B:75:0x002a }] */
            /* JADX WARN: Code duplicated, block: B:53:0x02fe  */
            /* JADX WARN: Code duplicated, block: B:55:0x0305  */
            /* JADX WARN: Code duplicated, block: B:56:0x0338  */
            private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
                int i2;
                int i3;
                Object obj;
                int i4;
                Object[] objArr2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i5 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                long j = 0;
                int i6 = 1770390596;
                float f = 0.0f;
                Object obj2 = null;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i7 = $11 + 31;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = 0;
                    while (i9 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr2[i9])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), ExpandableListView.getPackedPositionType(j) + 2267, 34 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            cArr3[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                            i9++;
                            j = 0;
                            i6 = 1770390596;
                            f = 0.0f;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                Object[] objArr4 = {Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) Drawable.resolveOpacity(0, 0), 2266 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 34, -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    int i10 = $10 + 115;
                    int i11 = i10 % 128;
                    $11 = i11;
                    int i12 = i10 % 2;
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b2);
                    int i13 = i11 + 65;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                } else {
                    i2 = i;
                }
                char c = 7;
                if (i2 > 1) {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                    while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                        int i15 = $11 + 35;
                        $10 = i15 % 128;
                        if (i15 % 2 != 0) {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                i3 = $10 + 81;
                                $11 = i3 % 128;
                                if (i3 % 2 == 0) {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b >> b2);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + b2);
                                } else {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                }
                                obj = obj2;
                            } else {
                                try {
                                    objArr2 = new Object[13];
                                    objArr2[12] = deinitsession;
                                    objArr2[11] = Integer.valueOf(cCharValue);
                                    objArr2[10] = deinitsession;
                                    objArr2[9] = deinitsession;
                                    objArr2[8] = Integer.valueOf(cCharValue);
                                    objArr2[c] = deinitsession;
                                    objArr2[6] = deinitsession;
                                    objArr2[5] = Integer.valueOf(cCharValue);
                                    objArr2[4] = deinitsession;
                                    objArr2[3] = deinitsession;
                                    objArr2[2] = Integer.valueOf(cCharValue);
                                    objArr2[1] = deinitsession;
                                    objArr2[0] = deinitsession;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char keyRepeatDelay = (char) (49267 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                                        int iAlpha = 3261 - Color.alpha(0);
                                        int iRed = 30 - Color.red(0);
                                        byte b7 = (byte) ($$f & 7);
                                        byte b8 = (byte) (b7 - 1);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, iAlpha, iRed, -127612708, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                    }
                                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            byte b9 = (byte) 3;
                                            byte b10 = (byte) (b9 - 3);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22877 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 594 - View.MeasureSpec.makeMeasureSpec(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17, 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        }
                                        obj = null;
                                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                                        int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                                    } else {
                                        obj = null;
                                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                            int i17 = $10 + 49;
                                            $11 = i17 % 128;
                                            int i18 = i17 % 2;
                                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                            int i19 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                            int i20 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i19];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i20];
                                        } else {
                                            int i21 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                            int i22 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i21];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i22];
                                            int i23 = $10 + 83;
                                            $11 = i23 % 128;
                                            i4 = 2;
                                            int i24 = i23 % 2;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            }
                            i4 = 2;
                        } else {
                            deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                            if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                i3 = $10 + 81;
                                $11 = i3 % 128;
                                if (i3 % 2 == 0) {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b >> b2);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + b2);
                                } else {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                }
                                obj = obj2;
                            } else {
                                objArr2 = new Object[13];
                                objArr2[12] = deinitsession;
                                objArr2[11] = Integer.valueOf(cCharValue);
                                objArr2[10] = deinitsession;
                                objArr2[9] = deinitsession;
                                objArr2[8] = Integer.valueOf(cCharValue);
                                objArr2[c] = deinitsession;
                                objArr2[6] = deinitsession;
                                objArr2[5] = Integer.valueOf(cCharValue);
                                objArr2[4] = deinitsession;
                                objArr2[3] = deinitsession;
                                objArr2[2] = Integer.valueOf(cCharValue);
                                objArr2[1] = deinitsession;
                                objArr2[0] = deinitsession;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char keyRepeatDelay2 = (char) (49267 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                                    int iAlpha2 = 3261 - Color.alpha(0);
                                    int iRed2 = 30 - Color.red(0);
                                    byte b11 = (byte) ($$f & 7);
                                    byte b12 = (byte) (b11 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay2, iAlpha2, iRed2, -127612708, false, $$g(b11, b12, b12), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                    Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        byte b13 = (byte) 3;
                                        byte b14 = (byte) (b13 - 3);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22877 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 594 - View.MeasureSpec.makeMeasureSpec(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17, 1570859318, false, $$g(b13, b14, b14), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                    int i110 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i110];
                                } else {
                                    obj = null;
                                    if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                        int i111 = $10 + 49;
                                        $11 = i111 % 128;
                                        int i112 = i111 % 2;
                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                        int i113 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                        int i25 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i113];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i25];
                                    } else {
                                        int i26 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                        int i27 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i26];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i27];
                                        int i28 = $10 + 83;
                                        $11 = i28 % 128;
                                        i4 = 2;
                                        int i29 = i28 % 2;
                                    }
                                }
                            }
                            i4 = 2;
                        }
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += i4;
                        obj2 = obj;
                        c = 7;
                    }
                }
                for (int i30 = 0; i30 < i; i30++) {
                    int i31 = $11 + 7;
                    $10 = i31 % 128;
                    int i32 = i31 % 2;
                    cArr4[i30] = (char) (cArr4[i30] ^ 13722);
                }
                objArr[0] = new String(cArr4);
            }

            /* JADX WARN: Type inference failed for: r2v76, types: [AppCompatSpinnerDropDownAdapter, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ AppCompatSpinnerDropDownAdapter invoke() throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentbindingInflater1 + 101;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                    int i4 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 876;
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 11;
                    byte b2 = $$a[11];
                    byte b3 = b2;
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, i4, bitsPerPixel, -1199417970, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{18, 20, 0, 22, 22, 14, 3, 17, 21, 4, 23, '\b', 1, 6, 7, 21, 15, 14, 4, 20, '\f', '\t'}, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 70), 21 - TextUtils.lastIndexOf("", '0', 0), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{20, 2, 19, 5, 2, 21, 3, 7, 20, 17, 1, 5, 14, 17, 13888}, (byte) (66 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 15 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int i5 = 877 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int i6 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                    int i7 = $$b;
                    Object[] objArr5 = new Object[1];
                    a((byte) (i7 & 7), $$a[8], (byte) (i7 & 7), objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i5, i6, 254769921, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int iRgb = Color.rgb(0, 0, 0) + 16778092;
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 10;
                        byte b4 = (byte) ($$b & 7);
                        Object[] objArr6 = new Object[1];
                        a(b4, (byte) (b4 + 2), $$a[11], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(touchSlop, iRgb, absoluteGravity, 1324201839, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i8 = ~iIdentityHashCode;
                    int i9 = 1222119540 + (((~((-136921089) | i8)) | (~((-399945708) | iIdentityHashCode))) * 520);
                    int i10 = ~(399945707 | i8);
                    int i11 = ~(iIdentityHashCode | 440255936);
                    int i12 = i9 + ((i10 | i11) * (-1040)) + ((i11 | (~(i8 | (-440255937))) | (-536866796)) * 520) + 1580119040;
                    int i13 = (i12 << 13) ^ i12;
                    int i14 = i13 ^ (i13 >>> 17);
                    ((int[]) objArr[1])[0] = i14 ^ (i14 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{0, 19, '\n', 16, 15, 3, 18, 20, 17, 19, 1, 23, 6, 11, 24, 17}, (byte) (20 - View.resolveSize(0, 0)), 16 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{17, 7, 23, 24, 7, 11, 11, 1, '\n', 20, 3, 11, 14, 20, 7, 2}, (byte) (View.MeasureSpec.getMode(0) + 100), ((Process.getThreadPriority(0) + 20) >> 6) + 16, objArr9);
                    try {
                        Object[] objArr10 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 1580119040};
                        byte[] bArr = $$d;
                        byte b5 = bArr[101];
                        byte b6 = bArr[103];
                        Object[] objArr11 = new Object[1];
                        d(b5, b6, b6, objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        byte b7 = bArr[103];
                        byte b8 = bArr[101];
                        Object[] objArr12 = new Object[1];
                        d(b7, b8, b8, objArr12);
                        objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int trimmedLength = 876 - TextUtils.getTrimmedLength("");
                            int iGreen = Color.green(0) + 10;
                            byte b9 = (byte) ($$b & 7);
                            Object[] objArr13 = new Object[1];
                            a(b9, (byte) (b9 + 2), $$a[11], objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(minimumFlingVelocity, trimmedLength, iGreen, 1324201839, false, (String) objArr13[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr14 = new Object[1];
                            c(new char[]{18, 20, 0, 22, 22, 14, 3, 17, 21, 4, 23, '\b', 1, 6, 7, 21, 15, 14, 4, 20, '\f', '\t'}, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 72), (ViewConfiguration.getScrollBarSize() >> 8) + 22, objArr14);
                            Class<?> cls4 = Class.forName((String) objArr14[0]);
                            Object[] objArr15 = new Object[1];
                            c(new char[]{20, 2, 19, 5, 2, 21, 3, 7, 20, 17, 1, 5, 14, 17, 13888}, (byte) (65 - ((Process.getThreadPriority(0) + 20) >> 6)), 15 - Gravity.getAbsoluteGravity(0, 0), objArr15);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                                int iMyTid = (Process.myTid() >> 22) + 876;
                                int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                int i15 = $$b;
                                Object[] objArr16 = new Object[1];
                                a((byte) (i15 & 7), $$a[8], (byte) (i15 & 7), objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore, iMyTid, iIndexOf, 254769921, false, (String) objArr16[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                int i16 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 875;
                                int i17 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
                                byte b10 = $$a[11];
                                byte b11 = b10;
                                Object[] objArr17 = new Object[1];
                                a(b10, b11, b11, objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize, i16, i17, -1199417970, false, (String) objArr17[0], null);
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
                int i18 = ((int[]) objArr[2])[0];
                int i19 = ((int[]) objArr[0])[0];
                if (i19 == i18) {
                    int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
                    TuitionPaymentFragmentbindingInflater1 = i20 % 128;
                    int i21 = i20 % 2;
                    int i22 = ((int[]) objArr[1])[0];
                    Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i23 = ~elapsedCpuTime;
                    int i24 = i22 + 1854270488 + (((~(204813909 | i23)) | 245124138) * (-90)) + (((~(204813909 | elapsedCpuTime)) | 2175573) * (-45)) + (((~(elapsedCpuTime | (-245124139))) | 204813909 | (~(i23 | 245124138))) * 45);
                    int i25 = (i24 << 13) ^ i24;
                    int i26 = i25 ^ (i25 >>> 17);
                    ((int[]) objArr18[1])[0] = i26 ^ (i26 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[3];
                    if (strArr != null) {
                        int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i28 = i27 + 121;
                        TuitionPaymentFragmentbindingInflater1 = i28 % 128;
                        int i29 = 2;
                        int i30 = i28 % 2;
                        int i31 = i27 + 35;
                        TuitionPaymentFragmentbindingInflater1 = i31 % 128;
                        int i32 = i31 % 2;
                        int i33 = 0;
                        while (i33 < strArr.length) {
                            int i34 = TuitionPaymentFragmentbindingInflater1 + 57;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i34 % 128;
                            if (i34 % i29 != 0) {
                                arrayList.add(strArr[i33]);
                                i33 += 82;
                            } else {
                                arrayList.add(strArr[i33]);
                                i33++;
                            }
                            i29 = 2;
                        }
                    }
                    int[] iArr = new int[i19];
                    int i35 = i19 - 1;
                    iArr[i35] = 1;
                    Toast.makeText((Context) null, iArr[((i19 * i35) % 2) - 1], 1).show();
                    int i36 = ((int[]) objArr[1])[0];
                    Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                    int iMyTid2 = Process.myTid();
                    int i37 = ~iMyTid2;
                    int i38 = i36 + 1735329564 + ((iMyTid2 | 893635094) * (-859)) + (((~(iMyTid2 | (-84101655))) | (~(893635094 | i37))) * 859) + (((~(853324865 | i37)) | (-937426520)) * 859);
                    int i39 = (i38 << 13) ^ i38;
                    int i40 = i39 ^ (i39 >>> 17);
                    ((int[]) objArr19[1])[0] = i40 ^ (i40 << 5);
                }
                LifecycleOwner lifecycleOwner = deviceUnlinkingLivenessActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AppCompatSpinnerDropDownAdapter.class);
                if (lifecycleOwner == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
                }
                ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                ?? B = isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
                TuitionPaymentFragmentbindingInflater1 = i41 % 128;
                if (i41 % 2 != 0) {
                    return B;
                }
                throw null;
            }

            {
                super(0);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r5, int r6, short r7) {
                /*
                    int r5 = r5 + 113
                    byte[] r0 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity$special$$inlined$viewModel$default$1.$$c
                    int r6 = r6 * 4
                    int r6 = 3 - r6
                    int r7 = r7 * 3
                    int r1 = 1 - r7
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r7 = 0 - r7
                    if (r0 != 0) goto L16
                    r3 = r7
                    r4 = r2
                    goto L28
                L16:
                    r3 = r2
                L17:
                    int r6 = r6 + 1
                    byte r4 = (byte) r5
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L26
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L26:
                    r3 = r0[r6]
                L28:
                    int r5 = r5 + r3
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity$special$$inlined$viewModel$default$1.$$g(byte, int, short):java.lang.String");
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<checkShowingFlags>() { // from class: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, checkShowingFlags] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ checkShowingFlags invoke() {
                LifecycleOwner lifecycleOwner = deviceUnlinkingLivenessActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(checkShowingFlags.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
        final DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = deviceUnlinkingLivenessActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.g = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = deviceUnlinkingLivenessActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jq\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/bpjstku/presentation/membership/devicebinding/DeviceUnlinkingLivenessActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p3, "");
            Intrinsics.checkNotNullParameter(p4, "");
            Intent intent = new Intent(p0, (Class<?>) DeviceUnlinkingLivenessActivity.class);
            intent.putExtra("email", p1);
            intent.putExtra("key_nik", p2);
            intent.putExtra("KEY_NAMA_LENGKAP", p3);
            intent.putExtra("KEY_TANGGAL_LAHIR", p4);
            intent.putExtra("key_jenis_form", p5);
            intent.putExtra("KEY_ALAMAT", p6);
            intent.putExtra("KEY_TEMPAT_LAHIR", p7);
            intent.putExtra("KEY_LATITUDE", p8);
            intent.putExtra("KEY_LONGITUDE", p9);
            intent.putExtra("key_transaction_id", p10);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        int i3 = $10 + 99;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 4 / 2;
        }
        while (getrealtimecapturelatency.b < cArr.length) {
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - Color.red(0)), TextUtils.getCapsMode("", 0, 0) + 2624, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (getItem ^ 9053247990562531611L);
                try {
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 481 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.MeasureSpec.getSize(0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i6 = $10 + 39;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 39422), 481 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = search + 91;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        DeviceUnlinkingLivenessActivity$bindingInflater$1 deviceUnlinkingLivenessActivity$bindingInflater$1 = DeviceUnlinkingLivenessActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = search + 121;
        getNotifyChildrenChangedOptions = i4 % 128;
        int i5 = i4 % 2;
        return deviceUnlinkingLivenessActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ActivityDeviceUnlinkingLivenessBinding activityDeviceUnlinkingLivenessBinding = (ActivityDeviceUnlinkingLivenessBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityDeviceUnlinkingLivenessBinding.layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: AppCompatReceiveContentHelperOnDropApi24Impl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        MaterialButton materialButton = activityDeviceUnlinkingLivenessBinding.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: onDropForView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        int i2 = getNotifyChildrenChangedOptions + 91;
        search = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity = this;
        Intrinsics.checkNotNullParameter(deviceUnlinkingLivenessActivity, "");
        deviceUnlinkingLivenessActivity.getWindow().addFlags(8192);
        ExperimentalCamera2Interop.INSTANCE.b(this, new getDropDownHorizontalOffset(this), new Function0() { // from class: maybeHandleDragEventViaPerformReceiveContent
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceUnlinkingLivenessActivity.cancel(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
        MaterialToolbar materialToolbar = ((ActivityDeviceUnlinkingLivenessBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar;
        String string = getString(R.string.label_string_null);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(materialToolbar, string, true);
        int i2 = search + 85;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void INotificationSideChannel() throws Throwable {
        int i = 2 % 2;
        int i2 = search + 47;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = (String) this.RemoteActionCompatParcelizer.getValue();
        if (str == null) {
            String string = getString(R.string.error_transaction_id_missing);
            Intrinsics.checkNotNullExpressionValue(string, "");
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(string);
            return;
        }
        int i3 = getNotifyChildrenChangedOptions + 47;
        search = i3 % 128;
        int i4 = i3 % 2;
        ((AppCompatSpinnerDropDownAdapter) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
        int i5 = search + 61;
        getNotifyChildrenChangedOptions = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private final void cancelAll() {
        int i = 2 % 2;
        g();
        OutputConfigurationCompatApi33Impl.Companion companion = OutputConfigurationCompatApi33Impl.INSTANCE;
        String string = getString(R.string.label_title_validation_account_dialog);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.label_message_validation_account_dialog);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = getString(R.string.action_booking_antrean_online);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        OutputConfigurationCompatApi33Impl outputConfigurationCompatApi33ImplB = OutputConfigurationCompatApi33Impl.Companion.b(R.drawable.notfound, string, string2, string3, (128 & 16) != 0 ? null : new Function0() { // from class: maybeHandleMenuActionViaPerformReceiveContent
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1);
            }
        }, (128 & 32) != 0 ? null : null, (128 & 64) != 0 ? null : null, (128 & 128) != 0 ? false : false);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i2 = getNotifyChildrenChangedOptions + 97;
            search = i2 % 128;
            if (i2 % 2 != 0) {
                outputConfigurationCompatApi33ImplB.show(supportFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            } else {
                outputConfigurationCompatApi33ImplB.show(supportFragmentManager, outputConfigurationCompatApi33ImplB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                throw null;
            }
        }
    }

    private final String g() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions;
        int i3 = i2 + 121;
        search = i3 % 128;
        int i4 = i3 % 2;
        String str = this.connect;
        if (str == null) {
            int i5 = i2 + 107;
            search = i5 % 128;
            int i6 = i5 % 2;
            str = "";
        }
        String str2 = this.getItem;
        if (str2 == null) {
            int i7 = search + 19;
            getNotifyChildrenChangedOptions = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            str2 = "";
        }
        String str3 = str;
        if (!StringsKt.isBlank(str3) && !StringsKt.isBlank(str2) && !StringsKt.equals(str2, "Indonesia", true)) {
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{str, str2});
            ArrayList arrayList = new ArrayList();
            for (Object obj : listListOf) {
                if (!StringsKt.isBlank((String) obj)) {
                    int i8 = search + 101;
                    getNotifyChildrenChangedOptions = i8 % 128;
                    int i9 = i8 % 2;
                    arrayList.add(obj);
                }
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
        }
        if (!StringsKt.isBlank(str3)) {
            int i10 = getNotifyChildrenChangedOptions + 39;
            search = i10 % 128;
            int i11 = i10 % 2;
            return str;
        }
        if (!StringsKt.isBlank(str2)) {
            return str2;
        }
        int i12 = search + 117;
        getNotifyChildrenChangedOptions = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 64 / 0;
        }
        return "";
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String p0) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 65;
        search = i2 % 128;
        int i3 = i2 % 2;
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_document_failed, "", p0, string, null, 112);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i4 = search + 19;
            getNotifyChildrenChangedOptions = i4 % 128;
            if (i4 % 2 != 0) {
                getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                throw null;
            }
            getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        int i5 = search + 111;
        getNotifyChildrenChangedOptions = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 119;
        search = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        if (((acquireBuffer) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).isDisposed()) {
            return;
        }
        ((acquireBuffer) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).dispose();
        int i4 = search + 9;
        getNotifyChildrenChangedOptions = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        final DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity = (DeviceUnlinkingLivenessActivity) objArr[0];
        int i = 2 % 2;
        DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity2 = deviceUnlinkingLivenessActivity;
        ((AppCompatSpinnerDropDownAdapter) deviceUnlinkingLivenessActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(deviceUnlinkingLivenessActivity2, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: AppCompatRadioButtonInspectionCompanion
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingLivenessActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((AppCompatSpinnerDropDownAdapter) deviceUnlinkingLivenessActivity.b.getValue()).f66a.observe(deviceUnlinkingLivenessActivity2, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: drawTickMarks
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((AppCompatSpinnerDropDownAdapter) deviceUnlinkingLivenessActivity.b.getValue()).asInterface.observe(deviceUnlinkingLivenessActivity2, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: setTickMarkTintList
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((AppCompatSpinnerDropDownAdapter) deviceUnlinkingLivenessActivity.b.getValue()).TuitionPaymentFragmentbindingInflater1.observe(deviceUnlinkingLivenessActivity2, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: getTickMarkTintMode
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingLivenessActivity.b(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        VideoRecordEventStart<TwilightManager> videoRecordEventStartHide = ((checkShowingFlags) deviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.hide();
        Intrinsics.checkNotNullExpressionValue(videoRecordEventStartHide, "");
        VideoRecordEventStart<TwilightManager> videoRecordEventStartObserveOn = videoRecordEventStartHide.observeOn(dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1());
        final Function1 function1 = new Function1() { // from class: getDropDownWidth
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingLivenessActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (TwilightManager) obj);
            }
        };
        logToString<? super TwilightManager> logtostring = new logToString() { // from class: getDropDownVerticalOffset
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                Object[] objArr2 = {function1, obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                DeviceUnlinkingLivenessActivity.b(objArr2, 1970967672, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1970967665);
            }
        };
        final Function1 function2 = new Function1() { // from class: compatMeasureContentWidth
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartObserveOn.subscribe(logtostring, new logToString() { // from class: AppCompatSpinner
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                DeviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        ((acquireBuffer) deviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
        int i2 = getNotifyChildrenChangedOptions + 17;
        search = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (29944 - TextUtils.indexOf("", ""));
            int i2 = 1755 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int modifierMetaStateMask = 22 - ((byte) KeyEvent.getModifierMetaStateMask());
            byte[] bArr = $$a;
            byte b = bArr[5];
            Object[] objArr2 = new Object[1];
            c(b, (byte) (b | 14), bArr[28], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i2, modifierMetaStateMask, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i3 = getNotifyChildrenChangedOptions + 99;
            search = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29944);
                int packedPositionChild = 1754 - ExpandableListView.getPackedPositionChild(0L);
                int i5 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22;
                byte[] bArr2 = $$a;
                byte b2 = bArr2[5];
                byte b3 = bArr2[7];
                Object[] objArr3 = new Object[1];
                c(b2, b3, (short) (b3 | 36), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, packedPositionChild, i5, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i6 = (((-750631223) + (((~((-598597877) | startElapsedRealtime)) | 548151364) * 1504)) + ((~(startElapsedRealtime | (-50446513))) * (-1504))) - 843667255;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{53476, 62662, 39082, 48276, 16388, 25647, 2073, 11775, 61857, 38353, 47431, 23860, 24849, 1775, 10965, 52868}, AndroidCharacter.getMirror('0') + 9209, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{53479, 6395, 16585, 35027, 61630, 14514, 24732, 43136, 36942, 55414, 'W', 18525, 45057, 63548, 8196, 26644}, 51217 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {1129751259};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42050 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1727, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -2020970279, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char maximumDrawingCacheSize = (char) (29944 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    int mirror = AndroidCharacter.getMirror('0') + 1707;
                    int bitsPerPixel = 22 - ImageFormat.getBitsPerPixel(0);
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[5];
                    byte b5 = bArr3[7];
                    Object[] objArr8 = new Object[1];
                    c(b4, b5, (short) (b5 | 36), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumDrawingCacheSize, mirror, bitsPerPixel, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{53487, 32065, 35752, 55327, 26213, 46274, 49452, 28615, 48617, 51796, 6378, 42294, 62331, 464, 44596, 64644, 2803, 22396, 58800, 12818, 16505, 61136}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.input_3).substring(3, 4).codePointAt(0) + 44332, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{53483, 20063, 60821, 3273, 43529, 51546, 26756, 34807, 9475, 17482, 58240, 741, 41019, 57210, 32445}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.kioson_instruction_step3).substring(25, 26).length() + 40636, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char mode = (char) (29944 - View.MeasureSpec.getMode(0));
                        int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 1755;
                        int iIndexOf2 = TextUtils.indexOf("", "") + 23;
                        byte[] bArr4 = $$a;
                        byte b6 = bArr4[5];
                        byte b7 = bArr4[7];
                        Object[] objArr11 = new Object[1];
                        c(b6, b7, (short) (b7 | 88), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mode, iIndexOf, iIndexOf2, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) (29944 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        int iArgb = Color.argb(0, 0, 0, 0) + 1755;
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23;
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[5];
                        Object[] objArr12 = new Object[1];
                        c(b8, (byte) (b8 | 14), bArr5[28], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, iArgb, doubleTapTimeout, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                arrayList.add(str);
            }
            throw null;
        }
        int i9 = search + 59;
        getNotifyChildrenChangedOptions = i9 % 128;
        int i10 = i9 % 2;
        int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int i12 = ~((int) Process.getStartElapsedRealtime());
        int i13 = i11 + (-714779453) + ((~((-676432018) | i12)) * (-783)) + (((~(i12 | (-735165084))) | (-947767510)) * 783);
        int i14 = (i13 << 13) ^ i13;
        int i15 = i14 ^ (i14 >>> 17);
        ((int[]) objArr13[3])[0] = i15 ^ (i15 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int packedPositionChild2 = 1030 - ExpandableListView.getPackedPositionChild(0L);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 15;
            byte[] bArr6 = $$a;
            byte b9 = bArr6[5];
            byte b10 = bArr6[7];
            Object[] objArr14 = new Object[1];
            c(b9, b10, (short) (b10 | 140), objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(longPressTimeout, packedPositionChild2, packedPositionGroup, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new char[]{53487, 32065, 35752, 55327, 26213, 46274, 49452, 28615, 48617, 51796, 6378, 42294, 62331, 464, 44596, 64644, 2803, 22396, 58800, 12818, 16505, 61136}, ExpandableListView.getPackedPositionType(0L) + 44449, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new char[]{53483, 20063, 60821, 3273, 43529, 51546, 26756, 34807, 9475, 17482, 58240, 741, 41019, 57210, 32445}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 40530, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
            int i16 = 1031 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 15;
            byte[] bArr7 = $$a;
            byte b11 = bArr7[5];
            byte b12 = bArr7[7];
            Object[] objArr17 = new Object[1];
            c(b11, b12, (short) (b12 | 36), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf2, i16, windowTouchSlop, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1032;
                int packedPositionGroup2 = 15 - ExpandableListView.getPackedPositionGroup(0L);
                byte b13 = $$a[7];
                Object[] objArr18 = new Object[1];
                c(b13, (byte) (b13 | 52), (short) DerHeader.TAG_CLASS_PRIVATE, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(offsetAfter, iLastIndexOf, packedPositionGroup2, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i17 = ((int[]) objArr19[3])[0];
            int i18 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i19 = ~System.identityHashCode(this);
            int i20 = 1183626629 + ((~(134080487 | i19)) * 52) + (((~(113107907 | i19)) | (~((-131172263) | i19)) | 20972580) * (-52)) + (((~(i19 | (-113107908))) | 2908225) * 52) + 355811316;
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr[2])[0] = i22 ^ (i22 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(new char[]{53476, 62662, 39082, 48276, 16388, 25647, 2073, 11775, 61857, 38353, 47431, 23860, 24849, 1775, 10965, 52868}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_7).substring(0, 2).length() + 9255, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new char[]{53479, 6395, 16585, 35027, 61630, 14514, 24732, 43136, 36942, 55414, 'W', 18525, 45057, 63548, 8196, 26644}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 51206, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {1129751259};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 46038), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1134, TextUtils.getOffsetBefore("", 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 355811316, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char size = (char) View.MeasureSpec.getSize(0);
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1031;
                int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15;
                byte[] bArr8 = $$a;
                byte b14 = bArr8[5];
                byte b15 = bArr8[7];
                Object[] objArr24 = new Object[1];
                c(b14, b15, (short) (b15 | 140), objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(size, absoluteGravity, maximumDrawingCacheSize2, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 1117, 17 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), Boolean.TYPE});
            }
            Object[] objArr25 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                int iRed = 1031 - Color.red(0);
                int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 16;
                byte b16 = $$a[7];
                Object[] objArr26 = new Object[1];
                c(b16, (byte) (b16 | 52), (short) DerHeader.TAG_CLASS_PRIVATE, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(bitsPerPixel2, iRed, bitsPerPixel3, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr25);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{53487, 32065, 35752, 55327, 26213, 46274, 49452, 28615, 48617, 51796, 6378, 42294, 62331, 464, 44596, 64644, 2803, 22396, 58800, 12818, 16505, 61136}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_6).substring(0, 1).codePointAt(0) + 44369, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{53483, 20063, 60821, 3273, 43529, 51546, 26756, 34807, 9475, 17482, 58240, 741, 41019, 57210, 32445}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.preview_prima).substring(1, 3).length() + 40635, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cRed = (char) Color.red(0);
                    int packedPositionType = 1031 - ExpandableListView.getPackedPositionType(0L);
                    int i23 = 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte[] bArr9 = $$a;
                    byte b17 = bArr9[5];
                    byte b18 = bArr9[7];
                    Object[] objArr29 = new Object[1];
                    c(b17, b18, (short) (b18 | 36), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cRed, packedPositionType, i23, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char offsetAfter2 = (char) TextUtils.getOffsetAfter("", 0);
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1031;
                    int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 15;
                    byte[] bArr10 = $$a;
                    byte b19 = bArr10[5];
                    byte b20 = bArr10[7];
                    Object[] objArr30 = new Object[1];
                    c(b19, b20, (short) (b20 | 140), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(offsetAfter2, tapTimeout, doubleTapTimeout2, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr = objArr25;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i24 = ((int[]) objArr[1])[0];
        int i25 = ((int[]) objArr[3])[0];
        if (i25 == i24) {
            int i26 = getNotifyChildrenChangedOptions + 3;
            search = i26 % 128;
            int i27 = i26 % 2;
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr[2])[0];
            int i29 = ((int[]) objArr[3])[0];
            int i30 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int i31 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
            int i32 = i28 + (-637077238) + (((~((~i31) | (-364375600))) | (-120095430)) * (-235)) + (((~((-364375600) | i31)) | (-120095430)) * (-470)) + (((~(i31 | (-86016518))) | (-398454512)) * 235);
            int i33 = i32 ^ (i32 << 13);
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr31[2])[0] = i34 ^ (i34 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i35 = getNotifyChildrenChangedOptions;
            int i36 = i35 + 123;
            search = i36 % 128;
            int i37 = 2;
            int i38 = i36 % 2;
            int i39 = i35 + 7;
            search = i39 % 128;
            int i40 = i39 % 2;
            int i41 = 0;
            while (i41 < strArr4.length) {
                int i42 = search + 55;
                getNotifyChildrenChangedOptions = i42 % 128;
                if (i42 % i37 != 0) {
                    arrayList2.add(strArr4[i41]);
                    i41 += 120;
                } else {
                    arrayList2.add(strArr4[i41]);
                    i41++;
                }
                i37 = 2;
            }
        }
        Toast.makeText((Context) null, i25 / (((i25 - 1) * i25) % 2), 0).show();
        Object[] objArr32 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i43 = ((int[]) objArr[2])[0];
        int i44 = ((int[]) objArr[3])[0];
        int i45 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i46 = i43 + ((((~(99413935 | iIdentityHashCode)) | (-294696119)) * 262) - 1840193123) + (((~((~iIdentityHashCode) | 99413935)) | (-294696119)) * 262);
        int i47 = i46 ^ (i46 << 13);
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr32[2])[0] = i48 ^ (i48 << 5);
        int i49 = search + 17;
        getNotifyChildrenChangedOptions = i49 % 128;
        int i50 = i49 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0099, code lost:
    
        if (r2 != ((((r6 | r4) * (-252)) + 1263850440) + ((r4 | (~(r5 | (-1363421203)))) * 252))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x009b, code lost:
    
        super.onResume();
        r8 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity.getNotifyChildrenChangedOptions + 125;
        com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity.search = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a7, code lost:
    
        if ((r8 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a9, code lost:
    
        r8 = 12 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ac, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ad, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ae, code lost:
    
        r8 = (-1550601520) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b7, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003e, code lost:
    
        if (r2 == (((550387624 + (((~((-543262442) | r4)) | 539067945) * 1504)) + ((~(r4 | (-4194497))) * (-1504))) - 389745504)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0069, code lost:
    
        if (r2 == (((-2110006137) + (((~(r4 | (-1835009212))) | 1005021668) * 191)) + (((~((~r4) | (-1835009212))) | 694157472) * 191))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006b, code lost:
    
        r2 = ((java.lang.reflect.Field) defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r4 = (int) android.os.Process.getStartElapsedRealtime();
        r5 = ~r4;
        r6 = (~((-1937681848) | r5)) | 574260645;
        r4 = ~(r4 | 2004795319);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r8) throws java.lang.IllegalAccessException {
        /*
            r0 = 0
            r8 = r8[r0]
            com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity r8 = (com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity) r8
            r1 = 2
            int r2 = r1 % r1
            int r2 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity.search
            int r2 = r2 + 9
            int r3 = r2 % 128
            com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity.getNotifyChildrenChangedOptions = r3
            int r2 = r2 % r1
            r3 = 0
            if (r2 == 0) goto L41
            java.lang.reflect.Member[] r2 = defpackage.cacheInteropConfig.b
            r2 = r2[r0]
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            int r2 = r2.getInt(r3)
            long r4 = android.os.SystemClock.elapsedRealtime()
            int r4 = (int) r4
            r5 = -543262442(0xffffffffdf9e7916, float:-2.2838365E19)
            r5 = r5 | r4
            int r5 = ~r5
            r6 = 539067945(0x20218629, float:1.368162E-19)
            r5 = r5 | r6
            int r5 = r5 * 1504
            r6 = 550387624(0x20ce3fa8, float:3.4939882E-19)
            int r6 = r6 + r5
            r5 = -4194497(0xffffffffffbfff3f, float:NaN)
            r4 = r4 | r5
            int r4 = ~r4
            int r4 = r4 * (-1504)
            int r6 = r6 + r4
            r4 = -389745504(0xffffffffe8c4f4a0, float:-7.440771E24)
            int r6 = r6 + r4
            if (r2 != r6) goto Lae
            goto L6b
        L41:
            java.lang.reflect.Member[] r2 = defpackage.cacheInteropConfig.b
            r2 = r2[r0]
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            int r2 = r2.getInt(r3)
            int r4 = android.os.Process.myTid()
            r5 = -1835009212(0xffffffff929ffb44, float:-1.0096252E-27)
            r6 = r4 | r5
            int r6 = ~r6
            r7 = 1005021668(0x3be769e4, float:0.0070621837)
            r6 = r6 | r7
            int r6 = r6 * 191
            r7 = -2110006137(0xffffffff823bdc87, float:-1.3801878E-37)
            int r7 = r7 + r6
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = ~r4
            r5 = 694157472(0x296000a0, float:4.9738534E-14)
            r4 = r4 | r5
            int r4 = r4 * 191
            int r7 = r7 + r4
            if (r2 != r7) goto Lae
        L6b:
            java.lang.reflect.Member[] r2 = defpackage.generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r2 = r2[r0]
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            int r2 = r2.getInt(r3)
            long r4 = android.os.Process.getStartElapsedRealtime()
            int r4 = (int) r4
            int r5 = ~r4
            r6 = -1937681848(0xffffffff8c815248, float:-1.9925118E-31)
            r6 = r6 | r5
            int r6 = ~r6
            r7 = 574260645(0x223a85a5, float:2.5278451E-18)
            r6 = r6 | r7
            r7 = 2004795319(0x777ebfb7, float:5.1669213E33)
            r4 = r4 | r7
            int r4 = ~r4
            r6 = r6 | r4
            int r6 = r6 * (-252)
            r7 = 1263850440(0x4b54d3c8, float:1.3947848E7)
            int r6 = r6 + r7
            r7 = -1363421203(0xffffffffaebbd7ed, float:-8.5421316E-11)
            r5 = r5 | r7
            int r5 = ~r5
            r4 = r4 | r5
            int r4 = r4 * 252
            int r6 = r6 + r4
            if (r2 != r6) goto Lad
            super.onResume()
            int r8 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity.getNotifyChildrenChangedOptions
            int r8 = r8 + 125
            int r2 = r8 % 128
            com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity.search = r2
            int r8 = r8 % r1
            if (r8 != 0) goto Lac
            r8 = 12
            int r8 = r8 / r0
        Lac:
            return r3
        Lad:
            throw r3
        Lae:
            r8 = -1550601520(0xffffffffa393b2d0, float:-1.6013502E-17)
            int r8 = r8 % r1
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity.b(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00bc, code lost:
    
        if (r1 != (((1621619841 + ((((~((-450625538) | r3)) | (~((-604045659) | r2))) | (~((-1073759233) | r2))) * 765)) + (((~((-1054671196) | r3)) | 450625537) * 1530)) + (((~(r2 | (-1054671196))) | (~(r3 | (-1073759233)))) * 765))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00be, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity.search + 111;
        com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity.getNotifyChildrenChangedOptions = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ca, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00cb, code lost:
    
        r1 = 417487146 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d4, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d5, code lost:
    
        r1 = 70350540 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00de, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0043, code lost:
    
        if (r1 == (((467306512 + (((~((~r4) | (-553649345))) | (~((-1107895042) | r4))) * (-302))) + ((~((-553649345) | r4)) * (-604))) + (((~(r4 | (-1661544386))) | (-1939451884)) * 302))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007e, code lost:
    
        if (r1 == (((293448008 + ((~(1386184159 | r4)) * 623)) + (((~r4) | 1314816) * (-623))) + (((~(r4 | 278755716)) | ((~(1108743259 | r4)) | (-1386184160))) * 623))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0080, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r2 = java.lang.System.identityHashCode(r9);
        r3 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.membership.devicebinding.DeviceUnlinkingLivenessActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 99;
        search = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ~((int) SystemClock.uptimeMillis());
        if (i4 != (-2120183224) + ((~((-1098914840) | i5)) * 52) + (((~(340771680 | i5)) | (~(1170759223 | i5)) | (-1439686520)) * (-52)) + (((~(i5 | (-340771681))) | 71844384) * 52)) {
            throw null;
        }
        int i6 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i7 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        int i8 = ~i7;
        int i9 = 1043524908 + (((~((-566314338) | i8)) | (~(1643212267 | i7))) * 520);
        int i10 = ~((-1643212268) | i8);
        int i11 = ~(i7 | 935843697);
        if (i6 != i9 + ((i10 | i11) * (-1040)) + ((i11 | (~(i8 | (-935843698))) | 1076897930) * 520)) {
            throw null;
        }
        super.onCreate(bundle);
        int i12 = getNotifyChildrenChangedOptions + 59;
        search = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity = (DeviceUnlinkingLivenessActivity) objArr[0];
        int i = 2 % 2;
        int i2 = search + 111;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 == 0) {
            return deviceUnlinkingLivenessActivity.getIntent().getStringExtra("KEY_LONGITUDE");
        }
        deviceUnlinkingLivenessActivity.getIntent().getStringExtra("KEY_LONGITUDE");
        throw null;
    }

    public static /* synthetic */ String b(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity) {
        int i = 2 % 2;
        String stringExtra = deviceUnlinkingLivenessActivity.getIntent().getStringExtra("key_nik");
        if (stringExtra == null) {
            int i2 = search + 27;
            getNotifyChildrenChangedOptions = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            stringExtra = "";
        }
        int i3 = getNotifyChildrenChangedOptions + 99;
        search = i3 % 128;
        int i4 = i3 % 2;
        return stringExtra;
    }

    public static /* synthetic */ Unit b(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            deviceUnlinkingLivenessActivity.MediaBrowserCompat();
            int i2 = getNotifyChildrenChangedOptions + 1;
            search = i2 % 128;
            int i3 = i2 % 2;
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            deviceUnlinkingLivenessActivity.IconCompatParcelizer();
            if (deviceUnlinkingLivenessActivity.asInterface && ((onRestoreInstanceState) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                DeviceUnlinkingSuccessActivity.Companion tuitionPaymentFragmentbindingInflater1 = DeviceUnlinkingSuccessActivity.INSTANCE;
                DeviceUnlinkingSuccessActivity.Companion.TuitionPaymentFragmentbindingInflater1(deviceUnlinkingLivenessActivity, (String) deviceUnlinkingLivenessActivity.RemoteActionCompatParcelizer.getValue());
                deviceUnlinkingLivenessActivity.finish();
            } else {
                deviceUnlinkingLivenessActivity.cancelAll();
                int i4 = getNotifyChildrenChangedOptions + 11;
                search = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 / 5;
                }
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            deviceUnlinkingLivenessActivity.IconCompatParcelizer();
            String string = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (string == null) {
                string = deviceUnlinkingLivenessActivity.getString(R.string.error_general);
                Intrinsics.checkNotNullExpressionValue(string, "");
            }
            deviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(string);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = getNotifyChildrenChangedOptions + 59;
        search = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 39;
        search = i2 % 128;
        int i3 = i2 % 2;
        BookingAntreanFormActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = BookingAntreanFormActivity.INSTANCE;
        DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity2 = deviceUnlinkingLivenessActivity;
        String str = (String) deviceUnlinkingLivenessActivity.a.getValue();
        String str2 = (String) deviceUnlinkingLivenessActivity.asBinder.getValue();
        String str3 = (String) deviceUnlinkingLivenessActivity.notify.getValue();
        String str4 = (String) deviceUnlinkingLivenessActivity.INotificationSideChannel.getValue();
        String str5 = (String) deviceUnlinkingLivenessActivity.cancel.getValue();
        String str6 = (String) deviceUnlinkingLivenessActivity.cancelAll.getValue();
        Intrinsics.checkNotNull(str6);
        String str7 = (String) deviceUnlinkingLivenessActivity.getInterfaceDescriptor.getValue();
        Intrinsics.checkNotNull(str7);
        String str8 = Intrinsics.areEqual((String) deviceUnlinkingLivenessActivity.onTransact.getValue(), "KTP_BIOMETRIK_KPJ") ? "PU" : "BPU";
        String str9 = (String) deviceUnlinkingLivenessActivity.RemoteActionCompatParcelizer.getValue();
        if (str9 == null) {
            int i4 = search + 73;
            getNotifyChildrenChangedOptions = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            str9 = "";
        }
        BookingAntreanFormActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(deviceUnlinkingLivenessActivity2, str, str2, str3, str4, str5, str6, str7, "DEVBIND", str8, str9);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        String stringExtra = ((DeviceUnlinkingLivenessActivity) objArr[0]).getIntent().getStringExtra("email");
        if (stringExtra == null) {
            int i2 = search + 119;
            getNotifyChildrenChangedOptions = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            stringExtra = "";
        }
        int i3 = search + 39;
        getNotifyChildrenChangedOptions = i3 % 128;
        int i4 = i3 % 2;
        return stringExtra;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            deviceUnlinkingLivenessActivity.MediaBrowserCompat();
        } else {
            Object obj = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                int i2 = search + 7;
                getNotifyChildrenChangedOptions = i2 % 128;
                int i3 = i2 % 2;
                deviceUnlinkingLivenessActivity.IconCompatParcelizer();
                if (deviceUnlinkingLivenessActivity.asInterface && ((SubmitDeviceBindingResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getIsSuccessful()) {
                    int i4 = search + 41;
                    getNotifyChildrenChangedOptions = i4 % 128;
                    if (i4 % 2 != 0) {
                        DeviceUnlinkingSuccessActivity.Companion tuitionPaymentFragmentbindingInflater1 = DeviceUnlinkingSuccessActivity.INSTANCE;
                        DeviceUnlinkingSuccessActivity.Companion.TuitionPaymentFragmentbindingInflater1(deviceUnlinkingLivenessActivity, (String) deviceUnlinkingLivenessActivity.RemoteActionCompatParcelizer.getValue());
                        deviceUnlinkingLivenessActivity.finish();
                        throw null;
                    }
                    DeviceUnlinkingSuccessActivity.Companion tuitionPaymentFragmentbindingInflater2 = DeviceUnlinkingSuccessActivity.INSTANCE;
                    DeviceUnlinkingSuccessActivity.Companion.TuitionPaymentFragmentbindingInflater1(deviceUnlinkingLivenessActivity, (String) deviceUnlinkingLivenessActivity.RemoteActionCompatParcelizer.getValue());
                    deviceUnlinkingLivenessActivity.finish();
                } else {
                    deviceUnlinkingLivenessActivity.cancelAll();
                }
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                int i5 = getNotifyChildrenChangedOptions + 119;
                search = i5 % 128;
                if (i5 % 2 == 0) {
                    deviceUnlinkingLivenessActivity.IconCompatParcelizer();
                    String str = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    obj.hashCode();
                    throw null;
                }
                deviceUnlinkingLivenessActivity.IconCompatParcelizer();
                String string = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (string == null) {
                    string = deviceUnlinkingLivenessActivity.getString(R.string.error_general);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                }
                deviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(string);
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = search + 1;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(obj);
            return null;
        }
        function1.invoke(obj);
        int i3 = 37 / 0;
        return null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity, TwilightManager twilightManager) {
        byte[] imageBytes;
        List<byte[]> listEmptyList;
        String str;
        String str2;
        int i = 2 % 2;
        Object obj = null;
        if (twilightManager instanceof TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = getNotifyChildrenChangedOptions + 117;
            search = i2 % 128;
            if (i2 % 2 == 0) {
                TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1) twilightManager;
                List<byte[]> list = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.getImageBytes();
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.getAdditionalImages();
                obj.hashCode();
                throw null;
            }
            TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1) twilightManager;
            List<byte[]> list2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            byte[] imageBytes2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.getImageBytes();
            List<byte[]> additionalImages = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.getAdditionalImages();
            if (additionalImages == null || (listEmptyList = CollectionsKt.toList(additionalImages)) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (!listEmptyList.isEmpty()) {
                list2 = listEmptyList;
            }
            if (imageBytes2 != null) {
                deviceUnlinkingLivenessActivity.MediaBrowserCompat.add(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(imageBytes2, deviceUnlinkingLivenessActivity));
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                int i3 = getNotifyChildrenChangedOptions + 39;
                search = i3 % 128;
                if (i3 % 2 == 0) {
                    byte[] bArr = (byte[]) it.next();
                    Intrinsics.checkNotNull(bArr);
                    deviceUnlinkingLivenessActivity.MediaBrowserCompat.add(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr, deviceUnlinkingLivenessActivity));
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr2 = (byte[]) it.next();
                Intrinsics.checkNotNull(bArr2);
                deviceUnlinkingLivenessActivity.MediaBrowserCompat.add(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bArr2, deviceUnlinkingLivenessActivity));
            }
            deviceUnlinkingLivenessActivity.INotificationSideChannelDefault = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.getTransactionId();
            deviceUnlinkingLivenessActivity.INotificationSideChannelStub = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.getLivenessScore());
            deviceUnlinkingLivenessActivity.INotificationSideChannelStubProxy = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.getManipulationScore());
            String str3 = (String) deviceUnlinkingLivenessActivity.RemoteActionCompatParcelizer.getValue();
            if (str3 != null) {
                int i4 = search + 7;
                getNotifyChildrenChangedOptions = i4 % 128;
                int i5 = i4 % 2;
                if (deviceUnlinkingLivenessActivity.MediaBrowserCompat.isEmpty()) {
                    String string = deviceUnlinkingLivenessActivity.getString(R.string.error_message_selfie_photo_required);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    deviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(string);
                } else {
                    String str4 = deviceUnlinkingLivenessActivity.read;
                    StringBuilder sb = new StringBuilder("JMO#");
                    sb.append(str4);
                    sb.append("#true#70#");
                    sb.append(str3);
                    String string2 = sb.toString();
                    String str5 = Build.BRAND;
                    Intrinsics.checkNotNullExpressionValue(str5, "");
                    String string3 = Settings.Secure.getString(deviceUnlinkingLivenessActivity.getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string3, "");
                    String str6 = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(str6, "");
                    String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
                    String str7 = Build.MANUFACTURER;
                    Intrinsics.checkNotNullExpressionValue(str7, "");
                    File file = (File) CollectionsKt.getOrNull(deviceUnlinkingLivenessActivity.MediaBrowserCompat, 0);
                    File file2 = (File) CollectionsKt.getOrNull(deviceUnlinkingLivenessActivity.MediaBrowserCompat, 1);
                    if (file2 == null) {
                        int i6 = getNotifyChildrenChangedOptions + 105;
                        search = i6 % 128;
                        file2 = i6 % 2 == 0 ? (File) CollectionsKt.getOrNull(deviceUnlinkingLivenessActivity.MediaBrowserCompat, 0) : (File) CollectionsKt.getOrNull(deviceUnlinkingLivenessActivity.MediaBrowserCompat, 0);
                    }
                    File file3 = file2;
                    File file4 = (File) CollectionsKt.getOrNull(deviceUnlinkingLivenessActivity.MediaBrowserCompat, 2);
                    if (file4 == null) {
                        file4 = (File) CollectionsKt.getOrNull(deviceUnlinkingLivenessActivity.MediaBrowserCompat, 0);
                    }
                    File file5 = file4;
                    String str8 = (String) deviceUnlinkingLivenessActivity.a.getValue();
                    String str9 = (String) deviceUnlinkingLivenessActivity.d.getValue();
                    String str10 = deviceUnlinkingLivenessActivity.INotificationSideChannelDefault;
                    if (str10 == null) {
                        int i7 = getNotifyChildrenChangedOptions + 47;
                        search = i7 % 128;
                        int i8 = i7 % 2;
                        str = "";
                    } else {
                        str = str10;
                    }
                    String str11 = deviceUnlinkingLivenessActivity.INotificationSideChannelStub;
                    String str12 = str11 == null ? "" : str11;
                    String str13 = deviceUnlinkingLivenessActivity.INotificationSideChannelStubProxy;
                    if (str13 == null) {
                        int i9 = getNotifyChildrenChangedOptions + 117;
                        search = i9 % 128;
                        int i10 = i9 % 2;
                        str2 = "";
                    } else {
                        str2 = str13;
                    }
                    LivenessEndRequest livenessEndRequest = new LivenessEndRequest(string2, str5, string3, str6, strValueOf, str7, file, file3, file5, str8, str9, "", str, str12, str2, deviceUnlinkingLivenessActivity.write, deviceUnlinkingLivenessActivity.IconCompatParcelizer, deviceUnlinkingLivenessActivity.g());
                    final AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter = (AppCompatSpinnerDropDownAdapter) deviceUnlinkingLivenessActivity.b.getValue();
                    Intrinsics.checkNotNullParameter(str3, "");
                    Intrinsics.checkNotNullParameter(livenessEndRequest, "");
                    MutableLiveData<VirtualCameraAdapter1<LivenessEndResponse>> mutableLiveData = appCompatSpinnerDropDownAdapter.f66a;
                    VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                    deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(appCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str3, livenessEndRequest)));
                    final Function1 function1 = new Function1() { // from class: unregisterDataSetObserver
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2(appCompatSpinnerDropDownAdapter, (LivenessEndResponse) obj2);
                        }
                    };
                    logToString logtostring = new logToString() { // from class: isVisibleToUser
                        @Override // defpackage.logToString
                        public final void accept(Object obj2) {
                            AppCompatSpinnerDropDownAdapter.d(function1, obj2);
                        }
                    };
                    final Function1 function2 = new Function1() { // from class: AppCompatSpinnerDropdownPopup3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(appCompatSpinnerDropDownAdapter, (Throwable) obj2);
                        }
                    };
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: AppCompatSpinnerDropdownPopup1
                        @Override // defpackage.logToString
                        public final void accept(Object obj2) {
                            AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function2, obj2);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                    appCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            } else {
                String string4 = deviceUnlinkingLivenessActivity.getString(R.string.error_transaction_id_missing);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                deviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(string4);
            }
        } else {
            if (!(twilightManager instanceof TwilightManager.TuitionPaymentFragmentbindingInflater1)) {
                throw new NoWhenBranchMatchedException();
            }
            int i11 = getNotifyChildrenChangedOptions + 67;
            search = i11 % 128;
            if (i11 % 2 == 0) {
                ((TwilightManager.TuitionPaymentFragmentbindingInflater1) twilightManager).b.getImageBytes();
                throw null;
            }
            TwilightManager.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TwilightManager.TuitionPaymentFragmentbindingInflater1) twilightManager;
            if (tuitionPaymentFragmentbindingInflater1.b.getImageBytes() != null && (imageBytes = tuitionPaymentFragmentbindingInflater1.b.getImageBytes()) != null) {
                deviceUnlinkingLivenessActivity.MediaBrowserCompat.add(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(imageBytes, deviceUnlinkingLivenessActivity));
                int i12 = getNotifyChildrenChangedOptions + 93;
                search = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str14 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i14);
            sb2.append(": ");
            sb2.append(str14);
            deviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb2.toString());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity, View view) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 83;
        search = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                deviceUnlinkingLivenessActivity.onBackPressed();
                ViewPortBuilder.b();
                int i4 = 15 / 0;
            } else {
                deviceUnlinkingLivenessActivity.onBackPressed();
                ViewPortBuilder.b();
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ String g(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity) {
        int i = 2 % 2;
        int i2 = search + 11;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = deviceUnlinkingLivenessActivity.getIntent().getStringExtra("KEY_NAMA_LENGKAP");
        if (stringExtra != null) {
            return stringExtra;
        }
        int i4 = getNotifyChildrenChangedOptions + 61;
        search = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return "";
    }

    public static /* synthetic */ String TuitionPaymentFragmentbindingInflater1(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity) {
        int i = 2 % 2;
        int i2 = search + 15;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = deviceUnlinkingLivenessActivity.getIntent().getStringExtra("KEY_TEMPAT_LAHIR");
        if (stringExtra == null) {
            int i4 = search + 67;
            getNotifyChildrenChangedOptions = i4 % 128;
            int i5 = i4 % 2;
            stringExtra = "-";
        }
        int i6 = search + 45;
        getNotifyChildrenChangedOptions = i6 % 128;
        if (i6 % 2 == 0) {
            return stringExtra;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String asInterface(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 89;
        search = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = deviceUnlinkingLivenessActivity.getIntent().getStringExtra("KEY_TANGGAL_LAHIR");
        if (stringExtra != null) {
            return stringExtra;
        }
        int i4 = search + 23;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 == 0) {
            return "";
        }
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity = (DeviceUnlinkingLivenessActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 25;
        search = i2 % 128;
        if (i2 % 2 != 0) {
            return deviceUnlinkingLivenessActivity.getIntent().getStringExtra("key_jenis_form");
        }
        deviceUnlinkingLivenessActivity.getIntent().getStringExtra("key_jenis_form");
        throw null;
    }

    public static /* synthetic */ String asBinder(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity) {
        int i = 2 % 2;
        int i2 = search + 73;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = deviceUnlinkingLivenessActivity.getIntent().getStringExtra("KEY_LATITUDE");
        int i4 = getNotifyChildrenChangedOptions + 85;
        search = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    public static /* synthetic */ String cancelAll(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity) {
        int i = 2 % 2;
        int i2 = search + 77;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 != 0) {
            deviceUnlinkingLivenessActivity.getIntent().getStringExtra("KEY_ALAMAT");
            throw null;
        }
        String stringExtra = deviceUnlinkingLivenessActivity.getIntent().getStringExtra("KEY_ALAMAT");
        if (stringExtra != null) {
            return stringExtra;
        }
        int i3 = getNotifyChildrenChangedOptions + 15;
        search = i3 % 128;
        int i4 = i3 % 2;
        return "-";
    }

    public static /* synthetic */ String d(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity) {
        int i = 2 % 2;
        int i2 = search + 71;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = deviceUnlinkingLivenessActivity.getIntent().getStringExtra("key_transaction_id");
        int i4 = search + 27;
        getNotifyChildrenChangedOptions = i4 % 128;
        if (i4 % 2 == 0) {
            return stringExtra;
        }
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity, View view) {
        int i = 2 % 2;
        int i2 = search + 79;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            throw null;
        }
        String str = (String) deviceUnlinkingLivenessActivity.RemoteActionCompatParcelizer.getValue();
        if (str != null) {
            final AppCompatSpinnerDropDownAdapter appCompatSpinnerDropDownAdapter = (AppCompatSpinnerDropDownAdapter) deviceUnlinkingLivenessActivity.b.getValue();
            Intrinsics.checkNotNullParameter(str, "");
            MutableLiveData<VirtualCameraAdapter1<LivenessBeginResponse>> mutableLiveData = appCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(appCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str)));
            final Function1 function1 = new Function1() { // from class: AppCompatSpinnerSpinnerPopup
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AppCompatSpinnerDropDownAdapter.b(appCompatSpinnerDropDownAdapter, (LivenessBeginResponse) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: AppCompatTextClassifierHelperApi26Impl
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    AppCompatSpinnerDropDownAdapter.INotificationSideChannel(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: setCompoundTints
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AppCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault2(appCompatSpinnerDropDownAdapter, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: applyCompoundDrawableTint
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    AppCompatSpinnerDropDownAdapter.b(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            appCompatSpinnerDropDownAdapter.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            int i4 = getNotifyChildrenChangedOptions + 113;
            search = i4 % 128;
            int i5 = i4 % 2;
        } else {
            String string = deviceUnlinkingLivenessActivity.getString(R.string.error_transaction_id_missing);
            Intrinsics.checkNotNullExpressionValue(string, "");
            deviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(string);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = getNotifyChildrenChangedOptions + 37;
        search = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            deviceUnlinkingLivenessActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i2 = getNotifyChildrenChangedOptions + 69;
            search = i2 % 128;
            int i3 = i2 % 2;
            deviceUnlinkingLivenessActivity.IconCompatParcelizer();
            LivenessBeginResponse livenessBeginResponse = (LivenessBeginResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            List listSplit$default = StringsKt.split$default((CharSequence) livenessBeginResponse.isSuccessful(), new String[]{"#"}, false, 0, 6, (Object) null);
            List listSplit$default2 = StringsKt.split$default((CharSequence) livenessBeginResponse.isSuspend(), new String[]{"#"}, false, 0, 6, (Object) null);
            if (Intrinsics.areEqual(listSplit$default.get(0), "true")) {
                int i4 = search + 85;
                getNotifyChildrenChangedOptions = i4 % 128;
                if (i4 % 2 != 0) {
                    ((checkShowingFlags) deviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(deviceUnlinkingLivenessActivity);
                    throw null;
                }
                ((checkShowingFlags) deviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(deviceUnlinkingLivenessActivity);
            } else if (Intrinsics.areEqual(listSplit$default2.get(0), "true")) {
                int i5 = getNotifyChildrenChangedOptions + 47;
                search = i5 % 128;
                int i6 = i5 % 2;
                deviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(livenessBeginResponse.getMessage());
                int i7 = getNotifyChildrenChangedOptions + 103;
                search = i7 % 128;
                int i8 = i7 % 2;
            } else {
                deviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(livenessBeginResponse.getMessage());
            }
        } else if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2))) {
            deviceUnlinkingLivenessActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            if (StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "Anda telah mencoba verifikasi biometrik sebanyak 3 (tiga) kali sehingga proses tidak bisa dilanjutkan. Untuk informasi lebih lanjut, silakan menghubungi Kantor Cabang terdekat di kota Anda.", false, 2, (Object) null)) {
                int i9 = getNotifyChildrenChangedOptions + 3;
                search = i9 % 128;
                int i10 = i9 % 2;
                deviceUnlinkingLivenessActivity.asInterface = false;
                deviceUnlinkingLivenessActivity.INotificationSideChannel();
            } else {
                String string = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (string == null) {
                    int i11 = getNotifyChildrenChangedOptions + 91;
                    search = i11 % 128;
                    if (i11 % 2 == 0) {
                        Intrinsics.checkNotNullExpressionValue(deviceUnlinkingLivenessActivity.getString(R.string.error_general), "");
                        throw null;
                    }
                    string = deviceUnlinkingLivenessActivity.getString(R.string.error_general);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                }
                deviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(string);
            }
        }
        Unit unit = Unit.INSTANCE;
        int i12 = getNotifyChildrenChangedOptions + 3;
        search = i12 % 128;
        int i13 = i12 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity, VirtualCameraAdapter1 virtualCameraAdapter1) throws Throwable {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 61;
        search = i2 % 128;
        int i3 = i2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            deviceUnlinkingLivenessActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            deviceUnlinkingLivenessActivity.IconCompatParcelizer();
            LivenessEndResponse livenessEndResponse = (LivenessEndResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            List listSplit$default = StringsKt.split$default((CharSequence) livenessEndResponse.isSuccessful(), new String[]{"#"}, false, 0, 6, (Object) null);
            List listSplit$default2 = StringsKt.split$default((CharSequence) livenessEndResponse.isSuspend(), new String[]{"#"}, false, 0, 6, (Object) null);
            if (Intrinsics.areEqual(listSplit$default.get(0), "true") && Intrinsics.areEqual(listSplit$default2.get(0), "false")) {
                int i4 = search + 87;
                getNotifyChildrenChangedOptions = i4 % 128;
                int i5 = i4 % 2;
                deviceUnlinkingLivenessActivity.asInterface = true;
                DeviceUnlinkingSuccessActivity.Companion tuitionPaymentFragmentbindingInflater1 = DeviceUnlinkingSuccessActivity.INSTANCE;
                DeviceUnlinkingSuccessActivity.Companion.TuitionPaymentFragmentbindingInflater1(deviceUnlinkingLivenessActivity, (String) deviceUnlinkingLivenessActivity.RemoteActionCompatParcelizer.getValue());
                deviceUnlinkingLivenessActivity.finish();
            } else {
                deviceUnlinkingLivenessActivity.asInterface = false;
                deviceUnlinkingLivenessActivity.INotificationSideChannel();
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            deviceUnlinkingLivenessActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            if (!StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "Anda telah mencoba verifikasi biometrik sebanyak 3 (tiga) kali sehingga proses tidak bisa dilanjutkan. Untuk informasi lebih lanjut, silakan menghubungi Kantor Cabang terdekat di kota Anda.", false, 2, (Object) null)) {
                String string = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (string == null) {
                    int i6 = getNotifyChildrenChangedOptions + 61;
                    search = i6 % 128;
                    int i7 = i6 % 2;
                    string = deviceUnlinkingLivenessActivity.getString(R.string.error_general);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                }
                deviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(string);
            } else {
                deviceUnlinkingLivenessActivity.asInterface = false;
                deviceUnlinkingLivenessActivity.INotificationSideChannel();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i8 = getNotifyChildrenChangedOptions + 9;
        search = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 24 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity, Throwable th) throws IOException {
        int i = 2 % 2;
        int i2 = search + 5;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        getContentPaddingRight.TuitionPaymentFragmentbindingInflater1(th);
        String message = th.getMessage();
        if (message == null) {
            message = deviceUnlinkingLivenessActivity.getString(R.string.error_general);
            Intrinsics.checkNotNullExpressionValue(message, "");
        }
        deviceUnlinkingLivenessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(message);
        Unit unit = Unit.INSTANCE;
        int i4 = getNotifyChildrenChangedOptions + 97;
        search = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 43;
        search = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(obj);
            return;
        }
        function1.invoke(obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit cancel(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity) throws IOException {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 25;
        search = i2 % 128;
        int i3 = i2 % 2;
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) deviceUnlinkingLivenessActivity.g.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B == null || !camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            deviceUnlinkingLivenessActivity.write = "0.0";
            deviceUnlinkingLivenessActivity.IconCompatParcelizer = "0.0";
            ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
            int i4 = getNotifyChildrenChangedOptions + 27;
            search = i4 % 128;
            int i5 = i4 % 2;
        } else {
            deviceUnlinkingLivenessActivity.write = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
            deviceUnlinkingLivenessActivity.IconCompatParcelizer = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            deviceUnlinkingLivenessActivity.connect = camera2CameraControlExternalSyntheticLambda4B.b;
            deviceUnlinkingLivenessActivity.disconnect = camera2CameraControlExternalSyntheticLambda4B.g;
            deviceUnlinkingLivenessActivity.getItem = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            deviceUnlinkingLivenessActivity.getNotifyChildrenChangedOptions = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = deviceUnlinkingLivenessActivity.write;
            String str2 = deviceUnlinkingLivenessActivity.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("Location from cache: ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        String str3;
        int i = 2 % 2;
        String str4 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        deviceUnlinkingLivenessActivity.write = String.valueOf(userLocationComplete.b);
        deviceUnlinkingLivenessActivity.IconCompatParcelizer = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo == null || (str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
            str = "";
        } else {
            int i2 = getNotifyChildrenChangedOptions + 107;
            search = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 37 / 0;
            }
        }
        deviceUnlinkingLivenessActivity.connect = str;
        deviceUnlinkingLivenessActivity.disconnect = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 == null || (str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            int i4 = search + 85;
            getNotifyChildrenChangedOptions = i4 % 128;
            int i5 = i4 % 2;
            str2 = "";
        } else {
            int i6 = getNotifyChildrenChangedOptions + 3;
            search = i6 % 128;
            int i7 = i6 % 2;
        }
        deviceUnlinkingLivenessActivity.getItem = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 != null && (str3 = locationAddressInfo3.d) != null) {
            int i8 = getNotifyChildrenChangedOptions + 95;
            search = i8 % 128;
            int i9 = i8 % 2;
            str4 = str3;
        }
        deviceUnlinkingLivenessActivity.getNotifyChildrenChangedOptions = str4;
        String str5 = deviceUnlinkingLivenessActivity.write;
        String str6 = deviceUnlinkingLivenessActivity.IconCompatParcelizer;
        String str7 = deviceUnlinkingLivenessActivity.connect;
        String str8 = deviceUnlinkingLivenessActivity.disconnect;
        String str9 = deviceUnlinkingLivenessActivity.getItem;
        StringBuilder sb = new StringBuilder("Location from GPS: ");
        sb.append(str5);
        sb.append(", ");
        sb.append(str6);
        sb.append(", City: ");
        sb.append(str7);
        sb.append(", Province: ");
        sb.append(str8);
        sb.append(", Country: ");
        sb.append(str9);
        getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (String) b(new Object[]{deviceUnlinkingLivenessActivity}, -587216275, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 587216278);
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (String) b(new Object[]{deviceUnlinkingLivenessActivity}, 2140977970, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -2140977966);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(new Object[]{function1, obj}, 1970967672, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1970967665);
    }

    public static /* synthetic */ String a(DeviceUnlinkingLivenessActivity deviceUnlinkingLivenessActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (String) b(new Object[]{deviceUnlinkingLivenessActivity}, 30514129, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -30514124);
    }

    static {
        getSessionToken = 1;
        d();
        INSTANCE = new Companion(null);
        int i = sendCustomAction + 83;
        getSessionToken = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityDeviceUnlinkingLivenessBinding> TuitionPaymentFragmentbindingInflater1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = createButton.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Function1) b(new Object[]{this}, 1337957010, 1214409080 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_click_pay_instruction_step3).substring(0, 3).length(), (-1726490434) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1337957010);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 57;
        int i3 = i2 % 128;
        search = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 53;
        getNotifyChildrenChangedOptions = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_device_unlinking_liveness;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int length = 1590172325 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_card_number).substring(19, 20).length();
        b(new Object[]{this}, 2083106901, 1746968032 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_mobile_instruction_1).substring(4, 5).length(), createButton.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), length, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -2083106899);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = createButton.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = createButton.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        b(new Object[]{this}, -513432176, createButton.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), createButton.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 513432182);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = search + 55;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int length = 1540609848 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_full_name_empty).substring(19, 20).length();
        int length2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1195225891;
        b(new Object[]{this}, -657087745, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), length2, length, 657087746);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = search + 1;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = getNotifyChildrenChangedOptions + 101;
        search = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
    }

    static void d() {
        getItem = -7010046154746201707L;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = search + 51;
        getNotifyChildrenChangedOptions = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
        }
        return null;
    }
}
