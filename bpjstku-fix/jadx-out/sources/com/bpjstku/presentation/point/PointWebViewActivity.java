package com.bpjstku.presentation.point;

import android.app.AlertDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.DownloadListener;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.net.MailTo;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityPointWebViewBinding;
import com.bpjstku.presentation.point.PointWebViewActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.appbar.MaterialToolbar;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.AutoValue_LifecycleCameraRepository_Key;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0;
import defpackage.OutputConfigurationCompatApi28Impl;
import defpackage.VideoRecordEventStart;
import defpackage.ViewPortBuilder;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.acquireBuffer;
import defpackage.cacheInteropConfig;
import defpackage.generateCameraId;
import defpackage.getEventTime;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.outputFormatToAudioProfile;
import defpackage.outputFormatToAudioProfile.AnonymousClass4;
import defpackage.setCaptureRequestOption;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u000b8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u000b8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR$\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\b\u0010\u001aR2\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!j\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"`#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0015\u0010\t\u001a\u00020%8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b&\u0010'R\u0015\u0010\n\u001a\u00020(8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010'R\u0016\u0010&\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010*R\u0015\u0010\b\u001a\u00020,8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b+\u0010'R \u00100\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00020-8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010/R\u0014\u0010)\u001a\u00020\u000b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u00101"}, d2 = {"Lcom/bpjstku/presentation/point/PointWebViewActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityPointWebViewBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "", "p0", "Landroid/view/KeyEvent;", "p1", "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/view/MenuItem;", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "I", "TuitionPaymentFragmentbindingInflater1", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "Landroid/webkit/ValueCallback;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/HashMap;", "", "Lkotlin/collections/TuitionPaymentFragmentbindingInflater1;", "Ljava/util/HashMap;", "LoutputFormatToAudioProfile;", "d", "Lkotlin/Lazy;", "LacquireBuffer;", "onTransact", "Ljava/lang/String;", "g", "LsetCaptureRequestOption;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "cancelAll", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PointWebViewActivity extends BindingBaseActivity<ActivityPointWebViewBinding> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long cancel;
    private static int cancelAll;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy asBinder;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private ValueCallback<Uri[]> b;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy a;
    private static final byte[] $$a = {83, -4, -55, -17, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 12;
    private static int getInterfaceDescriptor = 1;
    private static int notify = 0;
    private static int INotificationSideChannel = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 100;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1 = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 11;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private HashMap<String, String> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy asInterface = LazyKt.lazy(new Function0() { // from class: getMaxZoom
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PointWebViewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private String d = "";

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private String g = "";

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i5);
        int i9 = ~i6;
        int i10 = (~(i9 | i)) | i8;
        int i11 = ~i5;
        int i12 = i11 | i;
        int i13 = i10 | (~i12);
        int i14 = i7 | i6;
        int i15 = i8 | (~i14);
        int i16 = (~(i5 | i14)) | (~(i7 | i9 | i11)) | (~(i12 | i6));
        int i17 = i + i6 + i3 + ((-1254723898) * i2) + ((-1667789834) * i4);
        int i18 = i17 * i17;
        int i19 = ((-534547663) * i) + 1379663872 + ((-481802647) * i6) + ((-17581672) * i13) + (35163344 * i15) + (17581672 * i16) + ((-499384320) * i3) + ((-1033371648) * i2) + ((-106430464) * i4) + (1552875520 * i18);
        int i20 = ((i * (-402395399)) - 1316031342) + (i6 * (-402392591)) + (i13 * (-936)) + (i15 * 1872) + (i16 * 936) + (i3 * (-402393527)) + (i2 * (-1219896714)) + (i4 * (-610841306)) + (i18 * (-825819136));
        int i21 = i19 + (i20 * i20 * (-1063190528));
        if (i21 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i21 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i21 != 3) {
            return i21 != 4 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        int i22 = 2 % 2;
        int i23 = INotificationSideChannel + 63;
        notify = i23 % 128;
        int i24 = i23 % 2;
        PointWebViewActivity$bindingInflater$1 pointWebViewActivity$bindingInflater$1 = PointWebViewActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        int i25 = notify + 15;
        INotificationSideChannel = i25 % 128;
        int i26 = i25 % 2;
        return pointWebViewActivity$bindingInflater$1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 1
            byte[] r0 = com.bpjstku.presentation.point.PointWebViewActivity.$$a
            int r8 = r8 + 4
            int r9 = r9 * 14
            int r9 = 98 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            int r8 = r8 + 1
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.point.PointWebViewActivity.c(int, short, short, java.lang.Object[]):void");
    }

    public PointWebViewActivity() {
        final PointWebViewActivity pointWebViewActivity = this;
        this.asBinder = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.point.PointWebViewActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = pointWebViewActivity;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final PointWebViewActivity pointWebViewActivity2 = this;
        this.a = LazyKt.lazy(new Function0<setCaptureRequestOption>() { // from class: com.bpjstku.presentation.point.PointWebViewActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setCaptureRequestOption] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setCaptureRequestOption invoke() {
                LifecycleOwner lifecycleOwner = pointWebViewActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(setCaptureRequestOption.class);
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

    public static final /* synthetic */ HashMap TuitionPaymentFragmentbindingInflater1(PointWebViewActivity pointWebViewActivity) {
        int i = 2 % 2;
        int i2 = notify + 27;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        HashMap<String, String> map = pointWebViewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = i3 + 99;
        notify = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(PointWebViewActivity pointWebViewActivity, int i) {
        int i2 = 2 % 2;
        int i3 = INotificationSideChannel + 31;
        notify = i3 % 128;
        int i4 = i3 % 2;
        String str = (String) MapsKt.mapOf(TuplesKt.to(-4, "User authentication failed on server"), TuplesKt.to(-8, "The server is taking too much time to communicate. Try again later."), TuplesKt.to(-15, "Too many requests during this load"), TuplesKt.to(-1, "Generic error"), TuplesKt.to(-12, "Check entered URL.."), TuplesKt.to(-6, "Error timeout.."), TuplesKt.to(-11, "Failed to perform SSL handshake"), TuplesKt.to(-2, "Server or proxy hostname lookup failed"), TuplesKt.to(-5, "User authentication failed on proxy"), TuplesKt.to(-9, "Too many redirects"), TuplesKt.to(-3, "Unsupported authentication scheme (not basic or digest)"), TuplesKt.to(-10, "unsupported scheme"), TuplesKt.to(-13, "Generic file error"), TuplesKt.to(-14, "File not found"), TuplesKt.to(-7, "The server failed to communicate. Try again later.")).get(Integer.valueOf(i));
        if (str != null) {
            int i5 = notify + 57;
            INotificationSideChannel = i5 % 128;
            if (i5 % 2 != 0) {
                ConstraintLayout constraintLayout = ((ActivityPointWebViewBinding) ((ViewBinding) pointWebViewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).main;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(constraintLayout, str);
            } else {
                ConstraintLayout constraintLayout2 = ((ActivityPointWebViewBinding) ((ViewBinding) pointWebViewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).main;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(constraintLayout2, str);
                int i6 = 60 / 0;
            }
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        PointWebViewActivity pointWebViewActivity = (PointWebViewActivity) objArr[0];
        int i = 2 % 2;
        int i2 = notify + 87;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = pointWebViewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i3 != 0) {
            return Integer.valueOf(i4);
        }
        throw null;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(PointWebViewActivity pointWebViewActivity, ValueCallback valueCallback) {
        int i = 2 % 2;
        int i2 = notify + 17;
        int i3 = i2 % 128;
        INotificationSideChannel = i3;
        int i4 = i2 % 2;
        pointWebViewActivity.b = valueCallback;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 17;
        notify = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        PointWebViewActivity pointWebViewActivity = (PointWebViewActivity) objArr[0];
        int i = 2 % 2;
        int i2 = INotificationSideChannel;
        int i3 = i2 + 17;
        notify = i3 % 128;
        int i4 = i3 % 2;
        ValueCallback<Uri[]> valueCallback = pointWebViewActivity.b;
        int i5 = i2 + 103;
        notify = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return valueCallback;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 41;
        notify = i2 % 128;
        int i3 = i2 % 2;
        MaterialToolbar materialToolbar = ((ActivityPointWebViewBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).toolbar.toolbar;
        if (materialToolbar != null) {
            materialToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: resetZoom
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PointWebViewActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, view);
                }
            });
            int i4 = INotificationSideChannel + 41;
            notify = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        String stringExtra;
        int i = 2 % 2;
        Intent intent = getIntent();
        String str = "";
        if (intent != null) {
            int i2 = notify + 83;
            INotificationSideChannel = i2 % 128;
            if (i2 % 2 == 0) {
                intent.getStringExtra(ImagesContract.URL);
                throw null;
            }
            stringExtra = intent.getStringExtra(ImagesContract.URL);
            if (stringExtra == null) {
                stringExtra = "";
            }
        } else {
            stringExtra = "";
        }
        this.d = stringExtra;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            int i3 = notify + 61;
            INotificationSideChannel = i3 % 128;
            int i4 = i3 % 2;
            String stringExtra2 = intent2.getStringExtra("key");
            if (stringExtra2 != null) {
                str = stringExtra2;
            }
        }
        this.g = str;
        int i5 = INotificationSideChannel + 61;
        notify = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $11 + 49;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19472), 2624 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() | (cancel + 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - View.resolveSize(0, 0)), (-16776735) - Color.rgb(0, 0, 0), 37 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19472 - Color.blue(0)), (ViewConfiguration.getEdgeSlop() >> 16) + 2624, Process.getGidForName("") + 14, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (cancel ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 39423), 481 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            int i6 = $10 + 11;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (View.MeasureSpec.getMode(0) + 39422), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 480, View.combineMeasuredStates(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = (outputFormatToAudioProfile) this.asInterface.getValue();
        String[] strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        VideoRecordEventStart videoRecordEventStartCompose = VideoRecordEventStart.just(outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2).compose(outputformattoaudioprofile.new AnonymousClass4((String[]) Arrays.copyOf(strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, strArrTuitionPaymentFragmentspecialinlinedviewModeldefault2.length)));
        final Function1 function1 = new Function1() { // from class: getStreamSpec
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Boolean) obj};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return (Unit) PointWebViewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-446960292, objArr, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 446960292);
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartCompose.subscribe(new logToString() { // from class: setZoomRatio
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                PointWebViewActivity.b(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        ((acquireBuffer) this.asBinder.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
        if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_NOTIFICATION_POLICY") != 0) {
            int i2 = INotificationSideChannel + 43;
            notify = i2 % 128;
            if (i2 % 2 != 0) {
                String[] strArr = new String[0];
                strArr[1] = "android.permission.ACCESS_NOTIFICATION_POLICY";
                ActivityCompat.requestPermissions(this, strArr, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            } else {
                ActivityCompat.requestPermissions(this, new String[]{"android.permission.ACCESS_NOTIFICATION_POLICY"}, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        PointWebViewActivity pointWebViewActivity = this;
        Intrinsics.checkNotNullParameter(pointWebViewActivity, "");
        pointWebViewActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityPointWebViewBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).toolbar.toolbar, true);
        ((ActivityPointWebViewBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).toolbar.tvToolbarTitle.setText("Poin Saya");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.put("Auth", this.g);
        final ActivityPointWebViewBinding activityPointWebViewBinding = (ActivityPointWebViewBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityPointWebViewBinding.browser.getSettings().setJavaScriptEnabled(true);
        activityPointWebViewBinding.browser.setDownloadListener(new DownloadListener() { // from class: getCropSensorRegion
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                PointWebViewActivity.b(activityPointWebViewBinding, this, str, str4);
            }
        });
        activityPointWebViewBinding.browser.getSettings().setSupportZoom(true);
        activityPointWebViewBinding.browser.getSettings().setCacheMode(-1);
        activityPointWebViewBinding.browser.getSettings().setDatabaseEnabled(true);
        activityPointWebViewBinding.browser.getSettings().setDomStorageEnabled(true);
        activityPointWebViewBinding.browser.getSettings().setUseWideViewPort(true);
        activityPointWebViewBinding.browser.getSettings().setLoadWithOverviewMode(true);
        activityPointWebViewBinding.browser.getSettings().setAllowContentAccess(true);
        activityPointWebViewBinding.browser.getSettings().setAllowFileAccess(true);
        activityPointWebViewBinding.browser.addJavascriptInterface(new OutputConfigurationCompatApi28Impl(getApplicationContext()), "Android");
        activityPointWebViewBinding.browser.getSettings().setPluginState(WebSettings.PluginState.ON);
        WebView.setWebContentsDebuggingEnabled(false);
        activityPointWebViewBinding.browser.setWebChromeClient(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityPointWebViewBinding));
        activityPointWebViewBinding.browser.setWebViewClient(new b());
        activityPointWebViewBinding.browser.loadUrl(this.d, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        int i3 = notify + 123;
        INotificationSideChannel = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends WebChromeClient {
        private /* synthetic */ ActivityPointWebViewBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityPointWebViewBinding activityPointWebViewBinding) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = activityPointWebViewBinding;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(valueCallback, "");
            Intrinsics.checkNotNullParameter(fileChooserParams, "");
            Object[] objArr = {PointWebViewActivity.this};
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (((ValueCallback) PointWebViewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-479547487, objArr, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 479547488)) != null) {
                Object[] objArr2 = {PointWebViewActivity.this};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                ValueCallback valueCallback2 = (ValueCallback) PointWebViewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-479547487, objArr2, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 479547488);
                Intrinsics.checkNotNull(valueCallback2);
                valueCallback2.onReceiveValue(null);
                PointWebViewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(PointWebViewActivity.this, null);
            }
            PointWebViewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(PointWebViewActivity.this, valueCallback);
            Intent intentCreateIntent = fileChooserParams.createIntent();
            intentCreateIntent.addCategory("android.intent.category.OPENABLE");
            intentCreateIntent.setType("*/*");
            try {
                PointWebViewActivity pointWebViewActivity = PointWebViewActivity.this;
                Intrinsics.checkNotNull(intentCreateIntent);
                Object[] objArr3 = {PointWebViewActivity.this};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                pointWebViewActivity.startActivityForResult(intentCreateIntent, ((Integer) PointWebViewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1906926582, objArr3, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1906926578)).intValue());
                return true;
            } catch (Exception unused) {
                PointWebViewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(PointWebViewActivity.this, null);
                return false;
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onPermissionRequest(PermissionRequest permissionRequest) {
            Intrinsics.checkNotNullParameter(permissionRequest, "");
            permissionRequest.grant(permissionRequest.getResources());
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.progressBar.setProgress(i);
            if (i < 100 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.progressBar.getVisibility() == 8) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.progressBar.setVisibility(0);
            }
            if (i == 100) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.progressBar.setVisibility(8);
            }
        }
    }

    public static final class b extends WebViewClient {
        b() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (StringsKt.startsWith$default(str, "tel:", false, 2, (Object) null) || StringsKt.startsWith$default(str, MailTo.MAILTO_SCHEME, false, 2, (Object) null)) {
                webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }
            webView.loadUrl(str, PointWebViewActivity.TuitionPaymentFragmentbindingInflater1(PointWebViewActivity.this));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Context context;
            if (!StringsKt.startsWith$default(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null), "tel:", false, 2, (Object) null)) {
                if (!StringsKt.startsWith$default(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null), MailTo.MAILTO_SCHEME, false, 2, (Object) null)) {
                    if (webView == null) {
                        return true;
                    }
                    webView.loadUrl(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null), PointWebViewActivity.TuitionPaymentFragmentbindingInflater1(PointWebViewActivity.this));
                    return true;
                }
            }
            if (webView == null || (context = webView.getContext()) == null) {
                return true;
            }
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null))));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (webResourceError != null) {
                PointWebViewActivity.TuitionPaymentFragmentbindingInflater1(PointWebViewActivity.this, webResourceError.getErrorCode());
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int p0, KeyEvent p1) {
        int i = 2 % 2;
        Object obj = null;
        if (p0 == 4) {
            int i2 = INotificationSideChannel + 47;
            notify = i2 % 128;
            if (i2 % 2 != 0) {
                ((ActivityPointWebViewBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).browser.canGoBack();
                obj.hashCode();
                throw null;
            }
            if (((ActivityPointWebViewBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).browser.canGoBack()) {
                ((ActivityPointWebViewBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).browser.goBack();
                int i3 = notify + 81;
                INotificationSideChannel = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
        }
        finish();
        boolean zOnKeyDown = super.onKeyDown(p0, p1);
        int i5 = INotificationSideChannel + 19;
        notify = i5 % 128;
        if (i5 % 2 == 0) {
            return zOnKeyDown;
        }
        throw null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int p0, int p1, Intent p2) {
        int i = 2 % 2;
        if (p0 == this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i2 = notify + 1;
            int i3 = i2 % 128;
            INotificationSideChannel = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            ValueCallback<Uri[]> valueCallback = this.b;
            if (valueCallback != null) {
                int i4 = i3 + 49;
                notify = i4 % 128;
                int i5 = i4 % 2;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(p1, p2));
                    int i6 = notify + 89;
                    INotificationSideChannel = i6 % 128;
                    int i7 = i6 % 2;
                }
                this.b = null;
            }
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = notify + 21;
        INotificationSideChannel = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i3 = notify + 63;
                INotificationSideChannel = i3 % 128;
                int i4 = i3 % 2;
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i5 = INotificationSideChannel + 111;
            notify = i5 % 128;
            int i6 = i5 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.point.PointWebViewActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/bpjstku/presentation/point/PointWebViewActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0, String p1, String p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intent intent = new Intent(p0, (Class<?>) PointWebViewActivity.class);
            intent.putExtra(ImagesContract.URL, p1);
            intent.putExtra("key", p2);
            p0.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 73;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 1031;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 16;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) 52, bArr[132], bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, capsMode, iLastIndexOf, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{51540, 18518, 52043, 19040, 52590, 19485, 53023, 20032, 49458, 16435, 50073, 17129, 50640, 17647, 51191, 18067, 55688, 22699, 56243, 23213, 56402, 24399}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 32925, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{51536, 64974, 41082, 21632, 6938, 53155, 62171, 47430, 28136, 4123, 50367, 35644, 48712, 25331, 10514}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_other).substring(16, 20).length() + 13459, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int i4 = 1031 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int iResolveSizeAndState = 15 - View.resolveSizeAndState(0, 0, 0);
            byte b2 = (byte) 52;
            Object[] objArr5 = new Object[1];
            c(b2, (short) (b2 - 1), $$a[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i4, iResolveSizeAndState, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1031;
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 16;
                byte b3 = $$a[7];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                c(b4, (short) (b4 | 103), b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, touchSlop, iLastIndexOf2, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 528057726;
            int i7 = ~iCodePointAt;
            int i8 = ((((-318985150) + (((~((-94505458) | i7)) | (-149774713)) * (-865))) + ((~(iCodePointAt | 94505457)) * 865)) + (((~((-149774713) | i7)) | (~(i7 | 94505457))) * 865)) - 2095860937;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{51551, 6721, 28521, 45163, 34127, 54832, 15146, 3272, 20986, 41638, 63412, 55467, 11706, 29008, 17014, 38755}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 54001, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{51548, 60072, 36514, 41648, 18085, 31361, 7831, 12931, 54965, 35477, 44796, 17134, 26330, 6911, 16079, 53959}, 9209 - Color.blue(0), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-2115505718};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 46039), 1134 - TextUtils.indexOf("", "", 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 17, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -2095860937, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                    int threadPriority = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15;
                    byte[] bArr2 = $$a;
                    short s = bArr2[132];
                    byte b5 = bArr2[5];
                    Object[] objArr12 = new Object[1];
                    c((byte) 52, s, b5, objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, threadPriority, keyRepeatDelay, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - TextUtils.getOffsetAfter("", 0)), 1117 - TextUtils.indexOf("", "", 0, 0), TextUtils.lastIndexOf("", '0', 0) + 18), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char defaultSize = (char) View.getDefaultSize(0, 0);
                    int touchSlop2 = 1031 - (ViewConfiguration.getTouchSlop() >> 8);
                    int maxKeyCode = 15 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte b6 = $$a[7];
                    byte b7 = b6;
                    Object[] objArr13 = new Object[1];
                    c(b7, (short) (b7 | 103), b6, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize, touchSlop2, maxKeyCode, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{51540, 18518, 52043, 19040, 52590, 19485, 53023, 20032, 49458, 16435, 50073, 17129, 50640, 17647, 51191, 18067, 55688, 22699, 56243, 23213, 56402, 24399}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33036, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{51536, 64974, 41082, 21632, 6938, 53155, 62171, 47430, 28136, 4123, 50367, 35644, 48712, 25331, 10514}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri__e_cash_instruction_step2).substring(1, 3).codePointAt(1) + 13358, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c3 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int gidForName = Process.getGidForName("") + 1032;
                        int iRed = Color.red(0) + 15;
                        byte b8 = (byte) 52;
                        Object[] objArr16 = new Object[1];
                        c(b8, (short) (b8 - 1), $$a[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, gidForName, iRed, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1031;
                        int offsetAfter = 15 - TextUtils.getOffsetAfter("", 0);
                        byte[] bArr3 = $$a;
                        Object[] objArr17 = new Object[1];
                        c((byte) 52, bArr3[132], bArr3[5], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(doubleTapTimeout, maximumDrawingCacheSize, offsetAfter, 1357589585, false, (String) objArr17[0], null);
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
        int i11 = ((int[]) objArr[1])[0];
        int i12 = ((int[]) objArr[3])[0];
        if (i12 == i11) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i13 = ((int[]) objArr[2])[0];
            int i14 = ((int[]) objArr[3])[0];
            int i15 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i16 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1724204488;
            int i17 = i13 + (-1410750159) + ((863016106 | i16) * 376) + (((~((~i16) | 688483083)) | 309367968) * (-376)) + (((~(i16 | (-688483084))) | (-444202914)) * 376);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr18[2])[0] = i19 ^ (i19 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i20 = notify + 23;
                INotificationSideChannel = i20 % 128;
                int i21 = i20 % 2;
                int i22 = 0;
                while (i22 < strArr3.length) {
                    arrayList.add(strArr3[i22]);
                    i22++;
                    int i23 = INotificationSideChannel + 39;
                    notify = i23 % 128;
                    int i24 = i23 % 2;
                }
            }
            int[] iArr = new int[i12];
            int i25 = i12 - 1;
            iArr[i25] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i25) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[3])[0];
            int i28 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int i29 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp | (-761062268));
            int i30 = i26 + (-786709061) + (((-1005342438) | i29) * (-220)) + ((i29 | 68198682) * 220) + 1075144110;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr19[2])[0] = i32 ^ (i32 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cIndexOf2 = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            int gidForName2 = Process.getGidForName("") + 1756;
            int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0) + 24;
            byte b9 = (byte) 37;
            Object[] objArr20 = new Object[1];
            c(b9, (short) (b9 | 66), $$a[5], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cIndexOf2, gidForName2, iLastIndexOf3, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            int i33 = INotificationSideChannel + 57;
            notify = i33 % 128;
            int i34 = i33 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29944);
                int iIndexOf = 1755 - TextUtils.indexOf("", "", 0);
                int iBlue = Color.blue(0) + 23;
                byte b10 = (byte) 52;
                Object[] objArr21 = new Object[1];
                c(b10, (short) (b10 - 1), $$a[5], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(keyRepeatTimeout, iIndexOf, iBlue, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i35 = ((int[]) objArr22[0])[0];
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = new Object[]{new int[]{i35}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
            int i36 = ~layoutDirection;
            int i37 = ((2032272375 + (((~(315013519 | i36)) | (~((-527615946) | layoutDirection))) * 210)) + (((~(layoutDirection | 536281039)) | (~(i36 | (-306348426)))) * 210)) - 1737011228;
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0] = i39 ^ (i39 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{51551, 6721, 28521, 45163, 34127, 54832, 15146, 3272, 20986, 41638, 63412, 55467, 11706, 29008, 17014, 38755}, Color.alpha(0) + 54037, objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{51548, 60072, 36514, 41648, 18085, 31361, 7831, 12931, 54965, 35477, 44796, 17134, 26330, 6911, 16079, 53959}, 9210 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-2115505718};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - TextUtils.getOffsetBefore("", 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1726, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentbindingInflater1$5f1425da = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -1737011228);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char c4 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29943);
                int jumpTapTimeout = 1755 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i40 = 24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                byte b11 = (byte) 52;
                Object[] objArr26 = new Object[1];
                c(b11, (short) (b11 - 1), $$a[5], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c4, jumpTapTimeout, i40, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{51540, 18518, 52043, 19040, 52590, 19485, 53023, 20032, 49458, 16435, 50073, 17129, 50640, 17647, 51191, 18067, 55688, 22699, 56243, 23213, 56402, 24399}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 33036, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{51536, 64974, 41082, 21632, 6938, 53155, 62171, 47430, 28136, 4123, 50367, 35644, 48712, 25331, 10514}, 13463 - Color.green(0), objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cArgb = (char) (Color.argb(0, 0, 0, 0) + 29944);
                    int iAlpha = 1755 - Color.alpha(0);
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 24;
                    Object[] objArr29 = new Object[1];
                    c((byte) 52, (short) ($$b | 128), $$a[5], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cArgb, iAlpha, modifierMetaStateMask, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c5 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29945);
                    int i41 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int defaultSize2 = View.getDefaultSize(0, 0) + 23;
                    byte b12 = (byte) 37;
                    Object[] objArr30 = new Object[1];
                    c(b12, (short) (b12 | 66), $$a[5], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c5, i41, defaultSize2, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i42 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0];
        int i43 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        if (i43 == i42) {
            int i44 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
            int i45 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
            Object[] objArr31 = {new int[]{i45}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i46 = i44 + 68489031 + (((~((~iIdentityHashCode) | (-722046370))) | (~((-67383819) | iIdentityHashCode))) * (-302)) + ((~((-722046370) | iIdentityHashCode)) * (-604)) + (((~(iIdentityHashCode | (-789430188))) | (-1069416432)) * 302);
            int i47 = (i46 << 13) ^ i46;
            int i48 = i47 ^ (i47 >>> 17);
            ((int[]) objArr31[3])[0] = i48 ^ (i48 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr5 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4];
        if (strArr5 != null) {
            int i49 = 0;
            while (i49 < strArr5.length) {
                int i50 = notify + 81;
                INotificationSideChannel = i50 % 128;
                if (i50 % 2 == 0) {
                    arrayList2.add(strArr5[i49]);
                    i49 += 7;
                } else {
                    arrayList2.add(strArr5[i49]);
                    i49++;
                }
            }
        }
        int[] iArr2 = new int[i43];
        int i51 = i43 - 1;
        iArr2[i51] = 1;
        Toast.makeText((Context) null, iArr2[((i43 * i51) % 2) - 1], 1).show();
        int i52 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[3])[0];
        int i53 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[0])[0];
        Object[] objArr32 = {new int[]{i53}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$5f1425da[4]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i54 = ~iIdentityHashCode2;
        int i55 = (~((-62155217) | i54)) | 50350480 | (~(150447209 | i54));
        int i56 = i52 + (-340065893) + (((~(iIdentityHashCode2 | (-138642474))) | i55) * 590) + (i55 * (-1180)) + (((~((-150447210) | i54)) | (~(i54 | 62155216))) * 590);
        int i57 = (i56 << 13) ^ i56;
        int i58 = i57 ^ (i57 >>> 17);
        ((int[]) objArr32[3])[0] = i58 ^ (i58 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -651257452
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.point.PointWebViewActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        int i3 = ~layoutDirection;
        if (i2 != 1168966376 + (((~(1426518635 | i3)) | 579339668) * 168) + ((~((-579339669) | layoutDirection)) * 168) + (((~(layoutDirection | 2005858303)) | (~(i3 | (-596531093))) | 17191424) * 168)) {
            int[] iArr = new int[939184493];
            iArr[939184492] = 1;
            int i4 = 1379686140 % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i5 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i6 = ~iIdentityHashCode;
        int i7 = ~((-270587828) | i6);
        int i8 = ~(1986499158 | iIdentityHashCode);
        if (i5 != 1385593784 + ((i7 | i8) * 1150) + (((~((-1986499159) | i6)) | i8) * (-575)) + (((~(iIdentityHashCode | (-270587828))) | (~(i6 | 270587827))) * 575)) {
            int[] iArr2 = new int[735087849];
            iArr2[735087848] = 1;
            int i9 = 1650401064 % 2;
            Toast.makeText((Context) null, iArr2[-1], 1).show();
            int i10 = INotificationSideChannel + 107;
            notify = i10 % 128;
            int i11 = i10 % 2;
        }
        super.onStart();
        int i12 = INotificationSideChannel + 93;
        notify = i12 % 128;
        int i13 = i12 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws IllegalAccessException {
        PointWebViewActivity pointWebViewActivity = (PointWebViewActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        int i2 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        if (i2 != ((1420565080 + (((~elapsedCpuTime) | 1988603689) * 1444)) + (((~(elapsedCpuTime | (-1550345473))) | ((~(720357929 | elapsedCpuTime)) | 1409295616)) * (-1444))) - 1252787316) {
            int i3 = INotificationSideChannel + 5;
            notify = i3 % 128;
            int i4 = i3 % 2;
            int[] iArr = new int[1750131610];
            iArr[1750131609] = 1;
            int i5 = (-1035365110) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        int i6 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i7 = ~iUptimeMillis;
        if (i6 != 767966968 + ((2041528315 | i7) * (-369)) + (((~((-554317170) | i7)) | 2024738795) * (-369)) + (((~(iUptimeMillis | 554317169)) | 1487211146 | (~(i7 | (-16789521)))) * 369)) {
            throw new RuntimeException("-1216181909");
        }
        super.onCreate(bundle);
        int i8 = notify + 101;
        INotificationSideChannel = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 48 / 0;
        }
        return null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(PointWebViewActivity pointWebViewActivity) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 31;
        notify = i2 % 128;
        int i3 = i2 % 2;
        pointWebViewActivity.d_();
        int i4 = notify + 15;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        PointWebViewActivity pointWebViewActivity = (PointWebViewActivity) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        int i2 = notify + 25;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        if (!bool.booleanValue()) {
            int i4 = INotificationSideChannel + 19;
            notify = i4 % 128;
            if (i4 % 2 != 0) {
                PointWebViewActivity pointWebViewActivity2 = pointWebViewActivity;
                String string = pointWebViewActivity.getString(R.string.message_storage_permission_required);
                Intrinsics.checkNotNullExpressionValue(string, "");
                AutoValue_LifecycleCameraRepository_Key.b(pointWebViewActivity2, string);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            PointWebViewActivity pointWebViewActivity3 = pointWebViewActivity;
            String string2 = pointWebViewActivity.getString(R.string.message_storage_permission_required);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            AutoValue_LifecycleCameraRepository_Key.b(pointWebViewActivity3, string2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 79;
        notify = i2 % 128;
        if (i2 % 2 != 0) {
            dialogInterface.dismiss();
            int i3 = 34 / 0;
        } else {
            dialogInterface.dismiss();
        }
        int i4 = notify + 75;
        INotificationSideChannel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void b(ActivityPointWebViewBinding activityPointWebViewBinding, PointWebViewActivity pointWebViewActivity, String str, String str2) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 111;
        notify = i2 % 128;
        int i3 = i2 % 2;
        activityPointWebViewBinding.browser.loadUrl(OutputConfigurationCompatApi28Impl.TuitionPaymentFragmentbindingInflater1(str, str2), pointWebViewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        int i4 = INotificationSideChannel + 21;
        notify = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ outputFormatToAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3(PointWebViewActivity pointWebViewActivity) {
        int i = 2 % 2;
        outputFormatToAudioProfile outputformattoaudioprofile = new outputFormatToAudioProfile(pointWebViewActivity);
        int i2 = notify + 13;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        return outputformattoaudioprofile;
    }

    public static /* synthetic */ void b(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = notify + 99;
        INotificationSideChannel = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = INotificationSideChannel + 65;
        notify = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final PointWebViewActivity pointWebViewActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(pointWebViewActivity);
            builder.setMessage("Apakah Anda yakin ingin keluar dari menu ini?").setCancelable(false).setPositiveButton("Ya", new DialogInterface.OnClickListener() { // from class: getMinZoom
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    PointWebViewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }).setNegativeButton("Tidak", new DialogInterface.OnClickListener() { // from class: onCaptureResult
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    PointWebViewActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(dialogInterface);
                }
            });
            builder.create().show();
            ViewPortBuilder.b();
            int i2 = notify + 71;
            INotificationSideChannel = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(PointWebViewActivity pointWebViewActivity, Boolean bool) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault3(-446960292, new Object[]{pointWebViewActivity, bool}, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 446960292);
    }

    static {
        cancelAll = 0;
        g();
        INSTANCE = new Companion(null);
        int i = getInterfaceDescriptor + 11;
        cancelAll = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault1(PointWebViewActivity pointWebViewActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault3(1906926582, new Object[]{pointWebViewActivity}, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1906926578)).intValue();
    }

    public static final /* synthetic */ ValueCallback b(PointWebViewActivity pointWebViewActivity) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (ValueCallback) TuitionPaymentFragmentspecialinlinedviewModeldefault3(-479547487, new Object[]{pointWebViewActivity}, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 479547488);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityPointWebViewBinding> TuitionPaymentFragmentbindingInflater1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Function1) TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2104527444, new Object[]{this}, (-1542647250) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), (-1167865837) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7), Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 2104527447);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 95;
        notify = i2 % 128;
        if (i2 % 2 == 0) {
            return R.layout.activity_point_web_view;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 81;
        notify = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = notify + 97;
        INotificationSideChannel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(-847345000, new Object[]{this, bundle}, Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.installment_required).substring(16, 18).codePointAt(0) + 2010205955, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 847345002);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 19;
        notify = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = INotificationSideChannel + 45;
        notify = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        cancel = -3987404974164451282L;
    }
}
