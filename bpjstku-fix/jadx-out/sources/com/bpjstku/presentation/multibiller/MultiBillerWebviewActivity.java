package com.bpjstku.presentation.multibiller;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.graphics.Float16;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.provider.FontsContractCompat;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.android.volley.ExecutorDelivery;
import com.bpjstku.R;
import com.bpjstku.data.multibiller.model.request.MultiBillerCheckTransactionRequest;
import com.bpjstku.data.multibiller.model.response.MultiBillerCheckTransactionResponse;
import com.bpjstku.databinding.ActivityWebviewCustomBinding;
import com.bpjstku.databinding.LayoutToolbarCenterBinding;
import com.bpjstku.presentation.multibiller.MultiBillerWebviewActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.tasks.zzu;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.AutoValue_LifecycleCameraRepository_Key;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.CustomTabsSession1ExternalSyntheticLambda1;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.OutputConfigurationCompatApi28Impl;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.acquireBuffer;
import defpackage.calculateCameraUseCases;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.createExtraPreview;
import defpackage.getEventTime;
import defpackage.getHorizontalOffset;
import defpackage.initSession;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.onCaptureSessionEnd;
import defpackage.outputFormatToAudioProfile;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.retrieveConcurrentCameraIds;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\f\u0010\u0004J)\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0014¢\u0006\u0004\b \u0010\u0004R\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0018\u0010\u0006\u001a\u0006*\u00020\u00150\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\r8\u0002X\u0083D¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010,\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u0014\u0018\u00010(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0018\u0010\u0007\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010.R\u0018\u0010\t\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\b\u001a\u00020\u001a8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b,\u00101R\u0016\u00103\u001a\u00020\u00158\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b2\u0010%R\u0016\u0010$\u001a\u00020\u00158\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b4\u0010%R\u0016\u0010*\u001a\u00020\u00158\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\b\u0010%R\u0016\u0010/\u001a\u00020\u00158\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b5\u0010%R\u0016\u0010\u000b\u001a\u00020\u00158\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0016\u0010\f\u001a\u00020\u00158\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b6\u0010%R\u0016\u00107\u001a\u00020\u00158\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u00108\u001a\u00020\r8\u0002X\u0083D¢\u0006\u0006\n\u0004\b#\u0010'R\u0015\u00106\u001a\u0002098CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b:\u0010;R\u0015\u00104\u001a\u00020<8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b7\u0010;R\u0015\u0010:\u001a\u00020=8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b3\u0010;R\u0014\u0010>\u001a\u00020\r8\u0002X\u0083D¢\u0006\u0006\n\u0004\b8\u0010'R\u0014\u0010@\u001a\u00020\r8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b,\u0010?R \u0010D\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00020A8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010C"}, d2 = {"Lcom/bpjstku/presentation/multibiller/MultiBillerWebviewActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityWebviewCustomBinding;", "<init>", "()V", "", "b", "asBinder", "asInterface", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "cancelAll", "onTransact", "", "p0", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroid/view/KeyEvent;", "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "Landroid/view/MenuItem;", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onDestroy", "Landroid/content/Context;", "Landroid/content/Context;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "d", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "I", "Landroid/webkit/ValueCallback;", "Landroid/net/Uri;", "notify", "Landroid/webkit/ValueCallback;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/io/File;", "Ljava/io/File;", "cancel", "Landroid/net/Uri;", "Z", "connect", "g", "INotificationSideChannelStub", "IconCompatParcelizer", "INotificationSideChannelDefault", "INotificationSideChannel", "getInterfaceDescriptor", "LoutputFormatToAudioProfile;", "RemoteActionCompatParcelizer", "Lkotlin/Lazy;", "LCustomTabsSession1ExternalSyntheticLambda1;", "LacquireBuffer;", "INotificationSideChannelStubProxy", "()I", "write", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "MediaBrowserCompat"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultiBillerWebviewActivity extends BindingBaseActivity<ActivityWebviewCustomBinding> {
    private static char MediaBrowserCompat;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int getItem;
    private static char getNotifyChildrenChangedOptions;
    private static char read;
    private static char write;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Lazy INotificationSideChannelStub;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private String onTransact;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private String d;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String cancel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public boolean asInterface;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String INotificationSideChannel;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String cancelAll;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String notify;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public Context TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private Uri a;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    private String g;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private ValueCallback<Uri[]> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private File asBinder;
    private static final byte[] $$c = {39, -79, 42};
    private static final int $$f = 47;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {83, -4, -55, -17, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 60;
    private static int getRoot = 0;
    private static int getExtras = 0;
    private static int disconnect = 1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String b = "WebviewCustomActivity";
    private final int TuitionPaymentFragmentbindingInflater1 = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int getInterfaceDescriptor = 1234;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Lazy INotificationSideChannelDefault = LazyKt.lazy(new Function0() { // from class: createMockSessionTokenForTesting
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MultiBillerWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final int INotificationSideChannelStubProxy = 11;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke(obj);
        }
    }

    public static /* synthetic */ Object b(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = (~(i8 | i2)) | i7;
        int i10 = (~(i7 | (~i2) | i)) | (~(i8 | i7 | i2));
        int i11 = (~(i2 | i)) | (~(i6 | i));
        int i12 = i6 + i + i5 + ((-1520811122) * i3) + (1880343047 * i4);
        int i13 = i12 * i12;
        int i14 = (((-88056299) * i6) - 1254686720) + (875799021 * i) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i5) + ((-206831616) * i3) + (408289280 * i4) + ((-683737088) * i13);
        int i15 = ((i6 * (-660833811)) - 1995073173) + (i * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + (i5 * (-660833671)) + (i3 * 644061726) + (i4 * (-2012083377)) + (i13 * (-1027145728));
        switch (i14 + (i15 * i15 * 814809088)) {
            case 1:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 2:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 3:
                final MultiBillerWebviewActivity multiBillerWebviewActivity = (MultiBillerWebviewActivity) objArr[0];
                int i16 = 2 % 2;
                outputFormatToAudioProfile outputformattoaudioprofile = (outputFormatToAudioProfile) multiBillerWebviewActivity.INotificationSideChannelDefault.getValue();
                String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) Arrays.copyOf(strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length)));
                final Function1 function1 = new Function1() { // from class: CustomTabsSessionPendingSession
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MultiBillerWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (Boolean) obj);
                    }
                };
                BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: CustomTabsSessionToken
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        MultiBillerWebviewActivity.b(function1, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
                ((acquireBuffer) multiBillerWebviewActivity.RemoteActionCompatParcelizer.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
                if (ContextCompat.checkSelfPermission(multiBillerWebviewActivity, "android.permission.ACCESS_NOTIFICATION_POLICY") != 0) {
                    int i17 = getExtras + 45;
                    disconnect = i17 % 128;
                    int i18 = i17 % 2;
                    ActivityCompat.requestPermissions(multiBillerWebviewActivity, new String[]{"android.permission.ACCESS_NOTIFICATION_POLICY"}, multiBillerWebviewActivity.INotificationSideChannelStubProxy);
                    int i19 = disconnect + 45;
                    getExtras = i19 % 128;
                    int i20 = i19 % 2;
                }
                multiBillerWebviewActivity.cancelAll();
                return null;
            case 4:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 5:
                return b(objArr);
            case 6:
                return asInterface(objArr);
            default:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
    }

    private static void c(short s, byte b2, short s2, Object[] objArr) {
        int i = 145 - s2;
        byte[] bArr = $$a;
        int i2 = 98 - (s * 14);
        byte[] bArr2 = new byte[b2 + 1];
        int i3 = -1;
        if (bArr == null) {
            i2 = (b2 + (-i)) - 11;
            i++;
            i3 = -1;
        }
        while (true) {
            int i4 = i3 + 1;
            bArr2[i4] = (byte) i2;
            if (i4 == b2) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i5 = i;
            i2 = (i2 + (-bArr[i])) - 11;
            i = i5 + 1;
            i3 = i4;
        }
    }

    public MultiBillerWebviewActivity() {
        final MultiBillerWebviewActivity multiBillerWebviewActivity = this;
        this.INotificationSideChannelStub = LazyKt.lazy(new Function0<CustomTabsSession1ExternalSyntheticLambda1>() { // from class: com.bpjstku.presentation.multibiller.MultiBillerWebviewActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [CustomTabsSession1ExternalSyntheticLambda1, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final CustomTabsSession1ExternalSyntheticLambda1 invoke() {
                ComponentCallbacks componentCallbacks = multiBillerWebviewActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(CustomTabsSession1ExternalSyntheticLambda1.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.RemoteActionCompatParcelizer = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.multibiller.MultiBillerWebviewActivity$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = multiBillerWebviewActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public static final /* synthetic */ String INotificationSideChannel(MultiBillerWebviewActivity multiBillerWebviewActivity) {
        int i = 2 % 2;
        int i2 = disconnect + 63;
        int i3 = i2 % 128;
        getExtras = i3;
        int i4 = i2 % 2;
        String str = multiBillerWebviewActivity.cancel;
        int i5 = i3 + 65;
        disconnect = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        MultiBillerWebviewActivity multiBillerWebviewActivity = (MultiBillerWebviewActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = getExtras + 123;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        multiBillerWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        if (i3 != 0) {
            return null;
        }
        int i4 = 2 / 0;
        return null;
    }

    public static final /* synthetic */ String TuitionPaymentFragmentbindingInflater1(MultiBillerWebviewActivity multiBillerWebviewActivity) {
        int i = 2 % 2;
        int i2 = getExtras + 119;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        String str = multiBillerWebviewActivity.notify;
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return str;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(MultiBillerWebviewActivity multiBillerWebviewActivity, ValueCallback valueCallback) {
        int i = 2 % 2;
        int i2 = disconnect + 23;
        int i3 = i2 % 128;
        getExtras = i3;
        int i4 = i2 % 2;
        multiBillerWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = valueCallback;
        int i5 = i3 + 53;
        disconnect = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault2(MultiBillerWebviewActivity multiBillerWebviewActivity) {
        int i = 2 % 2;
        int i2 = disconnect + 93;
        int i3 = i2 % 128;
        getExtras = i3;
        int i4 = i2 % 2;
        int i5 = multiBillerWebviewActivity.TuitionPaymentFragmentbindingInflater1;
        int i6 = i3 + 97;
        disconnect = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(MultiBillerWebviewActivity multiBillerWebviewActivity, File file) {
        int i = 2 % 2;
        int i2 = disconnect + 53;
        int i3 = i2 % 128;
        getExtras = i3;
        int i4 = i2 % 2;
        multiBillerWebviewActivity.asBinder = file;
        int i5 = i3 + 103;
        disconnect = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ ValueCallback a(MultiBillerWebviewActivity multiBillerWebviewActivity) {
        int i = 2 % 2;
        int i2 = disconnect + 55;
        getExtras = i2 % 128;
        int i3 = i2 % 2;
        ValueCallback<Uri[]> valueCallback = multiBillerWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 == 0) {
            return valueCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ File asBinder(MultiBillerWebviewActivity multiBillerWebviewActivity) {
        int i = 2 % 2;
        int i2 = disconnect + 101;
        int i3 = i2 % 128;
        getExtras = i3;
        int i4 = i2 % 2;
        File file = multiBillerWebviewActivity.asBinder;
        int i5 = i3 + 63;
        disconnect = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        MultiBillerWebviewActivity multiBillerWebviewActivity = (MultiBillerWebviewActivity) objArr[0];
        int i = 2 % 2;
        int i2 = disconnect + 111;
        getExtras = i2 % 128;
        int i3 = i2 % 2;
        String str = multiBillerWebviewActivity.cancelAll;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    public static final /* synthetic */ ActivityWebviewCustomBinding b(MultiBillerWebviewActivity multiBillerWebviewActivity) {
        int i = 2 % 2;
        int i2 = disconnect + 43;
        getExtras = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ActivityWebviewCustomBinding activityWebviewCustomBinding = (ActivityWebviewCustomBinding) ((ViewBinding) multiBillerWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        int i3 = getExtras + 111;
        disconnect = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 61 / 0;
        }
        return activityWebviewCustomBinding;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        MultiBillerWebviewActivity multiBillerWebviewActivity = (MultiBillerWebviewActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getExtras + 81;
        disconnect = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        return (CustomTabsSession1ExternalSyntheticLambda1) multiBillerWebviewActivity.INotificationSideChannelStub.getValue();
    }

    public static final /* synthetic */ String d(MultiBillerWebviewActivity multiBillerWebviewActivity) {
        int i = 2 % 2;
        int i2 = getExtras;
        int i3 = i2 + 125;
        disconnect = i3 % 128;
        int i4 = i3 % 2;
        String str = multiBillerWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 125;
        disconnect = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return str;
    }

    public static final /* synthetic */ String g(MultiBillerWebviewActivity multiBillerWebviewActivity) {
        int i = 2 % 2;
        int i2 = getExtras + 87;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        String str = multiBillerWebviewActivity.onTransact;
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.multibiller.MultiBillerWebviewActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/bpjstku/presentation/multibiller/MultiBillerWebviewActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "Landroid/content/Intent;", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent b(Context p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p3, "");
            Intrinsics.checkNotNullParameter(p4, "");
            Intrinsics.checkNotNullParameter(p5, "");
            Intrinsics.checkNotNullParameter(p6, "");
            Intrinsics.checkNotNullParameter(p7, "");
            Intent intent = new Intent(p0, (Class<?>) MultiBillerWebviewActivity.class);
            intent.putExtra(ImagesContract.URL, p1);
            intent.putExtra("toolbar_title", p2);
            intent.putExtra("multibiller_token", p3);
            intent.putExtra("multibiller_transaction", p4);
            intent.putExtra("multibiller_callback", p5);
            intent.putExtra("multibiller_redirect", p6);
            intent.putExtra("multibiller_deep", p7);
            return intent;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i3 = $10 + 57;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i5 = $11 + 75;
            $10 = i5 % 128;
            int i6 = 58224;
            char c2 = 1;
            if (i5 % 2 != 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 << 1];
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            }
            int i7 = 0;
            while (i7 < 16) {
                char c3 = cArr3[c2];
                char c4 = cArr3[c];
                int i8 = (c4 + i6) ^ ((c4 << 4) + ((char) (((long) write) ^ 8611973335120459638L)));
                int i9 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getNotifyChildrenChangedOptions);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c2] = Integer.valueOf(i8);
                    objArr2[c] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char scrollBarFadeDuration = (char) (47773 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int i10 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 467;
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[c] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, i10, minimumFlingVelocity, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) MediaBrowserCompat) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(read)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47774 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 468 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    c = 0;
                    c2 = 1;
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
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 2323 - Color.argb(0, 0, 0, 0), 44 - View.resolveSize(0, 0), -1312321721, false, $$i(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = getExtras + 77;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        MultiBillerWebviewActivity$bindingInflater$1 multiBillerWebviewActivity$bindingInflater$1 = MultiBillerWebviewActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = disconnect + 125;
        getExtras = i4 % 128;
        if (i4 % 2 == 0) {
            return multiBillerWebviewActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        String stringExtra = getIntent().getStringExtra(ImagesContract.URL);
        String str = "";
        if (stringExtra == null) {
            int i2 = getExtras + 67;
            disconnect = i2 % 128;
            int i3 = i2 % 2;
            stringExtra = "";
        }
        this.g = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("toolbar_title");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.d = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("multibiller_token");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.notify = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("multibiller_transaction");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.cancel = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("multibiller_callback");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.cancelAll = stringExtra5;
        String stringExtra6 = getIntent().getStringExtra("multibiller_redirect");
        if (stringExtra6 == null) {
            int i4 = disconnect + 47;
            getExtras = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            stringExtra6 = "";
        }
        this.onTransact = stringExtra6;
        String stringExtra7 = getIntent().getStringExtra("multibiller_deep");
        if (stringExtra7 == null) {
            int i5 = disconnect + 55;
            getExtras = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str = stringExtra7;
        }
        this.INotificationSideChannel = str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004f  */
    /* JADX WARN: Code duplicated, block: B:9:0x004c A[PHI: r1
  0x004c: PHI (r1v12 com.bpjstku.databinding.LayoutToolbarCenterBinding) = (r1v11 com.bpjstku.databinding.LayoutToolbarCenterBinding), (r1v30 com.bpjstku.databinding.LayoutToolbarCenterBinding) binds: [B:8:0x004a, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        LayoutToolbarCenterBinding layoutToolbarCenterBinding;
        MaterialToolbar materialToolbar;
        TextView textView;
        int i = 2 % 2;
        int i2 = getExtras + 29;
        disconnect = i2 % 128;
        String str = null;
        if (i2 % 2 == 0) {
            MultiBillerWebviewActivity multiBillerWebviewActivity = this;
            Intrinsics.checkNotNullParameter(multiBillerWebviewActivity, "");
            multiBillerWebviewActivity.getWindow().addFlags(24753);
            layoutToolbarCenterBinding = ((ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar;
            if (layoutToolbarCenterBinding != null) {
                materialToolbar = layoutToolbarCenterBinding.toolbar;
            } else {
                materialToolbar = null;
            }
        } else {
            MultiBillerWebviewActivity multiBillerWebviewActivity2 = this;
            Intrinsics.checkNotNullParameter(multiBillerWebviewActivity2, "");
            multiBillerWebviewActivity2.getWindow().addFlags(8192);
            layoutToolbarCenterBinding = ((ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar;
            if (layoutToolbarCenterBinding != null) {
                materialToolbar = layoutToolbarCenterBinding.toolbar;
            } else {
                materialToolbar = null;
            }
        }
        TuitionPaymentFragmentbindingInflater1((Toolbar) materialToolbar, true);
        LayoutToolbarCenterBinding layoutToolbarCenterBinding2 = ((ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar;
        if (layoutToolbarCenterBinding2 == null || (textView = layoutToolbarCenterBinding2.tvToolbarTitle) == null) {
            return;
        }
        int i3 = getExtras + 31;
        int i4 = i3 % 128;
        disconnect = i4;
        if (i3 % 2 == 0) {
            str.hashCode();
            throw null;
        }
        String str2 = this.d;
        if (str2 == null) {
            int i5 = i4 + 97;
            getExtras = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i7 = getExtras + 79;
            disconnect = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str = str2;
        }
        textView.setText(str);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((CustomTabsSession1ExternalSyntheticLambda1) this.INotificationSideChannelStub.getValue()).TuitionPaymentFragmentbindingInflater1.observe(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: getCallbackBinderAssertNotNull
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiBillerWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = disconnect + 41;
        getExtras = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        Button button = ((ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnTryAgain;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getSessionTokenFromIntent
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiBillerWebviewActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        int i2 = disconnect + 103;
        getExtras = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 35 / 0;
        }
    }

    private void cancelAll() {
        int i = 2 % 2;
        onTransact();
        ((ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.setWebChromeClient(new b());
        String str = this.g;
        Object obj = null;
        if (str == null) {
            int i2 = disconnect + 117;
            getExtras = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 != 0) {
                int i4 = 13 / 0;
            }
            str = null;
        }
        ((ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.loadUrl(str);
        int i5 = disconnect + 65;
        getExtras = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public final void onLoadResource(WebView webView, String str) {
        }

        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            String str;
            MultiBillerWebviewActivity multiBillerWebviewActivity = MultiBillerWebviewActivity.this;
            Intrinsics.checkNotNull(webResourceError);
            int errorCode = webResourceError.getErrorCode();
            switch (errorCode) {
                case -15:
                    str = "Too many requests during this load";
                    break;
                case Float16.MinExponent /* -14 */:
                    str = "File not found";
                    break;
                case -13:
                    str = "Generic file error";
                    break;
                case -12:
                    str = "Check entered URL..";
                    break;
                case -11:
                    str = "Failed to perform SSL handshake";
                    break;
                case -10:
                    str = "unsupported scheme";
                    break;
                case -9:
                    str = "Too many redirects";
                    break;
                case -8:
                    str = "The server is taking too much time to communicate. Try again later.";
                    break;
                case -7:
                    str = "The server failed to communicate. Try again later.";
                    break;
                case -6:
                    str = "Error timeout..";
                    break;
                case -5:
                    str = "User authentication failed on proxy";
                    break;
                case FontsContractCompat.FontRequestCallback.FAIL_REASON_SECURITY_VIOLATION /* -4 */:
                    str = "User authentication failed on server";
                    break;
                case -3:
                    str = "Unsupported authentication scheme (not basic or digest)";
                    break;
                case -2:
                    str = "Server or proxy hostname lookup failed";
                    break;
                case -1:
                    str = "Generic error";
                    break;
                default:
                    str = null;
                    break;
            }
            if (str != null) {
                if (errorCode != -2 && errorCode != -1) {
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), str.toString(), 0).show();
                }
                if (errorCode == -2) {
                    ((ActivityWebviewCustomBinding) ((ViewBinding) multiBillerWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.loadUrl("about:blank");
                    ((ActivityWebviewCustomBinding) ((ViewBinding) multiBillerWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.setVisibility(8);
                    ((ActivityWebviewCustomBinding) ((ViewBinding) multiBillerWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).containerError.setVisibility(0);
                }
            }
        }

        @Override // android.webkit.WebViewClient
        @Deprecated(message = "Deprecated in Java")
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            MultiBillerWebviewActivity multiBillerWebviewActivity = MultiBillerWebviewActivity.this;
            String str2 = (String) MultiBillerWebviewActivity.b(-1809015077, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{multiBillerWebviewActivity}, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1809015083);
            String str3 = null;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str2 = null;
            }
            if (str.equals(str2)) {
                CustomTabsSession1ExternalSyntheticLambda1 customTabsSession1ExternalSyntheticLambda1 = (CustomTabsSession1ExternalSyntheticLambda1) MultiBillerWebviewActivity.b(2125770467, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{multiBillerWebviewActivity}, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -2125770462);
                String strINotificationSideChannel = MultiBillerWebviewActivity.INotificationSideChannel(multiBillerWebviewActivity);
                if (strINotificationSideChannel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    strINotificationSideChannel = null;
                }
                String strTuitionPaymentFragmentbindingInflater1 = MultiBillerWebviewActivity.TuitionPaymentFragmentbindingInflater1(multiBillerWebviewActivity);
                if (strTuitionPaymentFragmentbindingInflater1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    str3 = strTuitionPaymentFragmentbindingInflater1;
                }
                customTabsSession1ExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1(new MultiBillerCheckTransactionRequest(strINotificationSideChannel, str3));
                return true;
            }
            String str4 = str;
            String strG = MultiBillerWebviewActivity.g(multiBillerWebviewActivity);
            if (strG == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                strG = null;
            }
            if (StringsKt.contains$default((CharSequence) str4, (CharSequence) strG, false, 2, (Object) null)) {
                multiBillerWebviewActivity.setResult(TypedValues.PositionType.TYPE_TRANSITION_EASING);
                multiBillerWebviewActivity.finish();
                return true;
            }
            webView.loadUrl(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            String str = null;
            String string = (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString();
            if (string == null) {
                string = "";
            }
            MultiBillerWebviewActivity multiBillerWebviewActivity = MultiBillerWebviewActivity.this;
            String str2 = (String) MultiBillerWebviewActivity.b(-1809015077, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{multiBillerWebviewActivity}, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1809015083);
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str2 = null;
            }
            if (string.equals(str2)) {
                CustomTabsSession1ExternalSyntheticLambda1 customTabsSession1ExternalSyntheticLambda1 = (CustomTabsSession1ExternalSyntheticLambda1) MultiBillerWebviewActivity.b(2125770467, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{multiBillerWebviewActivity}, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -2125770462);
                String strINotificationSideChannel = MultiBillerWebviewActivity.INotificationSideChannel(multiBillerWebviewActivity);
                if (strINotificationSideChannel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    strINotificationSideChannel = null;
                }
                String strTuitionPaymentFragmentbindingInflater1 = MultiBillerWebviewActivity.TuitionPaymentFragmentbindingInflater1(multiBillerWebviewActivity);
                if (strTuitionPaymentFragmentbindingInflater1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    str = strTuitionPaymentFragmentbindingInflater1;
                }
                customTabsSession1ExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1(new MultiBillerCheckTransactionRequest(strINotificationSideChannel, str));
                return true;
            }
            String str3 = string;
            String strG = MultiBillerWebviewActivity.g(multiBillerWebviewActivity);
            if (strG == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                strG = null;
            }
            if (StringsKt.contains$default((CharSequence) str3, (CharSequence) strG, false, 2, (Object) null)) {
                multiBillerWebviewActivity.setResult(TypedValues.PositionType.TYPE_TRANSITION_EASING);
                multiBillerWebviewActivity.finish();
                return true;
            }
            if (webView == null) {
                return true;
            }
            webView.loadUrl(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Gagal terhubung, silakan cek koneksi anda", 0).show();
        }
    }

    private final void onTransact() {
        int i = 2 % 2;
        ActivityWebviewCustomBinding activityWebviewCustomBinding = (ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityWebviewCustomBinding.webView.getSettings().setJavaScriptEnabled(true);
        activityWebviewCustomBinding.webView.getSettings().setLoadWithOverviewMode(true);
        activityWebviewCustomBinding.webView.getSettings().setUseWideViewPort(true);
        activityWebviewCustomBinding.webView.getSettings().setDomStorageEnabled(true);
        activityWebviewCustomBinding.webView.getSettings().setAllowContentAccess(true);
        activityWebviewCustomBinding.webView.getSettings().setAllowFileAccess(true);
        activityWebviewCustomBinding.webView.getSettings().setAllowFileAccessFromFileURLs(true);
        activityWebviewCustomBinding.webView.getSettings().setAllowUniversalAccessFromFileURLs(true);
        activityWebviewCustomBinding.webView.getSettings().setDatabaseEnabled(true);
        activityWebviewCustomBinding.webView.addJavascriptInterface(new OutputConfigurationCompatApi28Impl(this), "Android");
        activityWebviewCustomBinding.webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        activityWebviewCustomBinding.webView.setDownloadListener(new DownloadListener() { // from class: CustomTabsSessionMockSession
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                MultiBillerWebviewActivity.d();
            }
        });
        ((ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.setWebViewClient(new TuitionPaymentFragmentbindingInflater1());
        int i2 = getExtras + 41;
        disconnect = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static final class b extends WebChromeClient {
        b() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            Intent intent = null;
            if (MultiBillerWebviewActivity.a(MultiBillerWebviewActivity.this) != null) {
                ValueCallback valueCallbackA = MultiBillerWebviewActivity.a(MultiBillerWebviewActivity.this);
                Intrinsics.checkNotNull(valueCallbackA);
                valueCallbackA.onReceiveValue(null);
            }
            MultiBillerWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(MultiBillerWebviewActivity.this, valueCallback);
            Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
            if (intent2.resolveActivity(MultiBillerWebviewActivity.this.getPackageManager()) != null) {
                MultiBillerWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(MultiBillerWebviewActivity.this, (File) null);
                try {
                    MultiBillerWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(MultiBillerWebviewActivity.this, MultiBillerWebviewActivity.g());
                    Intrinsics.checkNotNull(intent2.putExtra("PhotoPath", MultiBillerWebviewActivity.d(MultiBillerWebviewActivity.this)));
                } catch (IOException unused) {
                }
                if (MultiBillerWebviewActivity.asBinder(MultiBillerWebviewActivity.this) != null) {
                    MultiBillerWebviewActivity multiBillerWebviewActivity = MultiBillerWebviewActivity.this;
                    File fileAsBinder = MultiBillerWebviewActivity.asBinder(multiBillerWebviewActivity);
                    Intrinsics.checkNotNull(fileAsBinder);
                    Object[] objArr = {multiBillerWebviewActivity, "file:".concat(String.valueOf(fileAsBinder.getAbsolutePath()))};
                    MultiBillerWebviewActivity.b(-222765538, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 222765540);
                    Intrinsics.checkNotNull(intent2.putExtra("output", Uri.fromFile(MultiBillerWebviewActivity.asBinder(MultiBillerWebviewActivity.this))));
                    intent = intent2;
                } else {
                    Intrinsics.checkNotNull(null);
                }
            } else {
                intent = intent2;
            }
            Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
            intent3.addCategory("android.intent.category.OPENABLE");
            intent3.setType("*/*");
            Intent[] intentArr = {intent};
            Intent intent4 = new Intent("android.intent.action.CHOOSER");
            intent4.putExtra("android.intent.extra.INTENT", intent3);
            intent4.putExtra("android.intent.extra.TITLE", MultiBillerWebviewActivity.this.getString(R.string.image_chooser));
            intent4.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
            MultiBillerWebviewActivity multiBillerWebviewActivity2 = MultiBillerWebviewActivity.this;
            multiBillerWebviewActivity2.startActivityForResult(intent4, MultiBillerWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiBillerWebviewActivity2));
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            Intrinsics.checkNotNullParameter(webView, "");
            ActivityWebviewCustomBinding activityWebviewCustomBindingB = MultiBillerWebviewActivity.b(MultiBillerWebviewActivity.this);
            super.onProgressChanged(webView, i);
            activityWebviewCustomBindingB.progressBar.setProgress(i);
            if (i < 100 && activityWebviewCustomBindingB.progressBar.getVisibility() == 8) {
                activityWebviewCustomBindingB.progressBar.setVisibility(0);
            }
            if (i == 100) {
                activityWebviewCustomBindingB.progressBar.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3 A[PHI: r2 r12
  0x00c3: PHI (r2v3 android.net.Uri[]) = (r2v2 android.net.Uri[]), (r2v4 android.net.Uri[]) binds: [B:37:0x00c1, B:34:0x00aa] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r12v9 java.lang.String) = (r12v8 java.lang.String), (r12v13 java.lang.String) binds: [B:37:0x00c1, B:34:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ec  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int p0, int p1, Intent p2) {
        String str;
        int i;
        String strGuessFileName;
        Uri uriForFile;
        HashMap<String, Uri> map;
        int i2 = 2 % 2;
        if (p0 != this.TuitionPaymentFragmentbindingInflater1 || this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            super.onActivityResult(p0, p1, p2);
            return;
        }
        int i3 = disconnect + 41;
        int i4 = i3 % 128;
        getExtras = i4;
        int i5 = i3 % 2;
        Uri[] uriArr = new Uri[0];
        if (p1 == -1) {
            if (p2 != null) {
                int i6 = i4 + 71;
                disconnect = i6 % 128;
                int i7 = i6 % 2;
                if (p2.getData() != null) {
                    String dataString = p2.getDataString();
                    if (dataString != null) {
                        Uri uri = Uri.parse(dataString);
                        uriArr = new Uri[]{uri};
                        if (StringsKt.equals$default(uri.getScheme(), FirebaseAnalytics.Param.CONTENT, false, 2, null)) {
                            Cursor cursorQuery = getContentResolver().query(uriArr[0], null, null, null, null);
                            if (cursorQuery != null) {
                                try {
                                    if (cursorQuery.moveToFirst()) {
                                        try {
                                            String string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                                            HashMap<String, Uri> map2 = OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            if (map2 != null) {
                                                map2.put(string, uriArr[0]);
                                            }
                                        } catch (Exception unused) {
                                        }
                                    }
                                } catch (Throwable th) {
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                        int i8 = disconnect + 19;
                                        getExtras = i8 % 128;
                                        int i9 = i8 % 2;
                                    }
                                    throw th;
                                }
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        }
                    }
                } else {
                    str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (str != null) {
                        i = getExtras + 79;
                        disconnect = i % 128;
                        if (i % 2 == 0) {
                            strGuessFileName = URLUtil.guessFileName(String.valueOf(str), null, null);
                            uriArr = new Uri[]{Uri.parse(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                            if (this.asBinder != null) {
                                String packageName = getApplicationContext().getPackageName();
                                StringBuilder sb = new StringBuilder();
                                sb.append(packageName);
                                sb.append(".provider");
                                String string2 = sb.toString();
                                File file = this.asBinder;
                                Intrinsics.checkNotNull(file);
                                uriForFile = FileProvider.getUriForFile(this, string2, file);
                                this.a = uriForFile;
                                if (uriForFile != null && (map = OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != null) {
                                    map.put(strGuessFileName, this.a);
                                }
                            }
                        } else {
                            strGuessFileName = URLUtil.guessFileName(String.valueOf(str), null, null);
                            uriArr = new Uri[]{Uri.parse(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                            if (this.asBinder != null) {
                                String packageName2 = getApplicationContext().getPackageName();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(packageName2);
                                sb2.append(".provider");
                                String string3 = sb2.toString();
                                File file2 = this.asBinder;
                                Intrinsics.checkNotNull(file2);
                                uriForFile = FileProvider.getUriForFile(this, string3, file2);
                                this.a = uriForFile;
                                if (uriForFile != null) {
                                    map.put(strGuessFileName, this.a);
                                }
                            }
                        }
                    }
                }
            } else {
                str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str != null) {
                    i = getExtras + 79;
                    disconnect = i % 128;
                    if (i % 2 == 0) {
                        strGuessFileName = URLUtil.guessFileName(String.valueOf(str), null, null);
                        uriArr = new Uri[]{Uri.parse(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        if (this.asBinder != null) {
                            String packageName3 = getApplicationContext().getPackageName();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(packageName3);
                            sb3.append(".provider");
                            String string4 = sb3.toString();
                            File file3 = this.asBinder;
                            Intrinsics.checkNotNull(file3);
                            uriForFile = FileProvider.getUriForFile(this, string4, file3);
                            this.a = uriForFile;
                            if (uriForFile != null) {
                                map.put(strGuessFileName, this.a);
                            }
                        }
                    } else {
                        strGuessFileName = URLUtil.guessFileName(String.valueOf(str), null, null);
                        uriArr = new Uri[]{Uri.parse(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        if (this.asBinder != null) {
                            String packageName4 = getApplicationContext().getPackageName();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(packageName4);
                            sb4.append(".provider");
                            String string5 = sb4.toString();
                            File file4 = this.asBinder;
                            Intrinsics.checkNotNull(file4);
                            uriForFile = FileProvider.getUriForFile(this, string5, file4);
                            this.a = uriForFile;
                            if (uriForFile != null) {
                                map.put(strGuessFileName, this.a);
                            }
                        }
                    }
                }
            }
        }
        ValueCallback<Uri[]> valueCallback = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intrinsics.checkNotNull(valueCallback);
        valueCallback.onReceiveValue(uriArr);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int p0, String[] p1, int[] p2) {
        int i = 2 % 2;
        int i2 = disconnect + 67;
        getExtras = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            super.onRequestPermissionsResult(p0, p1, p2);
            throw null;
        }
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        super.onRequestPermissionsResult(p0, p1, p2);
        if (p0 == this.getInterfaceDescriptor) {
            if (p2.length != 0) {
                int i3 = getExtras + 113;
                disconnect = i3 % 128;
                if (i3 % 2 != 0 ? p2[0] == 0 : p2[1] == 0) {
                    this.asInterface = true;
                    return;
                }
            }
            this.asInterface = true;
            Toast.makeText((Context) null, "Permission Denied. This app will not work with right permission.", 1).show();
        }
        int i4 = getExtras + 57;
        disconnect = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int p0, KeyEvent p1) {
        int i = 2 % 2;
        int i2 = getExtras + 9;
        int i3 = i2 % 128;
        disconnect = i3;
        if (i2 % 2 != 0 ? p0 == 4 : p0 == 2) {
            int i4 = i3 + 115;
            getExtras = i4 % 128;
            int i5 = i4 % 2;
            if (!(!((ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.canGoBack())) {
                ((ActivityWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.goBack();
                return true;
            }
        }
        boolean zOnKeyDown = super.onKeyDown(p0, p1);
        int i6 = disconnect + 83;
        getExtras = i6 % 128;
        if (i6 % 2 == 0) {
            return zOnKeyDown;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        try {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i2 = disconnect + 31;
                getExtras = i2 % 128;
                int i3 = i2 % 2;
                onBackPressed();
                int i4 = disconnect + 97;
                getExtras = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 / 4;
                }
            }
            return super.onOptionsItemSelected(p0);
        } finally {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = getExtras + 45;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault1.clear();
        int i4 = getExtras + 25;
        disconnect = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
            int iRed = Color.red(0) + 1031;
            int bitsPerPixel = 14 - ImageFormat.getBitsPerPixel(0);
            Object[] objArr2 = new Object[1];
            c($$a[5], (byte) ($$b & 247), (short) 141, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, iRed, bitsPerPixel, 1357589585, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{51624, 36755, 20225, 30815, 10698, 27730, 6515, 20059, 21575, 9917, 59876, 44779, 34667, 16041, 19907, 14491, 19763, 10312, 28209, 12939, 53888, 51263, 19388, 64532}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 24, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{29429, 18041, 39367, 847, 42315, 28, 41196, 54111, 63783, 26334, 60279, 20173, 52502, 13768, 48044, 6635, 60036, 12557}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.error_invalid_phone_number).substring(13, 14).length() + 14, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1032;
            int i3 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14;
            Object[] objArr5 = new Object[1];
            c($$a[5], (byte) ($$b & 247), (short) 89, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionChild, iLastIndexOf, i3, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = getExtras + 37;
            disconnect = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                int tapTimeout = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
                int maximumFlingVelocity = 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                c(b2, b3, (short) (b3 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, tapTimeout, maximumFlingVelocity, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr7[3])[0];
            int i7 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i8 = ~iUptimeMillis;
            int i9 = ((((-1589575152) + (((~(40519889 | i8)) | 284800059) * 226)) + (((~(i8 | 318504187)) | ((~((-284800060) | iUptimeMillis)) | 6815761)) * (-113))) + ((~(iUptimeMillis | 40519889)) * 113)) - 720626199;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{56271, 37572, 54640, 20141, 3271, 26828, 63123, 61941, 17691, 11346, 28753, 25313, 4407, 27597, 17303, 17004, 3180, 63674}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellTargetedBrandTitle).substring(0, 14).codePointAt(1) - 49, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{33578, 7498, 43744, 25178, 46206, 14444, 21402, 18682, 23787, 992, 51592, 26203, 40239, 11903, 50361, 7691, 25489, 36631}, ExpandableListView.getPackedPositionType(0L) + 16, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {274774462};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46039 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-16776082) - Color.rgb(0, 0, 0), View.resolveSizeAndState(0, 0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -720626199, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iLastIndexOf2 = 1030 - TextUtils.lastIndexOf("", '0', 0, 0);
                    int defaultSize = View.getDefaultSize(0, 0) + 15;
                    Object[] objArr12 = new Object[1];
                    c($$a[5], (byte) ($$b & 247), (short) 141, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(fadingEdgeLength, iLastIndexOf2, defaultSize, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.getTrimmedLength("") + 45993), KeyEvent.normalizeMetaState(0) + 1117, (ViewConfiguration.getFadingEdgeLength() >> 16) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int i12 = 1032 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int gidForName = 14 - Process.getGidForName("");
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr13 = new Object[1];
                    c(b4, b5, (short) (b5 | 37), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(minimumFlingVelocity, i12, gidForName, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{51624, 36755, 20225, 30815, 10698, 27730, 6515, 20059, 21575, 9917, 59876, 44779, 34667, 16041, 19907, 14491, 19763, 10312, 28209, 12939, 53888, 51263, 19388, 64532}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{29429, 18041, 39367, 847, 42315, 28, 41196, 54111, 63783, 26334, 60279, 20173, 52502, 13768, 48044, 6635, 60036, 12557}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_bank_transfer).substring(0, 3).length() + 12, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1031;
                        int iAlpha = 15 - Color.alpha(0);
                        Object[] objArr16 = new Object[1];
                        c($$a[5], (byte) ($$b & 247), (short) 89, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(jumpTapTimeout, iKeyCodeFromString, iAlpha, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1032;
                        int iRgb = Color.rgb(0, 0, 0) + 16777231;
                        Object[] objArr17 = new Object[1];
                        c($$a[5], (byte) ($$b & 247), (short) 141, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(scrollBarFadeDuration, modifierMetaStateMask, iRgb, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 == null) {
                throw null;
            }
            int i13 = getExtras + 125;
            disconnect = i13 % 128;
            int i14 = i13 % 2;
            while (i2 < strArr2.length) {
                arrayList.add(strArr2[i2]);
                i2++;
            }
            throw null;
        }
        int i15 = getExtras + 113;
        disconnect = i15 % 128;
        int i16 = i15 % 2;
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[3])[0];
        int i19 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i20 = ~iIdentityHashCode;
        int i21 = i17 + (-2122757497) + (((~((-89546940) | i20)) | 21250081) * (-108)) + (((~(i20 | 333827109)) | (~((-333827110) | iIdentityHashCode)) | (-402123968)) * 54) + ((iIdentityHashCode | (-402123968)) * 54);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr18[2])[0] = i23 ^ (i23 << 5);
        int i24 = disconnect + 111;
        getExtras = i24 % 128;
        if (i24 % 2 != 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char offsetAfter = (char) (29944 - TextUtils.getOffsetAfter("", 0));
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23;
                byte b6 = $$a[5];
                byte b7 = (byte) (b6 | 36);
                Object[] objArr19 = new Object[1];
                c(b6, b7, b7, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(offsetAfter, scrollDefaultDelay, keyRepeatTimeout, 986134021, false, (String) objArr19[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null);
            obj.hashCode();
            throw null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
            char size = (char) (View.MeasureSpec.getSize(0) + 29944);
            int i25 = 1756 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int i26 = 23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            byte b8 = $$a[5];
            byte b9 = (byte) (b8 | 36);
            Object[] objArr20 = new Object[1];
            c(b8, b9, b9, objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(size, i25, i26, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cBlue = (char) (29944 - Color.blue(0));
                int windowTouchSlop = 1755 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23;
                Object[] objArr21 = new Object[1];
                c($$a[5], (byte) ($$b & 247), (short) 89, objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cBlue, windowTouchSlop, scrollDefaultDelay2, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).get(null);
            int i27 = ((int[]) objArr22[0])[0];
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{i27}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int i28 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().widthPixels;
            int i29 = ~((-956091996) | i28);
            int i30 = 1930820245 + ((676380673 | i29) * (-280)) + ((i29 | (~(743489569 | i28))) * 140);
            int i31 = ~((-279711323) | i28);
            int i32 = ~i28;
            int i33 = (i30 + (((~(i32 | 1023200891)) | (i31 | (~((-676380674) | i32)))) * 140)) - 81755381;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i35 ^ (i35 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{56271, 37572, 54640, 20141, 3271, 26828, 63123, 61941, 17691, 11346, 28753, 25313, 4407, 27597, 17303, 17004, 3180, 63674}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{33578, 7498, 43744, 25178, 46206, 14444, 21402, 18682, 23787, 992, 51592, 26203, 40239, 11903, 50361, 7691, 25489, 36631}, 16 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {274774462};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 42049), TextUtils.indexOf("", "", 0, 0) + 1726, 29 - ((Process.getThreadPriority(0) + 20) >> 6), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$7879113 = zzu.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).newInstance(objArr25), -81755381, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 29944);
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1755;
                int offsetAfter2 = 23 - TextUtils.getOffsetAfter("", 0);
                Object[] objArr26 = new Object[1];
                c($$a[5], (byte) ($$b & 247), (short) 89, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cKeyCodeFromString, iNormalizeMetaState, offsetAfter2, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{51624, 36755, 20225, 30815, 10698, 27730, 6515, 20059, 21575, 9917, 59876, 44779, 34667, 16041, 19907, 14491, 19763, 10312, 28209, 12939, 53888, 51263, 19388, 64532}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) - 95, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{29429, 18041, 39367, 847, 42315, 28, 41196, 54111, 63783, 26334, 60279, 20173, 52502, 13768, 48044, 6635, 60036, 12557}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_error_unable_to_decrypt_message).substring(0, 26).length() - 11, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char offsetBefore = (char) (29944 - TextUtils.getOffsetBefore("", 0));
                    int capsMode = 1755 - TextUtils.getCapsMode("", 0, 0);
                    int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 23;
                    byte[] bArr = $$a;
                    Object[] objArr29 = new Object[1];
                    c(bArr[5], (byte) ($$b & 247), bArr[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(offsetBefore, capsMode, tapTimeout2, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29944);
                    int iAlpha2 = Color.alpha(0) + 1755;
                    int edgeSlop = 23 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte b10 = $$a[5];
                    byte b11 = (byte) (b10 | 36);
                    Object[] objArr30 = new Object[1];
                    c(b10, b11, b11, objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c, iAlpha2, edgeSlop, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
                int i36 = disconnect + 95;
                getExtras = i36 % 128;
                int i37 = i36 % 2;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr4 == null) {
                throw null;
            }
            while (i2 < strArr4.length) {
                arrayList2.add(strArr4[i2]);
                i2++;
            }
            throw null;
        }
        int i38 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
        int i39 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
        Object[] objArr31 = {new int[]{i39}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i40 = i38 + (-120790168) + (((~((-874309099) | iIdentityHashCode2)) | 269230154) * 345) + (((~((-874309099) | (~iIdentityHashCode2))) | (-930936827)) * 345) + ((~(iIdentityHashCode2 | (-269230155))) * 345);
        int i41 = (i40 << 13) ^ i40;
        int i42 = i41 ^ (i41 >>> 17);
        ((int[]) objArr31[3])[0] = i42 ^ (i42 << 5);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws IllegalAccessException {
        MultiBillerWebviewActivity multiBillerWebviewActivity = (MultiBillerWebviewActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getExtras + 89;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        if (i4 != 1168966376 + (((~(1413613327 | iUptimeMillis)) | 579430448) * 336) + (((~(iUptimeMillis | 583625784)) | 1409417991) * (-168)) + (((~((~iUptimeMillis) | 583625784)) | 1413613327) * 168)) {
            int[] iArr = new int[764280874];
            iArr[764280873] = 1;
            int i5 = (-989198662) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i6 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i7 = (int) Runtime.getRuntime().totalMemory();
        if (i6 != ((((~(i7 | 1038046513)) | 1541009451) * 56) - 231752100) + (((~((~i7) | 1541009451)) | 1038046513) * 56)) {
            int i8 = (-1350487972) % 2;
            throw new ArithmeticException();
        }
        super.onResume();
        int i9 = getExtras + 87;
        disconnect = i9 % 128;
        if (i9 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0088, code lost:
    
        if (r1 != ((1100061850 + (((~((~r2) | 283695590)) | 1728513033) * 529)) + (((~(r2 | 283695590)) | 1999606921) * 529))) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x008a, code lost:
    
        super.onStart();
        r1 = com.bpjstku.presentation.multibiller.MultiBillerWebviewActivity.disconnect + 57;
        com.bpjstku.presentation.multibiller.MultiBillerWebviewActivity.getExtras = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0096, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0097, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
    
        throw new java.lang.RuntimeException("-1903869788");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        if (r1 == (((((~(1076624996 | r4)) | (-1318624746)) * 262) - 947319318) + (((~((~r4) | 1076624996)) | (-1318624746)) * 262))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005f, code lost:
    
        if (r1 == (((((~(2008546173 | r4)) | 607162388) * 449) - 706865410) + (((~((~r4) | 2008546173)) | 607162388) * 449))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r2 = android.os.Process.myTid();
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() throws java.lang.IllegalAccessException {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.multibiller.MultiBillerWebviewActivity.getExtras
            int r1 = r1 + 109
            int r2 = r1 % 128
            com.bpjstku.presentation.multibiller.MultiBillerWebviewActivity.disconnect = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L3a
            java.lang.reflect.Member[] r1 = defpackage.CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r4 = 1
            r1 = r1[r4]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            long r4 = android.os.SystemClock.elapsedRealtime()
            int r4 = (int) r4
            r5 = 1076624996(0x402bfe64, float:2.6874018)
            r6 = r5 | r4
            int r6 = ~r6
            r7 = -1318624746(0xffffffffb1676216, float:-3.367068E-9)
            r6 = r6 | r7
            int r6 = r6 * 262
            r8 = -947319318(0xffffffffc7890dea, float:-70171.83)
            int r6 = r6 + r8
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = ~r4
            r4 = r4 | r7
            int r4 = r4 * 262
            int r6 = r6 + r4
            if (r1 != r6) goto L98
            goto L61
        L3a:
            java.lang.reflect.Member[] r1 = defpackage.CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r4 = java.lang.System.identityHashCode(r9)
            r5 = 2008546173(0x77b7fb7d, float:7.463212E33)
            r6 = r5 | r4
            int r6 = ~r6
            r7 = 607162388(0x24309014, float:3.8285955E-17)
            r6 = r6 | r7
            int r6 = r6 * 449
            r8 = -706865410(0xffffffffd5de16fe, float:-3.0523792E13)
            int r6 = r6 + r8
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = ~r4
            r4 = r4 | r7
            int r4 = r4 * 449
            int r6 = r6 + r4
            if (r1 != r6) goto L98
        L61:
            java.lang.reflect.Member[] r1 = defpackage.checkUnsupportedFeatureCombinationAndThrow.b
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            int r2 = android.os.Process.myTid()
            int r4 = ~r2
            r5 = 283695590(0x10e8d9e6, float:9.184359E-29)
            r4 = r4 | r5
            int r4 = ~r4
            r6 = 1728513033(0x67070409, float:6.375939E23)
            r4 = r4 | r6
            int r4 = r4 * 529
            r6 = 1100061850(0x41919c9a, float:18.201466)
            int r6 = r6 + r4
            r2 = r2 | r5
            int r2 = ~r2
            r4 = 1999606921(0x772f9489, float:3.56119E33)
            r2 = r2 | r4
            int r2 = r2 * 529
            int r6 = r6 + r2
            if (r1 != r6) goto L97
            super.onStart()
            int r1 = com.bpjstku.presentation.multibiller.MultiBillerWebviewActivity.disconnect
            int r1 = r1 + 57
            int r2 = r1 % 128
            com.bpjstku.presentation.multibiller.MultiBillerWebviewActivity.getExtras = r2
            int r1 = r1 % r0
            return
        L97:
            throw r3
        L98:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "-1903869788"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.multibiller.MultiBillerWebviewActivity.onStart():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i3 = ~iIdentityHashCode;
        if (i2 != 1916579666 + (((~(i3 | (-897278296))) | 830021975 | (~((-34433) | iIdentityHashCode))) * 717) + (((~(iIdentityHashCode | (-897278296))) | (~(i3 | (-34433))) | 830021975) * 717)) {
            int i4 = 250079312 % 2;
            throw new ArithmeticException();
        }
        int i5 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i6 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        int i7 = ~((-1611903047) | i6);
        int i8 = ~i6;
        if (i5 != (-1940364420) + ((i7 | (~(2042082646 | i8))) * (-406)) + ((~((-1074929729) | i8)) * (-406)) + (((~(i6 | (-967152919))) | (~(1611903046 | i8))) * 406)) {
            int i9 = disconnect + 5;
            getExtras = i9 % 128;
            if (i9 % 2 != 0) {
                int[] iArr = new int[1891765468];
                iArr[1891765467] = 1;
                Toast.makeText((Context) null, iArr[-1], 0).show();
            } else {
                int[] iArr2 = new int[1891765468];
                iArr2[1891765467] = 1;
                int i10 = (-1923919820) % 2;
                Toast.makeText((Context) null, iArr2[-1], 1).show();
            }
            int i11 = disconnect + 75;
            getExtras = i11 % 128;
            int i12 = i11 % 2;
        }
        super.onCreate(bundle);
    }

    public static /* synthetic */ void b(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getExtras + 49;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = disconnect + 9;
        getExtras = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ outputFormatToAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1(MultiBillerWebviewActivity multiBillerWebviewActivity) {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = new outputFormatToAudioProfile(multiBillerWebviewActivity);
        int i2 = getExtras + 47;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        return outputformattoaudioprofile;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(MultiBillerWebviewActivity multiBillerWebviewActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = disconnect + 99;
        getExtras = i2 % 128;
        int i3 = i2 % 2;
        if (!bool.booleanValue()) {
            MultiBillerWebviewActivity multiBillerWebviewActivity2 = multiBillerWebviewActivity;
            String string = multiBillerWebviewActivity.getString(R.string.message_storage_permission_required);
            Intrinsics.checkNotNullExpressionValue(string, "");
            AutoValue_LifecycleCameraRepository_Key.b(multiBillerWebviewActivity2, string);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = disconnect + 1;
        getExtras = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(MultiBillerWebviewActivity multiBillerWebviewActivity, View view) {
        int i = 2 % 2;
        int i2 = getExtras + 35;
        disconnect = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ((ActivityWebviewCustomBinding) ((ViewBinding) multiBillerWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.setVisibility(0);
        ((ActivityWebviewCustomBinding) ((ViewBinding) multiBillerWebviewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).containerError.setVisibility(8);
        multiBillerWebviewActivity.cancelAll();
        Unit unit = Unit.INSTANCE;
        int i4 = getExtras + 103;
        disconnect = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(MultiBillerWebviewActivity multiBillerWebviewActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (!(!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            int i2 = disconnect + 121;
            getExtras = i2 % 128;
            int i3 = i2 % 2;
            multiBillerWebviewActivity.MediaBrowserCompat();
            int i4 = disconnect + 63;
            getExtras = i4 % 128;
            int i5 = i4 % 2;
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i6 = getExtras + 35;
            disconnect = i6 % 128;
            int i7 = i6 % 2;
            multiBillerWebviewActivity.IconCompatParcelizer();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ((MultiBillerCheckTransactionResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getMessage(), 0).show();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            multiBillerWebviewActivity.IconCompatParcelizer();
            retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiBillerWebviewActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        }
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ File g() {
        int i = 2 % 2;
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "JMO Web");
        if (!file.exists()) {
            int i2 = getExtras + 3;
            disconnect = i2 % 128;
            if (i2 % 2 == 0) {
                file.mkdirs();
                throw null;
            }
            file.mkdirs();
        }
        String str = File.separator;
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(file);
        sb.append(str);
        sb.append("IMG_");
        sb.append(jCurrentTimeMillis);
        sb.append(".jpg");
        return new File(sb.toString());
    }

    public static /* synthetic */ void d() {
        int i = 2 % 2;
        int i2 = getExtras + 43;
        disconnect = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static {
        getItem = 1;
        INotificationSideChannel();
        INSTANCE = new Companion(null);
        int i = getRoot + 7;
        getItem = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3(MultiBillerWebviewActivity multiBillerWebviewActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (String) b(-1809015077, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{multiBillerWebviewActivity}, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 1809015083);
    }

    public static final /* synthetic */ CustomTabsSession1ExternalSyntheticLambda1 asInterface(MultiBillerWebviewActivity multiBillerWebviewActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (CustomTabsSession1ExternalSyntheticLambda1) b(2125770467, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{multiBillerWebviewActivity}, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, -2125770462);
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(MultiBillerWebviewActivity multiBillerWebviewActivity, String str) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(-222765538, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{multiBillerWebviewActivity, str}, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 222765540);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityWebviewCustomBinding> TuitionPaymentFragmentbindingInflater1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iB = getHorizontalOffset.b();
        return (Function1) b(980545716, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, getHorizontalOffset.b(), new Object[]{this}, getHorizontalOffset.b(), iB, -980545712);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = disconnect;
        int i3 = i2 + 61;
        getExtras = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 47;
        getExtras = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_webview_custom;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int iCodePointAt = 1463647062 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.complete_payment_at_atm).substring(4, 5).codePointAt(0);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(-367067309, iCodePointAt, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 367067312);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        b(-1258250933, getHorizontalOffset.b(), ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_backend_error_message_1062).substring(0, 26).length() - 1362554151, 1258250934);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int iB = getHorizontalOffset.b();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(-1065001284, iB, ExecutorDelivery.ResponseDeliveryRunnable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, getHorizontalOffset.b(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 1065001284);
    }

    static void INotificationSideChannel() {
        MediaBrowserCompat = (char) 2673;
        read = (char) 9251;
        write = (char) 29007;
        getNotifyChildrenChangedOptions = (char) 16020;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        MultiBillerWebviewActivity multiBillerWebviewActivity = (MultiBillerWebviewActivity) objArr[0];
        int i = 2 % 2;
        int i2 = disconnect + 101;
        getExtras = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = disconnect + 121;
        getExtras = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static String $$i(short s, int i, short s2) {
        int i2 = 3 - (s2 * 2);
        byte[] bArr = $$c;
        int i3 = 108 - (i * 3);
        int i4 = s * 2;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i2++;
            i3 = i2 + (-i5);
        }
        while (true) {
            int i7 = i2;
            int i8 = i3;
            i6++;
            bArr2[i6] = (byte) i8;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 = i7 + 1;
            i3 = i8 + (-bArr[i7]);
        }
    }
}
