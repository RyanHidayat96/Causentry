package com.bpjstku.presentation.util;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.mnc.model.request.VisionProvisioningRequest;
import com.bpjstku.databinding.ActivityNewWebviewCustomBinding;
import com.bpjstku.databinding.ActivityVideoListBinding;
import com.bpjstku.databinding.LayoutToolbarCenterBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.streaming.TermsAndAgreementRctiPlusActivity;
import com.bpjstku.presentation.streaming.TermsAndAgreementVisionPlusActivity;
import com.bpjstku.presentation.util.NewWebviewCustomActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.BufferProviderState;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.EncoderImplByteBufferInput;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.UseCaseAttachStateAttachStateFilter;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.deInitSession;
import defpackage.deriveCodec;
import defpackage.generateCameraId;
import defpackage.getCaptureOptionUnpacker;
import defpackage.getCombinedMessage;
import defpackage.getDefaultMessage;
import defpackage.getEventTime;
import defpackage.getIncrementalScaleFactor;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.runQueryOnBackgroundThread;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0019\u0010\u0004J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0014\u0010 \u001a\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00020!8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0015\u0010#\u001a\u00020%8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b#\u0010&R\u0015\u0010\u001e\u001a\u00020'8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010&R\u0017\u0010)\u001a\u0004\u0018\u00010(8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b)\u0010&R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\u000f\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010,R\u0016\u0010\r\u001a\u00020*8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b \u0010,"}, d2 = {"Lcom/bpjstku/presentation/util/NewWebviewCustomActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityNewWebviewCustomBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Landroid/os/Bundle;", "p0", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onRestoreInstanceState", "b", "a", "onTransact", "asInterface", "", "Landroid/view/KeyEvent;", "p1", "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "Landroid/view/MenuItem;", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "asBinder", "Landroid/content/res/Configuration;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/os/Bundle;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "LgetCombinedMessage;", "Lkotlin/Lazy;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "Lcom/bpjstku/domain/user/model/User;", "d", "", "g", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NewWebviewCustomActivity extends BindingBaseActivity<ActivityNewWebviewCustomBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char asBinder;
    private static char[] asInterface;
    private static int cancelAll;
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String a;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Bundle b;
    private String g;
    private static final byte[] $$c = {25, 5, -88, -44};
    private static final int $$f = 97;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {117, 57, 101, -72, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 72;
    private static int onTransact = 1;
    private static int INotificationSideChannel = 0;
    private static int cancel = 1;
    private final Lazy d = LazyKt.lazy(new Function0() { // from class: getMutableSurfaceListApi26
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewWebviewCustomActivity.b(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String asInterface = "";

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~(i5 | i2);
        int i8 = ~i5;
        int i9 = ~i2;
        int i10 = i8 | i9;
        int i11 = i7 | (~(i10 | i));
        int i12 = i9 | i5;
        int i13 = (~i10) | i;
        int i14 = i + i5 + i3 + ((-1587644119) * i4) + (1302866265 * i6);
        int i15 = i14 * i14;
        int i16 = (i * (-1579585154)) + 1163788288 + ((-1579585154) * i5) + ((-914001539) * i11) + (i12 * 914001539) + (914001539 * i13) + ((-665583616) * i3) + (1500774400 * i4) + ((-1456209920) * i6) + ((-2144468992) * i15);
        int i17 = ((i * (-855313886)) - 1253577507) + (i5 * (-855313886)) + (i11 * (-13)) + (i12 * 13) + (i13 * 13) + (i3 * (-855313873)) + (i4 * (-1467678585)) + (i6 * 593082711) + (i15 * 74579968);
        int i18 = i16 + (i17 * i17 * (-1668153344));
        if (i18 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i18 == 2) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i18 != 3) {
            return i18 != 4 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        NewWebviewCustomActivity newWebviewCustomActivity = (NewWebviewCustomActivity) objArr[0];
        int i19 = 2 % 2;
        ActivityNewWebviewCustomBinding activityNewWebviewCustomBinding = (ActivityNewWebviewCustomBinding) ((ViewBinding) newWebviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityNewWebviewCustomBinding.webView.getSettings().setJavaScriptEnabled(true);
        activityNewWebviewCustomBinding.webView.getSettings().setLoadWithOverviewMode(true);
        activityNewWebviewCustomBinding.webView.getSettings().setUseWideViewPort(true);
        activityNewWebviewCustomBinding.webView.getSettings().setDomStorageEnabled(true);
        activityNewWebviewCustomBinding.webView.getSettings().setAllowContentAccess(true);
        activityNewWebviewCustomBinding.webView.getSettings().setAllowFileAccess(true);
        activityNewWebviewCustomBinding.webView.getSettings().setUseWideViewPort(true);
        activityNewWebviewCustomBinding.webView.getSettings().setBuiltInZoomControls(true);
        activityNewWebviewCustomBinding.webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        activityNewWebviewCustomBinding.webView.setWebViewClient(newWebviewCustomActivity.new b());
        activityNewWebviewCustomBinding.webView.setWebChromeClient(newWebviewCustomActivity.new TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        int i20 = INotificationSideChannel + 117;
        cancel = i20 % 128;
        int i21 = i20 % 2;
        return null;
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
    private static void c(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = 197 - r7
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r0 = com.bpjstku.presentation.util.NewWebviewCustomActivity.$$a
            int r5 = r5 + 1
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r7]
        L24:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            int r7 = r7 + 1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.NewWebviewCustomActivity.c(byte, byte, int, java.lang.Object[]):void");
    }

    public NewWebviewCustomActivity() {
        final NewWebviewCustomActivity newWebviewCustomActivity = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<getCombinedMessage>() { // from class: com.bpjstku.presentation.util.NewWebviewCustomActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getCombinedMessage] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getCombinedMessage invoke() {
                LifecycleOwner lifecycleOwner = newWebviewCustomActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getCombinedMessage.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.util.NewWebviewCustomActivity$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = newWebviewCustomActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class);
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
    }

    public static final /* synthetic */ ActivityNewWebviewCustomBinding asBinder(NewWebviewCustomActivity newWebviewCustomActivity) {
        int i = 2 % 2;
        int i2 = cancel + 125;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        ActivityNewWebviewCustomBinding activityNewWebviewCustomBinding = (ActivityNewWebviewCustomBinding) ((ViewBinding) newWebviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        int i4 = cancel + 13;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return activityNewWebviewCustomBinding;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityNewWebviewCustomBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = cancel + 3;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        NewWebviewCustomActivity$bindingInflater$1 newWebviewCustomActivity$bindingInflater$1 = NewWebviewCustomActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = cancel + 81;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return newWebviewCustomActivity$bindingInflater$1;
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.util.NewWebviewCustomActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/presentation/util/NewWebviewCustomActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "p3", "", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void b(Context p0, String p1, String p2, String p3) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, NewWebviewCustomActivity.class, new Pair[]{TuplesKt.to(ImagesContract.URL, p1), TuplesKt.to("toolbar_title", p2), TuplesKt.to("mnc_product", p3)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1() {
            UseCaseAttachStateAttachStateFilter.b[0] = getCaptureOptionUnpacker.b[0];
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityNewWebviewCustomBinding activityNewWebviewCustomBinding = (ActivityNewWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        TextView textView = activityNewWebviewCustomBinding.tvCloseBanner;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: OutputConfigurationCompatApi26ImplOutputConfigurationParamsApi26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewWebviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityNewWebviewCustomBinding, (View) obj);
            }
        }));
        Button button = activityNewWebviewCustomBinding.btnTryAgain;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: OutputConfigurationCompatApi28ImplOutputConfigurationParamsApi28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewWebviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityNewWebviewCustomBinding, this, (View) obj);
            }
        }));
        int i2 = cancel + 25;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle p0) {
        int i = 2 % 2;
        int i2 = cancel + 99;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        super.onSaveInstanceState(p0);
        ((ActivityNewWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.saveState(p0);
        int i4 = cancel + 115;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        NewWebviewCustomActivity newWebviewCustomActivity = (NewWebviewCustomActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        int i2 = cancel + 69;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bundle, "");
            super.onRestoreInstanceState(bundle);
            newWebviewCustomActivity.b = bundle;
            return null;
        }
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onRestoreInstanceState(bundle);
        newWebviewCustomActivity.b = bundle;
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 73;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            getIntent().getStringExtra(ImagesContract.URL);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String stringExtra = getIntent().getStringExtra(ImagesContract.URL);
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.g = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("toolbar_title");
        if (stringExtra2 == null) {
            int i3 = INotificationSideChannel + 91;
            cancel = i3 % 128;
            int i4 = i3 % 2;
            stringExtra2 = "";
        }
        this.a = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("mnc_product");
        if (stringExtra3 == null) {
            int i5 = INotificationSideChannel + 105;
            cancel = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str = stringExtra3;
        }
        this.asInterface = str;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        final NewWebviewCustomActivity newWebviewCustomActivity = (NewWebviewCustomActivity) objArr[0];
        int i = 2 % 2;
        ((getCombinedMessage) newWebviewCustomActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1.observe(newWebviewCustomActivity, new Observer() { // from class: getMaxSharedSurfaceCountApi26
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                NewWebviewCustomActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = cancel + 115;
        INotificationSideChannel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final class b extends WebViewClient {
        b() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String strValueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            if (strValueOf != null && StringsKt.startsWith$default(strValueOf, "market://", false, 2, (Object) null)) {
                NewWebviewCustomActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strValueOf)));
                return true;
            }
            if (webView != null) {
                webView.loadUrl(strValueOf);
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            NewWebviewCustomActivity.asBinder(NewWebviewCustomActivity.this).progressBar.setProgress(0);
            NewWebviewCustomActivity.asBinder(NewWebviewCustomActivity.this).progressBar.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            NewWebviewCustomActivity.asBinder(NewWebviewCustomActivity.this).progressBar.setVisibility(8);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends WebChromeClient {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            Intrinsics.checkNotNullParameter(webView, "");
            super.onProgressChanged(webView, i);
            NewWebviewCustomActivity.asBinder(NewWebviewCustomActivity.this).progressBar.setProgress(i);
            if (i == 100) {
                NewWebviewCustomActivity.asBinder(NewWebviewCustomActivity.this).progressBar.setVisibility(8);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onPermissionRequest(PermissionRequest permissionRequest) {
            Intrinsics.checkNotNullParameter(permissionRequest, "");
            permissionRequest.grant(new String[]{"android.webkit.resource.PROTECTED_MEDIA_ID"});
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() throws Throwable {
        int i = 2 % 2;
        if (!(!Intrinsics.areEqual(this.asInterface, "VISION")) && !((getCombinedMessage) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            getDefaultMessage.Companion companion = getDefaultMessage.INSTANCE;
            getDefaultMessage getdefaultmessageB = getDefaultMessage.Companion.b("VISION+", new Function0() { // from class: OutputConfigurationCompatBaseImpl
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewWebviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
                }
            }, new Function0() { // from class: OutputConfigurationCompatBaseImplOutputConfigurationParamsApi21
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewWebviewCustomActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
                }
            });
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager, "");
            if (supportFragmentManager.findFragmentByTag(getdefaultmessageB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getdefaultmessageB.show(supportFragmentManager, getdefaultmessageB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        if (Intrinsics.areEqual(this.asInterface, "RCTI+") && !((getCombinedMessage) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
            getDefaultMessage.Companion companion2 = getDefaultMessage.INSTANCE;
            getDefaultMessage getdefaultmessageB2 = getDefaultMessage.Companion.b("RCTI+", new Function0() { // from class: getSurfaceGenerationId
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return (Unit) NewWebviewCustomActivity.TuitionPaymentFragmentbindingInflater1(980932791, ActivityVideoListBinding.b(), new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault3}, ActivityVideoListBinding.b(), ActivityVideoListBinding.b(), -980932791, ActivityVideoListBinding.b());
                }
            }, new Function0() { // from class: getSurfaceFormat
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewWebviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            });
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            Intrinsics.checkNotNullParameter(supportFragmentManager2, "");
            if (supportFragmentManager2.findFragmentByTag(getdefaultmessageB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getdefaultmessageB2.show(supportFragmentManager2, getdefaultmessageB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i2 = cancel + 119;
                INotificationSideChannel = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        TuitionPaymentFragmentbindingInflater1(258471540, runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -258471537, runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        String str = this.g;
        if (str == null) {
            int i4 = INotificationSideChannel + 119;
            cancel = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        ((ActivityNewWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.loadUrl(str);
    }

    private static void e(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = asInterface;
        float f = 0.0f;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $10 + 31;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 2266, 33 - View.resolveSize(0, 0), -1927765101, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
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
        Object[] objArr3 = {Integer.valueOf(asBinder)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 2266 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 33, -1927765101, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $10 + 105;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i9 = $10 + 17;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b / b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >>> b2);
                    } else {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 49267);
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 3261;
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 30;
                        byte b7 = (byte) ($$f & 7);
                        byte b8 = (byte) (b7 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, offsetBefore, touchSlop, -127612708, false, $$i(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 3;
                            byte b10 = (byte) (b9 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22877 - Process.getGidForName("")), TextUtils.lastIndexOf("", '0', 0) + 595, ((byte) KeyEvent.getModifierMetaStateMask()) + 18, 1570859318, false, $$i(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i11 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i11];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                        } else {
                            int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            int i16 = $10 + 119;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int p0, KeyEvent p1) {
        int i = 2 % 2;
        if (p0 != 4 || !((ActivityNewWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.canGoBack()) {
            return super.onKeyDown(p0, p1);
        }
        int i2 = INotificationSideChannel + 101;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            ((ActivityNewWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.goBack();
        } else {
            ((ActivityNewWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.goBack();
        }
        int i3 = cancel + 21;
        INotificationSideChannel = i3 % 128;
        if (i3 % 2 == 0) {
            return true;
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
                int i2 = cancel + 101;
                INotificationSideChannel = i2 % 128;
                int i3 = i2 % 2;
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = INotificationSideChannel + 105;
            cancel = i4 % 128;
            if (i4 % 2 != 0) {
                return zOnOptionsItemSelected;
            }
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        MaterialToolbar materialToolbar;
        int i = 2 % 2;
        int i2 = cancel + 121;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.areEqual(this.asInterface, "VISION");
        ((ActivityNewWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).tvCloseBanner.setVisibility(8);
        LayoutToolbarCenterBinding layoutToolbarCenterBinding = ((ActivityNewWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar;
        String str = null;
        if (layoutToolbarCenterBinding != null) {
            materialToolbar = layoutToolbarCenterBinding.toolbar;
            int i4 = cancel + 1;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
        } else {
            materialToolbar = null;
        }
        TuitionPaymentFragmentbindingInflater1((Toolbar) materialToolbar, true);
        LayoutToolbarCenterBinding layoutToolbarCenterBinding2 = ((ActivityNewWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar;
        if (layoutToolbarCenterBinding2 != null) {
            int i6 = cancel + 95;
            INotificationSideChannel = i6 % 128;
            int i7 = i6 % 2;
            TextView textView = layoutToolbarCenterBinding2.tvToolbarTitle;
            if (textView != null) {
                int i8 = INotificationSideChannel + 11;
                cancel = i8 % 128;
                if (i8 % 2 == 0) {
                    str.hashCode();
                    throw null;
                }
                String str2 = this.a;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i9 = INotificationSideChannel + 63;
                    cancel = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    str = str2;
                }
                textView.setText(str);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        super.onConfigurationChanged(p0);
        if (p0.orientation == 2) {
            LayoutToolbarCenterBinding layoutToolbarCenterBinding = ((ActivityNewWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar;
            if (layoutToolbarCenterBinding != null) {
                int i2 = INotificationSideChannel + 51;
                cancel = i2 % 128;
                int i3 = i2 % 2;
                MaterialToolbar materialToolbar = layoutToolbarCenterBinding.toolbar;
                if (materialToolbar != null) {
                    int i4 = cancel + 71;
                    INotificationSideChannel = i4 % 128;
                    int i5 = i4 % 2;
                    materialToolbar.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        LayoutToolbarCenterBinding layoutToolbarCenterBinding2 = ((ActivityNewWebviewCustomBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar;
        if (layoutToolbarCenterBinding2 != null) {
            int i6 = INotificationSideChannel + 61;
            cancel = i6 % 128;
            int i7 = i6 % 2;
            MaterialToolbar materialToolbar2 = layoutToolbarCenterBinding2.toolbar;
            if (materialToolbar2 != null) {
                int i8 = INotificationSideChannel + 103;
                cancel = i8 % 128;
                int i9 = i8 % 2;
                materialToolbar2.setVisibility(0);
            }
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char modifierMetaStateMask = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
            int iIndexOf = 1755 - TextUtils.indexOf("", "", 0, 0);
            int maximumDrawingCacheSize = 23 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            c((byte) 37, b2, (short) (b2 | 193), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(modifierMetaStateMask, iIndexOf, maximumDrawingCacheSize, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29944);
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1755;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                byte b3 = $$a[7];
                Object[] objArr3 = new Object[1];
                c((byte) 52, b3, (short) (b3 | 156), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout, offsetBefore, iLastIndexOf, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i3 = ((int[]) objArr4[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = new Object[]{new int[]{i3}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 270204251;
            int i4 = ~length;
            int i5 = 1958332176 + (((~(51991387 | i4)) | 264593813) * 226) + (((~(i4 | 266171359)) | 50413841 | (~((-264593814) | length))) * (-113)) + ((~(length | 51991387)) * 113) + 2012354047;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{'\t', '\f', 19, '\n', 6, 20, '\n', 11, 20, '\t', '\r', 2, 3, '\t', 1, 17}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_uob).substring(1, 3).length() + 14, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{22, 15, 0, '\f', 5, 23, '\r', '\b', 24, '\f', 0, 2, 4, 5, 22, 7}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 9), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_atm_instruction_6).substring(17, 19).codePointAt(0) - 28, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-917708495};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - TextUtils.getTrimmedLength("")), 1726 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = EncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 2012354047, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 29944);
                    int iResolveSize = 1755 - View.resolveSize(0, 0);
                    int scrollBarFadeDuration = 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte b4 = $$a[7];
                    Object[] objArr8 = new Object[1];
                    c((byte) 52, b4, (short) (b4 | 156), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSizeAndState, iResolveSize, scrollBarFadeDuration, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{'\n', 11, 16, 7, 5, 24, 15, 7, 14, '\t', 7, '\n', 4, 0, 7, 3, 15, 1, 24, 6, 21, '\r'}, (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.input_2).substring(3, 4).length() + 21, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{1, 22, '\r', 19, 0, 3, 18, 15, 4, '\f', 23, 6, 21, 15, 13935}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_instruction_step5).substring(28, 30).codePointAt(0) + 80), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 1756;
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 23;
                        byte b5 = $$a[7];
                        Object[] objArr11 = new Object[1];
                        c((byte) 52, b5, (short) (b5 | 104), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iIndexOf2, packedPositionGroup, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29943);
                        int i8 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1755;
                        int i9 = 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        byte b6 = $$a[7];
                        Object[] objArr12 = new Object[1];
                        c((byte) 37, b6, (short) (b6 | 193), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, i8, i9, 986134021, false, (String) objArr12[0], null);
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
        int i10 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0];
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        if (i11 != i10) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4];
            if (strArr != null) {
                int i12 = INotificationSideChannel + 95;
                cancel = i12 % 128;
                int i13 = i12 % 2;
                while (i2 < strArr.length) {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i11));
        }
        int i14 = cancel + 3;
        INotificationSideChannel = i14 % 128;
        int i15 = i14 % 2;
        int i16 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[3])[0];
        int i17 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[0])[0];
        Object[] objArr13 = {new int[]{i17}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i18 = i16 + ((((-750631223) + (((~((-366430948) | iIdentityHashCode)) | 349454914) * 1504)) + ((~(iIdentityHashCode | (-16976034))) * (-1504))) - 630946896);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr13[3])[0] = i20 ^ (i20 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iRed = Color.red(0) + 1031;
            int packedPositionType = 15 - ExpandableListView.getPackedPositionType(0L);
            byte b7 = $$a[7];
            Object[] objArr14 = new Object[1];
            c((byte) 52, b7, (short) (b7 | 52), objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(doubleTapTimeout, iRed, packedPositionType, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new char[]{'\n', 11, 16, 7, 5, 24, 15, 7, 14, '\t', 7, '\n', 4, 0, 7, 3, 15, 1, 24, 6, 21, '\r'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.no_gojek_message).substring(35, 37).length() + 14), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new char[]{1, 22, '\r', 19, 0, 3, 18, 15, 4, '\f', 23, 6, 21, 15, 13935}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 76), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
            int i21 = 1032 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int iRed2 = Color.red(0) + 15;
            byte b8 = $$a[7];
            Object[] objArr17 = new Object[1];
            c((byte) 52, b8, (short) (b8 | 156), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf, i21, iRed2, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                int iRgb = Color.rgb(0, 0, 0) + 16778247;
                int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 15;
                byte[] bArr = $$a;
                byte b9 = bArr[7];
                Object[] objArr18 = new Object[1];
                c(b9, bArr[28], b9, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(bitsPerPixel, iRgb, longPressTimeout2, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i22 = ((int[]) objArr19[3])[0];
            int i23 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int length2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 138683938;
            int i24 = ((((-1111539135) + ((((~(1026777772 | length2)) | 41981250) | (~((-782497603) | length2))) * (-744))) + (((~length2) | 286261420) * 744)) + ((length2 | (-41981251)) * 744)) - 1462662885;
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr[2])[0] = i26 ^ (i26 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(new char[]{'\t', '\f', 19, '\n', 6, 20, '\n', 11, 20, '\t', '\r', 2, 3, '\t', 1, 17}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2), KeyEvent.keyCodeFromString("") + 16, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new char[]{22, 15, 0, '\f', 5, 23, '\r', '\b', 24, '\f', 0, 2, 4, 5, 22, 7}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.indomaret_instruction_step4).substring(45, 46).length() + 19), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-917708495};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 46039), (KeyEvent.getMaxKeyCode() >> 16) + 1134, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -1462662885, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                int i27 = 1031 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int offsetAfter = 15 - TextUtils.getOffsetAfter("", 0);
                byte b10 = $$a[7];
                Object[] objArr24 = new Object[1];
                c((byte) 52, b10, (short) (b10 | 52), objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(absoluteGravity, i27, offsetAfter, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Gravity.getAbsoluteGravity(0, 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1116, 18 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), Boolean.TYPE});
            }
            Object[] objArr25 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int gidForName = Process.getGidForName("") + 1032;
                int iIndexOf3 = TextUtils.indexOf("", "") + 15;
                byte[] bArr2 = $$a;
                byte b11 = bArr2[7];
                Object[] objArr26 = new Object[1];
                c(b11, bArr2[28], b11, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c3, gidForName, iIndexOf3, 632103528, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr25);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{'\n', 11, 16, 7, 5, 24, 15, 7, 14, '\t', 7, '\n', 4, 0, 7, 3, 15, 1, 24, 6, 21, '\r'}, (byte) (Color.red(0) + 16), 22 - Color.red(0), objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{1, 22, '\r', 19, 0, 3, 18, 15, 4, '\f', 23, 6, 21, 15, 13935}, (byte) (112 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_cta_text_submit).substring(0, 5).codePointAt(1) - 90, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int i28 = 1032 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int iAlpha = Color.alpha(0) + 15;
                    byte b12 = $$a[7];
                    Object[] objArr29 = new Object[1];
                    c((byte) 52, b12, (short) (b12 | 156), objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(keyRepeatTimeout, i28, iAlpha, 1344079056, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char offsetBefore2 = (char) TextUtils.getOffsetBefore("", 0);
                    int offsetBefore3 = 1031 - TextUtils.getOffsetBefore("", 0);
                    int jumpTapTimeout = 15 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    byte b13 = $$a[7];
                    Object[] objArr30 = new Object[1];
                    c((byte) 52, b13, (short) (b13 | 52), objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(offsetBefore2, offsetBefore3, jumpTapTimeout, 1357589585, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                objArr = objArr25;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i29 = ((int[]) objArr[1])[0];
        int i30 = ((int[]) objArr[3])[0];
        if (i30 == i29) {
            int i31 = INotificationSideChannel + 61;
            cancel = i31 % 128;
            int i32 = i31 % 2;
            Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i33 = ((int[]) objArr[2])[0];
            int i34 = ((int[]) objArr[3])[0];
            int i35 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int length3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 932520724;
            int i36 = i33 + 1739565539 + (((~length3) | 10498052) * 1324) + (((~(length3 | 166473732)) | (~(77806437 | length3))) * (-1324)) + 1785162966;
            int i37 = i36 ^ (i36 << 13);
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr31[2])[0] = i38 ^ (i38 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i39 = INotificationSideChannel + 3;
            cancel = i39 % 128;
            int i40 = 2;
            int i41 = i39 % 2;
            while (i2 < strArr4.length) {
                int i42 = INotificationSideChannel + 59;
                cancel = i42 % 128;
                if (i42 % i40 == 0) {
                    arrayList2.add(strArr4[i2]);
                    i2 += 22;
                } else {
                    arrayList2.add(strArr4[i2]);
                    i2++;
                }
                i40 = 2;
            }
        }
        throw new RuntimeException(String.valueOf(i30));
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = cancel + 115;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i5 = ~i4;
            if (i3 != ((((~(1876672375 | i5)) | (~((-1082268680) | i4))) * 988) - 2083809276) + (((~(i4 | 1624391239)) | 252281136 | (~(i5 | (-1082268680)))) * 988)) {
                throw null;
            }
        } else {
            int i6 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
            int iIdentityHashCode = System.identityHashCode(this);
            if (i6 != (-1305465912) + (((~((-286288426) | (~iIdentityHashCode))) | (~((-1116275969) | iIdentityHashCode))) * (-272)) + (((~((-894728826) | iIdentityHashCode)) | 608440400) * (-272)) + (((~(iIdentityHashCode | 894728825)) | (-1724716369)) * 272)) {
                throw null;
            }
        }
        int i7 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int i8 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
        if (i7 != 1651484836 + (((~((-253267075) | i8)) | 1969178405) * (-933)) + (((~(i8 | 1969178405)) | (-2136985512)) * 933) + 867677657) {
            throw null;
        }
        super.onResume();
        int i9 = INotificationSideChannel + 109;
        cancel = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) throws IllegalAccessException {
        NewWebviewCustomActivity newWebviewCustomActivity = (NewWebviewCustomActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 123;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i5 = ~elapsedCpuTime;
        int i6 = (~((-303897743) | i5)) | 34935812;
        int i7 = ~(elapsedCpuTime | 1402847215);
        if (i4 != 2107094972 + ((i6 | i7) * (-713)) + (i7 * 1426) + ((~(1133885285 | i5)) * 713)) {
            int i8 = 2113977116 % 2;
            throw new ArithmeticException();
        }
        int i9 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        if (i9 != (-881027592) + (((~((~iMaxMemory) | (-439961601))) | (-2139094365)) * (-591)) + ((iMaxMemory | (-439961601)) * 591)) {
            throw null;
        }
        super.onStart();
        int i10 = INotificationSideChannel + 101;
        cancel = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = cancel + 31;
        INotificationSideChannel = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = ((Field) cacheInteropConfig.b[1]).getInt(null);
            int i4 = ~((int) SystemClock.uptimeMillis());
            if (i3 != ((310822950 + (((~((-948222440) | i4)) | 1778209982) * (-933))) + (((~(i4 | 1778209982)) | (-2046688768)) * 933)) - 1628099720) {
                throw null;
            }
        } else {
            int i5 = ((Field) cacheInteropConfig.b[0]).getInt(null);
            int i6 = ~System.identityHashCode(this);
            if (i5 != 39762945 + ((~((-20218373) | i6)) * (-783)) + (((~(i6 | (-1396081262))) | (-566093719)) * 783)) {
                throw null;
            }
        }
        int i7 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigationHidden;
        if (i7 != 2001023088 + (((~(i8 | 688041969)) | (-1891013996)) * (-668)) + ((688041969 | (~((-1891013996) | i8))) * 1336) + ((i8 | (-1353977867)) * 668)) {
            int i9 = 1799287912 % 2;
            throw new ArithmeticException();
        }
        super.onCreate(bundle);
        int i10 = INotificationSideChannel + 69;
        cancel = i10 % 128;
        if (i10 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(NewWebviewCustomActivity newWebviewCustomActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = cancel + 5;
            INotificationSideChannel = i2 % 128;
            int i3 = i2 % 2;
            newWebviewCustomActivity.MediaBrowserCompat();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i4 = INotificationSideChannel + 19;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            newWebviewCustomActivity.IconCompatParcelizer();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            newWebviewCustomActivity.IconCompatParcelizer();
            int i6 = INotificationSideChannel + 109;
            cancel = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityNewWebviewCustomBinding activityNewWebviewCustomBinding, View view) {
        int i = 2 % 2;
        int i2 = cancel + 103;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            activityNewWebviewCustomBinding.tvCloseBanner.setVisibility(48);
            return Unit.INSTANCE;
        }
        activityNewWebviewCustomBinding.tvCloseBanner.setVisibility(8);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(NewWebviewCustomActivity newWebviewCustomActivity) {
        String str;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 5;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        final getCombinedMessage getcombinedmessage = (getCombinedMessage) newWebviewCustomActivity.TuitionPaymentFragmentbindingInflater1.getValue();
        User user = (User) newWebviewCustomActivity.d.getValue();
        String strValueOf = String.valueOf(user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null);
        User user2 = (User) newWebviewCustomActivity.d.getValue();
        if (user2 != null) {
            int i4 = cancel + 107;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
            str = user2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } else {
            str = null;
        }
        String strValueOf2 = String.valueOf(str);
        User user3 = (User) newWebviewCustomActivity.d.getValue();
        VisionProvisioningRequest visionProvisioningRequest = new VisionProvisioningRequest(strValueOf, strValueOf2, String.valueOf(user3 != null ? user3.b : null));
        Intrinsics.checkNotNullParameter(visionProvisioningRequest, "");
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = getcombinedmessage.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(getcombinedmessage.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(visionProvisioningRequest)));
        final Function1 function1 = new Function1() { // from class: CameraAccessExceptionCompat
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getCombinedMessage.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getcombinedmessage, (BaseModel) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getReason
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getProblemString
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getCombinedMessage.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getcombinedmessage, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: toCameraAccessExceptionCompat
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        getcombinedmessage.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Unit unit = Unit.INSTANCE;
        int i6 = INotificationSideChannel + 5;
        cancel = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(NewWebviewCustomActivity newWebviewCustomActivity) {
        int i = 2 % 2;
        int i2 = cancel + 23;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        TermsAndAgreementVisionPlusActivity.Companion companion = TermsAndAgreementVisionPlusActivity.INSTANCE;
        TermsAndAgreementVisionPlusActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(newWebviewCustomActivity);
        Unit unit = Unit.INSTANCE;
        int i4 = INotificationSideChannel + 81;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ User b(NewWebviewCustomActivity newWebviewCustomActivity) {
        User userAsBinder;
        int i = 2 % 2;
        int i2 = cancel + 25;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) newWebviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            int i3 = 20 / 0;
        } else {
            userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) newWebviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
        int i4 = cancel + 19;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
        return userAsBinder;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        NewWebviewCustomActivity newWebviewCustomActivity = (NewWebviewCustomActivity) objArr[0];
        int i = 2 % 2;
        int i2 = cancel + 25;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        TermsAndAgreementRctiPlusActivity.Companion companion = TermsAndAgreementRctiPlusActivity.INSTANCE;
        TermsAndAgreementRctiPlusActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(newWebviewCustomActivity);
        Unit unit = Unit.INSTANCE;
        int i4 = cancel + 95;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityNewWebviewCustomBinding activityNewWebviewCustomBinding, NewWebviewCustomActivity newWebviewCustomActivity, View view) {
        int i = 2 % 2;
        int i2 = cancel + 43;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        activityNewWebviewCustomBinding.webView.setVisibility(0);
        activityNewWebviewCustomBinding.containerError.setVisibility(8);
        TuitionPaymentFragmentbindingInflater1(258471540, runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{newWebviewCustomActivity}, runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -258471537, runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        String str = newWebviewCustomActivity.g;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = cancel + 117;
            INotificationSideChannel = i4 % 128;
            int i5 = i4 % 2;
            str = null;
        }
        ((ActivityNewWebviewCustomBinding) ((ViewBinding) newWebviewCustomActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).webView.loadUrl(str);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(NewWebviewCustomActivity newWebviewCustomActivity) {
        int i = 2 % 2;
        int i2 = cancel + 23;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        ((getCombinedMessage) newWebviewCustomActivity.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
        Unit unit = Unit.INSTANCE;
        int i4 = cancel + 17;
        INotificationSideChannel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(NewWebviewCustomActivity newWebviewCustomActivity) {
        return (Unit) TuitionPaymentFragmentbindingInflater1(980932791, ActivityVideoListBinding.b(), new Object[]{newWebviewCustomActivity}, ActivityVideoListBinding.b(), ActivityVideoListBinding.b(), -980932791, ActivityVideoListBinding.b());
    }

    static {
        cancelAll = 0;
        g();
        INSTANCE = new Companion(null);
        int i = onTransact + 7;
        cancelAll = i % 128;
        int i2 = i % 2;
    }

    private final void onTransact() {
        TuitionPaymentFragmentbindingInflater1(258471540, runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -258471537, runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = cancel + 109;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 15;
        cancel = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_new_webview_custom;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        TuitionPaymentFragmentbindingInflater1(210245879, (-890787494) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, new Object[]{this}, runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), -210245878, ActivityVideoListBinding.b());
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle p0) {
        TuitionPaymentFragmentbindingInflater1(-735202094, runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this, p0}, runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ActivityVideoListBinding.b(), 735202096, ActivityVideoListBinding.b());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        TuitionPaymentFragmentbindingInflater1(-39879419, runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), new Object[]{this}, runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), runQueryOnBackgroundThread.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), 39879423, ActivityVideoListBinding.b());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancel + 11;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = INotificationSideChannel + 79;
        cancel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void g() {
        asInterface = new char[]{60088, 60051, 60062, 60034, 60040, 60117, 60041, 60049, 60047, 60052, 60053, 60048, 60072, 60091, 60058, 60045, 60054, 60063, 60043, 60073, 60050, 60055, 60083, 60056, 60060};
        asBinder = (char) 57188;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r5, byte r6, int r7) {
        /*
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r1 = com.bpjstku.presentation.util.NewWebviewCustomActivity.$$c
            int r5 = r5 + 113
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
        L28:
            int r5 = r5 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.NewWebviewCustomActivity.$$i(short, byte, int):java.lang.String");
    }
}
