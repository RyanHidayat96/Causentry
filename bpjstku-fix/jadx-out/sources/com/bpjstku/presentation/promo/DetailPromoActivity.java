package com.bpjstku.presentation.promo;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.promo.model.request.DetailMerchantRequest;
import com.bpjstku.data.promo.model.request.DetailVoucherRequest;
import com.bpjstku.data.promo.model.request.RedeemRequest;
import com.bpjstku.data.promo.model.response.RedeemResponse;
import com.bpjstku.databinding.ActivityDetailMerchantBinding;
import com.bpjstku.databinding.ActivityLoginBinding;
import com.bpjstku.domain.promo.model.DetailMerchant;
import com.bpjstku.domain.promo.model.VoucherItem;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.promo.DetailPromoActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.button.MaterialButton;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.CoordinateTransform;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.SessionProcessor;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.ZoomGestureDetectorZoomEvent;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.deriveCodec;
import defpackage.getEventTime;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.lambdacreateCameraSelectorById0;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onCaptureSessionEnd;
import defpackage.onResume;
import defpackage.refresh;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import defpackage.triggerAf;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.io.FileTreeWalk;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0004R\u0015\u0010\u000f\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0015\u0010\u0007\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0015\u0010\t\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020!8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\"R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00020#8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010%"}, d2 = {"Lcom/bpjstku/presentation/promo/DetailPromoActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityDetailMerchantBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Lcom/bpjstku/domain/promo/model/DetailMerchant;", "p0", "", "p1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/bpjstku/domain/promo/model/DetailMerchant;Z)V", "INotificationSideChannel", "Lrefresh;", "Lkotlin/Lazy;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "Ljava/lang/String;", "Z", "Lcom/bpjstku/domain/promo/model/VoucherItem;", "Lcom/bpjstku/domain/promo/model/VoucherItem;", "TuitionPaymentFragmentbindingInflater1", "g", "Lcom/bpjstku/domain/user/model/User;", "Lcom/bpjstku/domain/user/model/User;", "d", "LtriggerAf;", "", "()I", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DetailPromoActivity extends BindingBaseActivity<ActivityDetailMerchantBinding> {
    private static char INotificationSideChannel;
    private static int INotificationSideChannelStub;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char cancelAll;
    private static char d;
    private static char notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy asInterface;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private VoucherItem TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final User d;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {83, -90, 68, -23};
    private static final int $$f = 244;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {55, -47, -47, 67, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 91;
    private static int getInterfaceDescriptor = 1;
    private static int onTransact = 0;
    private static int cancel = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String a = "";

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i | i2 | (~i6);
        int i8 = (~((~i) | i2)) | (~(i | i6));
        int i9 = (~(i6 | (~i2))) | i;
        int i10 = i + i2 + i4 + ((-1069702238) * i5) + (1645725337 * i3);
        int i11 = i10 * i10;
        int i12 = ((i * 2084108943) - 1824784384) + (2084108943 * i2) + (i7 * (-929364622)) + (929364622 * i8) + ((-929364622) * i9) + (1154744320 * i4) + ((-1977090048) * i5) + (448004096 * i3) + (1807155200 * i11);
        int i13 = (i * (-999696423)) + 1136243370 + (i2 * (-999696423)) + (i7 * 830) + (i8 * (-830)) + (i9 * 830) + (i4 * (-999695593)) + (i5 * 636963214) + (i3 * (-1077364033)) + (i11 * 980484096);
        int i14 = i12 + (i13 * i13 * 1287192576);
        if (i14 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        if (i14 != 2) {
            return i14 != 3 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentbindingInflater1(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 145 - r7
            int r8 = r8 * 14
            int r8 = 98 - r8
            int r6 = r6 + 1
            byte[] r0 = com.bpjstku.presentation.promo.DetailPromoActivity.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r5 = r2
            r8 = r6
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r7]
        L25:
            int r7 = r7 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.DetailPromoActivity.e(int, int, byte, java.lang.Object[]):void");
    }

    public DetailPromoActivity() throws Throwable {
        final DetailPromoActivity detailPromoActivity = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<refresh>() { // from class: com.bpjstku.presentation.promo.DetailPromoActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, refresh] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ refresh invoke() {
                LifecycleOwner lifecycleOwner = detailPromoActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(refresh.class);
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
        final DetailPromoActivity detailPromoActivity2 = this;
        this.b = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.promo.DetailPromoActivity$special$$inlined$inject$default$1
            private static final byte[] $$c = {123, -2, -101, -104};
            private static final int $$d = 222;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {115, 25, -47, -94, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
            private static final int $$b = 115;
            private static int $TuitionPaymentFragmentbindingInflater1 = 0;
            private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -6377398940819159759L;
            private static int b = -981105359;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 57978;
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Code duplicated, block: B:10:0x002b  */
            /* JADX WARN: Code duplicated, block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(short r5, byte r6, short r7, java.lang.Object[] r8) {
                /*
                    byte[] r0 = com.bpjstku.presentation.promo.DetailPromoActivity$special$$inlined$inject$default$1.$$a
                    int r6 = r6 * 52
                    int r1 = r6 + 1
                    int r7 = r7 * 3
                    int r7 = 3 - r7
                    int r5 = r5 * 14
                    int r5 = 98 - r5
                    byte[] r1 = new byte[r1]
                    r2 = -1
                    if (r0 != 0) goto L16
                    r3 = r6
                    r5 = r7
                    goto L2d
                L16:
                    r4 = r7
                    r7 = r5
                    r5 = r4
                L19:
                    int r2 = r2 + 1
                    byte r3 = (byte) r7
                    r1[r2] = r3
                    int r5 = r5 + 1
                    if (r2 != r6) goto L2b
                    java.lang.String r5 = new java.lang.String
                    r6 = 0
                    r5.<init>(r1, r6)
                    r8[r6] = r5
                    return
                L2b:
                    r3 = r0[r5]
                L2d:
                    int r3 = -r3
                    int r7 = r7 + r3
                    int r7 = r7 + (-11)
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.DetailPromoActivity$special$$inlined$inject$default$1.c(short, byte, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ZoomGestureDetectorZoomEvent zoomGestureDetectorZoomEvent;
                int i = 2 % 2;
                int i2 = $TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
                $TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                if (i2 % 2 != 0) {
                    boolean z = detailPromoActivity2 instanceof getEventTime;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ComponentCallbacks componentCallbacks = detailPromoActivity2;
                mapPoint mappoint = this.$qualifier;
                Function0<CoordinateTransform> function0 = this.$parameters;
                if (!(!(componentCallbacks instanceof getEventTime))) {
                    ZoomGestureDetectorZoomEvent koin = ((getEventTime) componentCallbacks).getKoin();
                    int i3 = $TuitionPaymentFragmentbindingInflater1 + 23;
                    $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                    int i4 = i3 % 2;
                    zoomGestureDetectorZoomEvent = koin;
                } else {
                    zoomGestureDetectorZoomEvent = ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b;
                }
                return zoomGestureDetectorZoomEvent.b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), mappoint, function0);
            }

            private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
                int i2 = 2;
                int i3 = 2 % 2;
                SessionProcessor sessionProcessor = new SessionProcessor();
                int length = cArr2.length;
                char[] cArr4 = new char[length];
                int length2 = cArr.length;
                char[] cArr5 = new char[length2];
                int i4 = 0;
                System.arraycopy(cArr2, 0, cArr4, 0, length);
                System.arraycopy(cArr, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length3 = cArr3.length;
                char[] cArr6 = new char[length3];
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                    int i5 = $10 + 105;
                    $11 = i5 % 128;
                    int i6 = i5 % i2;
                    try {
                        Object[] objArr2 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 8328);
                            int modifierMetaStateMask = 1234 - ((byte) KeyEvent.getModifierMetaStateMask());
                            int i7 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 34;
                            byte b2 = (byte) i4;
                            byte b3 = (byte) (b2 - 1);
                            String str$$e = $$e(b2, b3, (byte) (b3 + 1));
                            Class[] clsArr = new Class[1];
                            clsArr[i4] = Object.class;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, modifierMetaStateMask, i7, -653973969, false, str$$e, clsArr);
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        try {
                            Object[] objArr3 = {sessionProcessor};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i4) + 2765;
                                int pressedStateDuration = 14 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                byte b4 = (byte) (-$$c[1]);
                                byte b5 = (byte) (b4 - 3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(trimmedLength, iIndexOf, pressedStateDuration, 1504416861, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            try {
                                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-16733891) - Color.rgb(0, 0, 0)), 253 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.getOffsetBefore("", 0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                try {
                                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        byte b6 = (byte) 1;
                                        byte b7 = (byte) (-b6);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - TextUtils.getOffsetAfter("", 0)), ImageFormat.getBitsPerPixel(0) + 2892, 17 - (KeyEvent.getMaxKeyCode() >> 16), 2012627446, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                                    cArr4[iIntValue2] = sessionProcessor.b;
                                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))));
                                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                                    i2 = 2;
                                    i4 = 0;
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
                int i8 = $10 + 77;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(java.lang.Class r33, int r34, int r35, int r36) {
                /*
                    Method dump skipped, instruction units count: 3508
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.DetailPromoActivity$special$$inlined$inject$default$1.TuitionPaymentFragmentbindingInflater1(java.lang.Class, int, int, int):java.lang.Object[]");
            }

            private static String $$e(byte b2, int i, int i2) {
                int i3 = i2 * 3;
                byte[] bArr = $$c;
                int i4 = i + 4;
                int i5 = b2 + 102;
                byte[] bArr2 = new byte[1 - i3];
                int i6 = 0 - i3;
                int i7 = -1;
                if (bArr == null) {
                    i5 += -i4;
                    i4 = i4;
                    i7 = -1;
                }
                while (true) {
                    int i8 = i7 + 1;
                    bArr2[i8] = (byte) i5;
                    if (i8 == i6) {
                        return new String(bArr2, 0);
                    }
                    int i9 = i4 + 1;
                    i5 += -bArr[i9];
                    i4 = i9;
                    i7 = i8;
                }
            }
        });
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        int i = 0;
        int i2 = ((Field) (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 46400), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 39, View.MeasureSpec.getMode(0) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null) : objTuitionPaymentFragmentspecialinlinedviewModeldefault3)).getInt(null);
        Object[] objArr = new Object[1];
        c(new char[]{61427, 59277, 50412, 46466, 54026, 39478, 43948, 51881, 28588, 14040, 33780, 58983, 20782, 25569, 56058, 42160, 55684, 4900, 26959, 18607, 29836, 58530, 22579, 46042}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_bni_mobile).substring(0, 14).codePointAt(9) - 88, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        c(new char[]{43422, 59517, 35352, 14833, 6638, 16034, 62202, 45392, 16640, 3177, 20126, 7856, 17733, 12884, 20693, 55680, 49405, 62750}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_4).substring(6, 7).length() + 14, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = -560;
        long jNextInt = new Random().nextInt();
        long j2 = -1;
        long j3 = jNextInt ^ j2;
        long j4 = (((long) (-559)) * 1541889876426289083L) + (((long) 561) * 555367298315669904L) + (((j3 | 1541889876426289083L) ^ j2) * j) + (j * ((((j2 ^ 555367298315669904L) | 1541889876426289083L) | jNextInt) ^ j2)) + (((long) 560) * ((j2 ^ (j3 | 555367298315669904L)) | (((j2 ^ 1541889876426289083L) | 555367298315669904L) ^ j2)));
        int i3 = 0;
        long j5 = jLongValue;
        while (true) {
            int i4 = 2;
            if (i3 != 10) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                int i5 = ((Field) (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null ? initSession.b((char) (KeyEvent.getDeadChar(i, i) + 37836), 59 - Gravity.getAbsoluteGravity(i, i), Gravity.getAbsoluteGravity(i, i) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null) : objTuitionPaymentFragmentspecialinlinedviewModeldefault4)).getInt(null);
                int i6 = i;
                long j6 = j5;
                while (true) {
                    int i7 = i4 % i4;
                    int i8 = i;
                    while (i8 != 8) {
                        i5 = (((((int) (j6 >> i8)) & 255) + (i5 << 6)) + (i5 << 16)) - i5;
                        i8++;
                        i6 = i6;
                    }
                    int i9 = i6;
                    if (i9 != 0) {
                        break;
                    }
                    i6 = i9 + 1;
                    j6 = j4;
                    i = 0;
                    i4 = 2;
                }
                if (i5 == i2) {
                    break;
                }
                int i10 = cancel + 89;
                onTransact = i10 % 128;
                int i11 = i10 % 2;
                j5 -= 1024;
                i3++;
                i = 0;
            } else {
                Object[] objArr3 = new Object[1];
                c(new char[]{28527, 62116, 53535, 21773, 6817, 56776, 25182, 52418, 3320, 35241, 842, 23134, 14573, 26968, 9906, 52404, 35738, 52997}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 82, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{3290, 43092, 257, 62949, 43618, 4977, 43342, 28189, 20111, 10300, 42486, 10672, 22816, 59517, 43993, 16730, 34223, 57373}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_token_message).substring(1, 2).length() + 15, objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {-2050511614};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 571275394, ((Constructor) (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null ? initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 46038), 1133 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.indexOf("", "") + 18, 807763283, false, null, new Class[]{Integer.TYPE}) : objTuitionPaymentFragmentspecialinlinedviewModeldefault5)).newInstance(objArr5), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                        int i12 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
                        int iCombineMeasuredStates = 15 - View.combineMeasuredStates(0, 0);
                        Object[] objArr7 = new Object[1];
                        e((byte) 52, (short) 141, $$a[132], objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mirror, i12, iCombineMeasuredStates, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 45994), 1117 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.red(0) + 17), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6);
                    if (((int[]) objArr8[3])[0] == ((int[]) objArr8[1])[0]) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr8[0];
                    if (strArr != null) {
                        int i13 = cancel + 33;
                        onTransact = i13 % 128;
                        int i14 = i13 % 2;
                        int i15 = 2 % 2;
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    throw null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        this.d = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        this.asInterface = LazyKt.lazy(new Function0() { // from class: calculatePreviewSize
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DetailPromoActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i4 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i5 = $11 + 77;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                int i6 = oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr3[0] = cArr[0];
                i2 = 1;
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                i2 = 0;
            }
            int i7 = 58224;
            while (i2 < 16) {
                int i8 = $10 + 49;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i10 = (c2 + i7) ^ ((c2 << 4) + ((char) (((long) INotificationSideChannel) ^ 8611973335120459638L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(cancelAll);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cNormalizeMetaState = (char) (47773 - KeyEvent.normalizeMetaState(i4));
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 468;
                        int iIndexOf = 13 - TextUtils.indexOf("", "", i4, i4);
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, iKeyCodeFromString, iIndexOf, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i12 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) d) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(notify)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 47773), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 469, 13 - Gravity.getAbsoluteGravity(0, 0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7 = i12 - 40503;
                    i2++;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b = (byte) 0;
                byte b2 = (byte) (b - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2323 - TextUtils.getOffsetAfter("", 0), (-16777172) - Color.rgb(0, 0, 0), -1312321721, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.promo.DetailPromoActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u000e"}, d2 = {"Lcom/bpjstku/presentation/promo/DetailPromoActivity$Companion;", "", "<init>", "()V", "start", "", "context", "Landroid/content/Context;", "code", "", "isVoucher", "", "voucherItem", "Lcom/bpjstku/domain/promo/model/VoucherItem;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, String str, boolean z, VoucherItem voucherItem) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) DetailPromoActivity.class);
            intent.putExtra("merchant_code", str);
            intent.putExtra("isVoucher", z);
            intent.putExtra("voucher", voucherItem);
            context.startActivity(intent);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityDetailMerchantBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        DetailPromoActivity$bindingInflater$1 detailPromoActivity$bindingInflater$1 = DetailPromoActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = cancel + 117;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return detailPromoActivity$bindingInflater$1;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        final ActivityDetailMerchantBinding activityDetailMerchantBinding = (ActivityDetailMerchantBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        activityDetailMerchantBinding.btnRedeem.setOnClickListener(new View.OnClickListener() { // from class: CaptureSessionRepository1ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailPromoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
        activityDetailMerchantBinding.tvRedeemCode.setOnClickListener(new View.OnClickListener() { // from class: getCropRectByRatio
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {activityDetailMerchantBinding, this, view};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                DetailPromoActivity.TuitionPaymentFragmentbindingInflater1(objArr, 1062579866, -1062579864, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        activityDetailMerchantBinding.tvWebLink.setOnClickListener(new View.OnClickListener() { // from class: DisplayInfoManager
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailPromoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        int i2 = cancel + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        DetailPromoActivity detailPromoActivity = (DetailPromoActivity) objArr[0];
        int i = 2 % 2;
        String stringExtra = detailPromoActivity.getIntent().getStringExtra("merchant_code");
        if (stringExtra == null) {
            int i2 = cancel + 7;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 91 / 0;
            }
            stringExtra = "";
        }
        detailPromoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stringExtra;
        detailPromoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = detailPromoActivity.getIntent().getBooleanExtra("isVoucher", false);
        detailPromoActivity.TuitionPaymentFragmentbindingInflater1 = (VoucherItem) detailPromoActivity.getIntent().getParcelableExtra("voucher");
        int i4 = onTransact + 121;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        DetailPromoActivity detailPromoActivity = this;
        ((refresh) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(detailPromoActivity, new Observer() { // from class: dispatchOnError
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                DetailPromoActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
        ((refresh) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b.observe(detailPromoActivity, new Observer() { // from class: forceOnClosedCaptureSessions
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                DetailPromoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        ((refresh) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).f1337a.observe(detailPromoActivity, new Observer() { // from class: lambdadispatchOnError1
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                DetailPromoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        int i2 = onTransact + 63;
        cancel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        String str;
        int i = 2 % 2;
        ActivityDetailMerchantBinding activityDetailMerchantBinding = (ActivityDetailMerchantBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            final refresh refreshVar = (refresh) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Intrinsics.checkNotNullParameter(str2, "");
            MutableLiveData<VirtualCameraAdapter1<DetailMerchant>> mutableLiveData = refreshVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(refreshVar.d.b(new DetailMerchantRequest(str2))));
            final Function1 function1 = new Function1() { // from class: ExposureControlExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return refresh.TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshVar, (DetailMerchant) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: ExposureControlExternalSyntheticLambda1
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: ExposureStateImpl
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return refresh.TuitionPaymentFragmentspecialinlinedviewModeldefault2(refreshVar, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: FocusMeteringControl
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            refreshVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            activityDetailMerchantBinding.llSectionBtn.setVisibility(8);
            return;
        }
        activityDetailMerchantBinding.llSectionBtn.setVisibility(0);
        final refresh refreshVar2 = (refresh) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        User user = this.d;
        if (user != null) {
            int i2 = cancel + 105;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i3 = 36 / 0;
            } else {
                str = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
        } else {
            int i4 = onTransact + 91;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            str = null;
        }
        if (str == null) {
            int i6 = onTransact + 53;
            cancel = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 45 / 0;
            }
            str = "";
        }
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str, "");
        MutableLiveData<VirtualCameraAdapter1<DetailMerchant>> mutableLiveData2 = refreshVar2.b;
        VirtualCameraAdapter1.Companion bVar2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(refreshVar2.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new DetailVoucherRequest(str3, "JMO", str))));
        final Function1 function3 = new Function1() { // from class: DynamicRangeResolverApi33Impl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refresh.TuitionPaymentFragmentspecialinlinedviewModeldefault1(refreshVar2, (DetailMerchant) obj);
            }
        };
        logToString logtostring2 = new logToString() { // from class: resolveAndValidateDynamicRanges
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function3.invoke(obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: lambdasetExposureCompensationIndex0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refresh.asInterface(refreshVar2, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: clearRunningTask
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function4.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
        refreshVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        DetailPromoActivity detailPromoActivity = this;
        Intrinsics.checkNotNullParameter(detailPromoActivity, "");
        detailPromoActivity.getWindow().addFlags(8192);
        ((ActivityDetailMerchantBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.appbar_co_marketing));
        ((ActivityDetailMerchantBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: lambdaforceOnClosedCaptureSessions0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailPromoActivity.b(this.b, view);
            }
        });
        RecyclerView recyclerView = ((ActivityDetailMerchantBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvTnc;
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        recyclerView.setAdapter((triggerAf) this.asInterface.getValue());
        int i2 = cancel + 81;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(DetailMerchant p0, boolean p1) {
        int i = 2 % 2;
        int i2 = cancel + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ActivityDetailMerchantBinding activityDetailMerchantBinding = (ActivityDetailMerchantBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        ImageView imageView = activityDetailMerchantBinding.imgMerchant;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        lambdacreateCameraSelectorById0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageView, this, p0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), R.drawable.ic_placeholder, R.drawable.ic_placeholder);
        activityDetailMerchantBinding.tvTitleDetail.setText(p0.TuitionPaymentFragmentbindingInflater1);
        activityDetailMerchantBinding.tvPeriode.setText(p0.asBinder);
        activityDetailMerchantBinding.tvLocation.setText(p0.write);
        if (!(!p1)) {
            this.a = p0.connect;
            if (p0.read.length() == 0) {
                activityDetailMerchantBinding.btnRedeem.setVisibility(0);
                activityDetailMerchantBinding.llRedeemSection.setVisibility(8);
            } else {
                activityDetailMerchantBinding.btnRedeem.setVisibility(8);
                activityDetailMerchantBinding.llRedeemSection.setVisibility(0);
                activityDetailMerchantBinding.tvRedeemCode.setText(p0.read);
                INotificationSideChannel();
            }
        }
        if (!p0.INotificationSideChannelStubProxy.isEmpty()) {
            int i4 = onTransact + 3;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            ((triggerAf) this.asInterface.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0.INotificationSideChannelStubProxy);
        }
        if (!p0.d.isEmpty()) {
            ((triggerAf) this.asInterface.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0.d);
        }
        if (p0.INotificationSideChannelStubProxy.isEmpty() && p0.d.isEmpty()) {
            activityDetailMerchantBinding.tvLabelTnc.setVisibility(8);
            activityDetailMerchantBinding.rvTnc.setVisibility(8);
            activityDetailMerchantBinding.view3.setVisibility(8);
        } else {
            activityDetailMerchantBinding.tvLabelTnc.setVisibility(0);
            activityDetailMerchantBinding.rvTnc.setVisibility(0);
            activityDetailMerchantBinding.view3.setVisibility(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        r1.tvWebLink.setVisibility(8);
        r1 = com.bpjstku.presentation.promo.DetailPromoActivity.onTransact + 47;
        com.bpjstku.presentation.promo.DetailPromoActivity.cancel = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        if ((r1 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        r0 = 92 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r5.a.length() > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r5.a.length() > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        r1.tvWebLink.setVisibility(0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void INotificationSideChannel() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.promo.DetailPromoActivity.cancel
            int r1 = r1 + 33
            int r2 = r1 % 128
            com.bpjstku.presentation.promo.DetailPromoActivity.onTransact = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L27
            kotlin.Lazy r1 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.lang.Object r1 = r1.getValue()
            androidx.viewbinding.ViewBinding r1 = (androidx.viewbinding.ViewBinding) r1
            com.bpjstku.databinding.ActivityDetailMerchantBinding r1 = (com.bpjstku.databinding.ActivityDetailMerchantBinding) r1
            java.lang.String r3 = r5.a
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            r4 = 92
            int r4 = r4 / r2
            if (r3 <= 0) goto L41
            goto L3b
        L27:
            kotlin.Lazy r1 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.lang.Object r1 = r1.getValue()
            androidx.viewbinding.ViewBinding r1 = (androidx.viewbinding.ViewBinding) r1
            com.bpjstku.databinding.ActivityDetailMerchantBinding r1 = (com.bpjstku.databinding.ActivityDetailMerchantBinding) r1
            java.lang.String r3 = r5.a
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 <= 0) goto L41
        L3b:
            android.widget.TextView r0 = r1.tvWebLink
            r0.setVisibility(r2)
            return
        L41:
            android.widget.TextView r1 = r1.tvWebLink
            r3 = 8
            r1.setVisibility(r3)
            int r1 = com.bpjstku.presentation.promo.DetailPromoActivity.onTransact
            int r1 = r1 + 47
            int r3 = r1 % 128
            com.bpjstku.presentation.promo.DetailPromoActivity.cancel = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L56
            r0 = 92
            int r0 = r0 / r2
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.DetailPromoActivity.INotificationSideChannel():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cArgb = (char) Color.argb(0, 0, 0, 0);
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 16;
            Object[] objArr2 = new Object[1];
            e((byte) 52, (short) 141, $$a[132], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, threadPriority, iLastIndexOf, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{61427, 59277, 50412, 46466, 54026, 39478, 43948, 51881, 28588, 14040, 33780, 58983, 20782, 25569, 56058, 42160, 55684, 4900, 26959, 18607, 29836, 58530, 22579, 46042}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{43422, 59517, 35352, 14833, 6638, 16034, 62202, 45392, 16640, 3177, 20126, 7856, 17733, 12884, 20693, 55680, 49405, 62750}, Drawable.resolveOpacity(0, 0) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
            int offsetBefore = 1031 - TextUtils.getOffsetBefore("", 0);
            int iMyTid = 15 - (Process.myTid() >> 22);
            Object[] objArr5 = new Object[1];
            e((byte) 52, (short) ($$b - 2), $$a[132], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, offsetBefore, iMyTid, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = cancel + 113;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int mode = 1031 - View.MeasureSpec.getMode(0);
                int bitsPerPixel = 14 - ImageFormat.getBitsPerPixel(0);
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr6 = new Object[1];
                e(b2, (short) (b2 | 37), b, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, mode, bitsPerPixel, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[3])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i7 = ~((int) Process.getStartUptimeMillis());
            int i8 = (-1953008787) + ((~(201190231 | i7)) * 52) + (((~(60672338 | i7)) | (~((-183607832) | i7)) | 140517893) * (-52)) + (((~(i7 | (-60672339))) | 17582400) * 52) + 1306878268;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{28527, 62116, 53535, 21773, 6817, 56776, 25182, 52418, 3320, 35241, 842, 23134, 14573, 26968, 9906, 52404, 35738, 52997}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 95, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{3290, 43092, 257, 62949, 43618, 4977, 43342, 28189, 20111, 10300, 42486, 10672, 22816, 59517, 43993, 16730, 34223, 57373}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_email_optional).substring(2, 3).length() + 15, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {920358688};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - TextUtils.getOffsetBefore("", 0)), 1134 - KeyEvent.normalizeMetaState(0), TextUtils.lastIndexOf("", '0') + 19, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1306878268, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int offsetBefore2 = 1031 - TextUtils.getOffsetBefore("", 0);
                    int i11 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14;
                    Object[] objArr12 = new Object[1];
                    e((byte) 52, (short) 141, $$a[132], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, offsetBefore2, i11, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf("", "", 0) + 45993), 1117 - View.MeasureSpec.getSize(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int iGreen = 1031 - Color.green(0);
                    int i12 = 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr13 = new Object[1];
                    e(b4, (short) (b4 | 37), b3, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, iGreen, i12, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(new char[]{61427, 59277, 50412, 46466, 54026, 39478, 43948, 51881, 28588, 14040, 33780, 58983, 20782, 25569, 56058, 42160, 55684, 4900, 26959, 18607, 29836, 58530, 22579, 46042}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_internet_instruction_3).substring(1, 3).codePointAt(1) - 83, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(new char[]{43422, 59517, 35352, 14833, 6638, 16034, 62202, 45392, 16640, 3177, 20126, 7856, 17733, 12884, 20693, 55680, 49405, 62750}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_review_screen_instruction_text).substring(0, 53).length() - 38, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char size = (char) View.MeasureSpec.getSize(0);
                        int iBlue = Color.blue(0) + 1031;
                        int iBlue2 = 15 - Color.blue(0);
                        Object[] objArr16 = new Object[1];
                        e((byte) 52, (short) ($$b - 2), $$a[132], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(size, iBlue, iBlue2, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char offsetBefore3 = (char) TextUtils.getOffsetBefore("", 0);
                        int i13 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
                        int i14 = 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        Object[] objArr17 = new Object[1];
                        e((byte) 52, (short) 141, $$a[132], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(offsetBefore3, i13, i14, 1357589585, false, (String) objArr17[0], null);
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
            if (strArr2 != null) {
                int i15 = cancel + 117;
                onTransact = i15 % 128;
                int i16 = i15 % 2;
                while (i2 < strArr2.length) {
                    int i17 = cancel + 15;
                    onTransact = i17 % 128;
                    int i18 = i17 % 2;
                    arrayList.add(strArr2[i2]);
                    i2++;
                }
            }
            throw null;
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i19 = ((int[]) objArr[2])[0];
        int i20 = ((int[]) objArr[3])[0];
        int i21 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int iMyTid2 = Process.myTid();
        int i22 = i19 + 1598529465 + (((~((-17830827) | (~iMyTid2))) | (~(226449343 | iMyTid2))) * (-272)) + (((~((-85153712) | iMyTid2)) | 67322885) * (-272)) + (((~(iMyTid2 | 85153711)) | 159126458) * 272);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr18[2])[0] = i24 ^ (i24 << 5);
        int i25 = cancel + 105;
        onTransact = i25 % 128;
        int i26 = i25 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char keyRepeatDelay = (char) (29944 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1755;
            int i27 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
            byte b5 = (byte) 37;
            Object[] objArr19 = new Object[1];
            e(b5, b5, $$a[132], objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(keyRepeatDelay, windowTouchSlop, i27, 986134021, false, (String) objArr19[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char scrollBarFadeDuration = (char) (29944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int maximumFlingVelocity = 1755 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 23;
                Object[] objArr20 = new Object[1];
                e((byte) 52, (short) ($$b - 2), $$a[132], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(scrollBarFadeDuration, maximumFlingVelocity, iResolveSizeAndState, 1599039318, false, (String) objArr20[0], null);
            }
            Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            int i28 = ((int[]) objArr21[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{i28}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_mandiri).substring(0, 19).codePointAt(0) - 525874426;
            int i29 = ~((-247836026) | iCodePointAt);
            int i30 = 1187644261 + ((33656121 | i29) * (-280)) + ((i29 | (~(35233599 | iCodePointAt))) * 140);
            int i31 = ~((-214179905) | iCodePointAt);
            int i32 = ~iCodePointAt;
            int i33 = (i30 + (((~(i32 | 249413503)) | (i31 | (~((-33656122) | i32)))) * 140)) - 673157327;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i35 ^ (i35 << 5);
        } else {
            Object[] objArr22 = new Object[1];
            c(new char[]{28527, 62116, 53535, 21773, 6817, 56776, 25182, 52418, 3320, 35241, 842, 23134, 14573, 26968, 9906, 52404, 35738, 52997}, 17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr22);
            Class<?> cls4 = Class.forName((String) objArr22[0]);
            Object[] objArr23 = new Object[1];
            c(new char[]{3290, 43092, 257, 62949, 43618, 4977, 43342, 28189, 20111, 10300, 42486, 10672, 22816, 59517, 43993, 16730, 34223, 57373}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cimb_instruction_step3).substring(0, 1).length() + 15, objArr23);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr24 = {920358688};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 42050), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1725, 29 - TextUtils.indexOf("", ""), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = ActivityLoginBinding.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), -673157327);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 29945);
                int i36 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1754;
                int i37 = 24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                Object[] objArr25 = new Object[1];
                e((byte) 52, (short) ($$b - 2), $$a[132], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cAxisFromString, i36, i37, 1599039318, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
            try {
                Object[] objArr26 = new Object[1];
                c(new char[]{61427, 59277, 50412, 46466, 54026, 39478, 43948, 51881, 28588, 14040, 33780, 58983, 20782, 25569, 56058, 42160, 55684, 4900, 26959, 18607, 29836, 58530, 22579, 46042}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                c(new char[]{43422, 59517, 35352, 14833, 6638, 16034, 62202, 45392, 16640, 3177, 20126, 7856, 17733, 12884, 20693, 55680, 49405, 62750}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_expiration_message).substring(3, 4).length() + 14, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cCombineMeasuredStates = (char) (29944 - View.combineMeasuredStates(0, 0));
                    int iGreen2 = Color.green(0) + 1755;
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 24;
                    byte[] bArr = $$a;
                    Object[] objArr28 = new Object[1];
                    e((byte) 52, bArr[7], bArr[132], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cCombineMeasuredStates, iGreen2, iLastIndexOf2, 1596667560, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 29945);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1756;
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 23;
                    byte b6 = (byte) 37;
                    Object[] objArr29 = new Object[1];
                    e(b6, b6, $$a[132], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf2, iIndexOf, pressedStateDuration, 986134021, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i38 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0];
        int i39 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        if (i39 != i38) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr4 != null) {
                int i40 = onTransact + 35;
                cancel = i40 % 128;
                int i41 = i40 % 2;
                while (i2 < strArr4.length) {
                    arrayList2.add(strArr4[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i39));
        }
        int i42 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        int i43 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        Object[] objArr30 = {new int[]{i43}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i44 = i42 + (-750631223) + (((~((-499960974) | iIdentityHashCode)) | 214712460) * 1504) + ((~(iIdentityHashCode | (-285248514))) * (-1504)) + 158241008;
        int i45 = (i44 << 13) ^ i44;
        int i46 = i45 ^ (i45 >>> 17);
        ((int[]) objArr30[3])[0] = i46 ^ (i46 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -683022118
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
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.promo.DetailPromoActivity.onTransact
            int r1 = r1 + 25
            int r2 = r1 % 128
            com.bpjstku.presentation.promo.DetailPromoActivity.cancel = r2
            int r1 = r1 % r0
            java.lang.reflect.Member[] r1 = defpackage.calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1
            r2 = 0
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 0
            int r1 = r1.getInt(r3)
            int r4 = android.os.Process.myUid()
            int r5 = ~r4
            r6 = -688140354(0xffffffffd6fbcfbe, float:-1.3843483E14)
            r7 = r6 | r5
            int r7 = ~r7
            r8 = 1518127896(0x5a7ccb18, float:1.778875E16)
            r9 = r8 | r5
            int r9 = ~r9
            r7 = r7 | r9
            int r7 = r7 * (-867)
            r9 = 1125317536(0x4312fba0, float:146.98291)
            int r9 = r9 + r7
            r6 = r6 | r4
            int r6 = ~r6
            r7 = 553660481(0x21003041, float:4.343195E-19)
            r6 = r6 | r7
            r7 = r8 | r4
            int r7 = ~r7
            r6 = r6 | r7
            int r6 = r6 * (-1734)
            int r9 = r9 + r6
            r6 = -553660482(0xffffffffdeffcfbe, float:-9.2165804E18)
            r5 = r5 | r6
            int r5 = ~r5
            r6 = -134479873(0xfffffffff7fbffff, float:-1.0222334E34)
            r6 = r6 | r4
            int r6 = ~r6
            r5 = r5 | r6
            r6 = 2071788377(0x7b7cfb59, float:1.31355674E36)
            r4 = r4 | r6
            int r4 = ~r4
            r4 = r4 | r5
            int r4 = r4 * 867
            int r9 = r9 + r4
            if (r1 != r9) goto Lb4
            java.lang.reflect.Member[] r1 = defpackage.createExtraPreview.TuitionPaymentFragmentbindingInflater1
            r1 = r1[r2]
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r1 = r1.getInt(r3)
            long r4 = android.os.Process.getStartElapsedRealtime()
            int r2 = (int) r4
            r4 = -337683481(0xffffffffebdf5be7, float:-5.400489E26)
            r4 = r4 | r2
            int r4 = r4 * (-381)
            r5 = 148730584(0x8dd72d8, float:1.3327953E-33)
            int r5 = r5 + r4
            int r2 = ~r2
            r4 = 1658343620(0x62d850c4, float:1.9951582E21)
            r2 = r2 | r4
            int r2 = ~r2
            r4 = -1412998237(0xffffffffabc75ba3, float:-1.4165235E-12)
            r2 = r2 | r4
            int r2 = r2 * 381
            int r5 = r5 + r2
            r2 = -191613000(0xfffffffff49437b8, float:-9.39441E31)
            int r5 = r5 + r2
            if (r1 == r5) goto La1
            int r1 = com.bpjstku.presentation.promo.DetailPromoActivity.onTransact
            int r1 = r1 + 121
            int r2 = r1 % 128
            com.bpjstku.presentation.promo.DetailPromoActivity.cancel = r2
            int r1 = r1 % r0
            r1 = -683022118(0xffffffffd749e8da, float:-2.2200193E14)
            int[] r1 = new int[r1]
            r2 = -683022119(0xffffffffd749e8d9, float:-2.2200191E14)
            r4 = 1
            r1[r2] = r4
            r2 = -187305782(0xfffffffff4d5f0ca, float:-1.3560095E32)
            int r2 = r2 % r0
            r2 = -1
            r1 = r1[r2]
            android.widget.Toast r1 = android.widget.Toast.makeText(r3, r1, r4)
            r1.show()
        La1:
            super.onResume()
            int r1 = com.bpjstku.presentation.promo.DetailPromoActivity.onTransact
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.bpjstku.presentation.promo.DetailPromoActivity.cancel = r2
            int r1 = r1 % r0
            if (r1 == 0) goto Lb0
            return
        Lb0:
            r3.hashCode()
            throw r3
        Lb4:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.DetailPromoActivity.onResume():void");
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1825893998
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    private static /* synthetic */ java.lang.Object TuitionPaymentFragmentbindingInflater1(java.lang.Object[] r8) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.DetailPromoActivity.TuitionPaymentFragmentbindingInflater1(java.lang.Object[]):java.lang.Object");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1356178367;
        int i5 = ~length;
        int i6 = 175090010 + (((~((-1677549763) | i5)) | 579092674) * (-1188));
        int i7 = (~(length | 1677549762)) | 579092674;
        int i8 = ~(847562219 | i5);
        if (i4 != i6 + ((i7 | i8) * 594) + (((~(1677549762 | i5)) | (-1946019308) | i8) * 594)) {
            int i9 = (-362051958) % 2;
            throw new ArithmeticException();
        }
        int i10 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i11 = 110604700 + (((~((-1039501397) | iIdentityHashCode)) | 432113664 | (~((-1539554569) | iIdentityHashCode))) * (-880));
        int i12 = (~((-1039501397) | (~iIdentityHashCode))) | 1539554568;
        int i13 = ~(iIdentityHashCode | 1039501396);
        if (i10 != i11 + ((i12 | i13) * (-880)) + (i13 * 880)) {
            int[] iArr = new int[828616005];
            iArr[828616004] = 1;
            int i14 = (-1321162924) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        super.onCreate(bundle);
        int i15 = onTransact + 35;
        cancel = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 16 / 0;
        }
    }

    public static /* synthetic */ triggerAf TuitionPaymentFragmentbindingInflater1(DetailPromoActivity detailPromoActivity) {
        int i = 2 % 2;
        triggerAf triggeraf = new triggerAf(detailPromoActivity, new ArrayList());
        int i2 = onTransact + 45;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        return triggeraf;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(DetailPromoActivity detailPromoActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        int i = 2 % 2;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            int i2 = cancel + 73;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                detailPromoActivity.MediaBrowserCompat();
                return;
            } else {
                detailPromoActivity.MediaBrowserCompat();
                throw null;
            }
        }
        if (!(virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder)) {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                detailPromoActivity.IconCompatParcelizer();
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(detailPromoActivity, String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
                int i3 = onTransact + 51;
                cancel = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        int i5 = cancel + 125;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        detailPromoActivity.IconCompatParcelizer();
        RedeemResponse redeemResponse = (RedeemResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (redeemResponse.getKodeVoucher().length() <= 0) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), redeemResponse.getMsg(), 0).show();
            return;
        }
        ActivityDetailMerchantBinding activityDetailMerchantBinding = (ActivityDetailMerchantBinding) ((ViewBinding) detailPromoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        LinearLayout linearLayout = activityDetailMerchantBinding.llRedeemSection;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        MaterialButton materialButton = activityDetailMerchantBinding.btnRedeem;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setVisibility(8);
        activityDetailMerchantBinding.tvRedeemCode.setText(redeemResponse.getKodeVoucher());
        detailPromoActivity.INotificationSideChannel();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if ((r6 instanceof VirtualCameraAdapter1.asBinder) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r5.IconCompatParcelizer();
        r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1((com.bpjstku.domain.promo.model.DetailMerchant) ((VirtualCameraAdapter1.asBinder) r6).TuitionPaymentFragmentspecialinlinedviewModeldefault1, r5.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        r5 = com.bpjstku.presentation.promo.DetailPromoActivity.cancel + 113;
        com.bpjstku.presentation.promo.DetailPromoActivity.onTransact = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if ((r6 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        r1 = r1 + 17;
        com.bpjstku.presentation.promo.DetailPromoActivity.cancel = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if ((r1 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        r5.IconCompatParcelizer();
        defpackage.retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r5, java.lang.String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r6).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        r5 = 72 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        r5.IconCompatParcelizer();
        defpackage.retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r5, java.lang.String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r6).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        r5 = com.bpjstku.presentation.promo.DetailPromoActivity.cancel + 85;
        com.bpjstku.presentation.promo.DetailPromoActivity.onTransact = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if ((r6 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((!(r6 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r5.MediaBrowserCompat();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(com.bpjstku.presentation.promo.DetailPromoActivity r5, defpackage.VirtualCameraAdapter1 r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.promo.DetailPromoActivity.onTransact
            int r2 = r1 + 117
            int r3 = r2 % 128
            com.bpjstku.presentation.promo.DetailPromoActivity.cancel = r3
            int r2 = r2 % r0
            r3 = 1
            if (r2 != 0) goto L18
            boolean r2 = r6 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r4 = 81
            int r4 = r4 / 0
            if (r2 == 0) goto L21
            goto L1d
        L18:
            boolean r2 = r6 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r2 = r2 ^ r3
            if (r2 == r3) goto L21
        L1d:
            r5.MediaBrowserCompat()
            return
        L21:
            boolean r2 = r6 instanceof VirtualCameraAdapter1.asBinder
            if (r2 == 0) goto L3d
            r5.IconCompatParcelizer()
            VirtualCameraAdapter1$asBinder r6 = (VirtualCameraAdapter1.asBinder) r6
            T r6 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            com.bpjstku.domain.promo.model.DetailMerchant r6 = (com.bpjstku.domain.promo.model.DetailMerchant) r6
            boolean r1 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r6, r1)
            int r5 = com.bpjstku.presentation.promo.DetailPromoActivity.cancel
            int r5 = r5 + 113
            int r6 = r5 % 128
            com.bpjstku.presentation.promo.DetailPromoActivity.onTransact = r6
            int r5 = r5 % r0
            return
        L3d:
            boolean r2 = r6 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            if (r2 == r3) goto L42
            goto L7a
        L42:
            int r1 = r1 + 17
            int r2 = r1 % 128
            com.bpjstku.presentation.promo.DetailPromoActivity.cancel = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L61
            r5.IconCompatParcelizer()
            com.nbs.nucleosnucleo.presentation.BaseActivity r5 = (com.nbs.nucleosnucleo.presentation.BaseActivity) r5
            VirtualCameraAdapter1$TuitionPaymentFragmentspecialinlinedviewModeldefault2 r6 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r6
            java.lang.String r6 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            java.lang.String r6 = java.lang.String.valueOf(r6)
            defpackage.retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r5, r6, r2)
            r5 = 72
            int r5 = r5 / 0
            goto L71
        L61:
            r5.IconCompatParcelizer()
            com.nbs.nucleosnucleo.presentation.BaseActivity r5 = (com.nbs.nucleosnucleo.presentation.BaseActivity) r5
            VirtualCameraAdapter1$TuitionPaymentFragmentspecialinlinedviewModeldefault2 r6 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r6
            java.lang.String r6 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            java.lang.String r6 = java.lang.String.valueOf(r6)
            defpackage.retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r5, r6, r2)
        L71:
            int r5 = com.bpjstku.presentation.promo.DetailPromoActivity.cancel
            int r5 = r5 + 85
            int r6 = r5 % 128
            com.bpjstku.presentation.promo.DetailPromoActivity.onTransact = r6
            int r5 = r5 % r0
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.DetailPromoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(com.bpjstku.presentation.promo.DetailPromoActivity, VirtualCameraAdapter1):void");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(DetailPromoActivity detailPromoActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            detailPromoActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(detailPromoActivity.a)));
            ViewPortBuilder.b();
            int i2 = onTransact + 65;
            cancel = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 50 / 0;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        ActivityDetailMerchantBinding activityDetailMerchantBinding = (ActivityDetailMerchantBinding) objArr[0];
        DetailPromoActivity detailPromoActivity = (DetailPromoActivity) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = onTransact + 125;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            String string = activityDetailMerchantBinding.tvRedeemCode.getText().toString();
            Object systemService = detailPromoActivity.getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text", string));
            RelativeLayout relativeLayout = activityDetailMerchantBinding.root;
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
            Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(relativeLayout, "Kode voucher disimpan pada Clipboard");
            ViewPortBuilder.b();
            int i4 = onTransact + 1;
            cancel = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 79 / 0;
            }
            return null;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void b(DetailPromoActivity detailPromoActivity, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            detailPromoActivity.finish();
            ViewPortBuilder.b();
            int i4 = cancel + 101;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 7 / 0;
            }
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(DetailPromoActivity detailPromoActivity, View view) {
        String str;
        String str2;
        String str3;
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            final refresh refreshVar = (refresh) detailPromoActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            VoucherItem voucherItem = detailPromoActivity.TuitionPaymentFragmentbindingInflater1;
            if (voucherItem != null) {
                int i2 = onTransact + 47;
                cancel = i2 % 128;
                int i3 = i2 % 2;
                str = voucherItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            VoucherItem voucherItem2 = detailPromoActivity.TuitionPaymentFragmentbindingInflater1;
            if (voucherItem2 != null) {
                int i4 = cancel + 21;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                str2 = voucherItem2.asBinder;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            User user = detailPromoActivity.d;
            if (user != null) {
                int i6 = cancel + 45;
                onTransact = i6 % 128;
                if (i6 % 2 != 0) {
                    str3 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i7 = 24 / 0;
                } else {
                    str3 = user.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                }
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            RedeemRequest redeemRequest = new RedeemRequest(str, str2, str3, detailPromoActivity.a);
            Intrinsics.checkNotNullParameter(redeemRequest, "");
            MutableLiveData<VirtualCameraAdapter1<RedeemResponse>> mutableLiveData = refreshVar.f1337a;
            VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(refreshVar.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(redeemRequest)));
            final Function1 function1 = new Function1() { // from class: DynamicRangeResolver
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return refresh.TuitionPaymentFragmentspecialinlinedviewModeldefault1(refreshVar, (RedeemResponse) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: resolveDynamicRangeAndUpdateConstraints
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: isFullyUnspecified
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return refresh.b(refreshVar, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: isPartiallySpecified
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            refreshVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } finally {
            ViewPortBuilder.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if ((r7 instanceof VirtualCameraAdapter1.asBinder) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        r3 = r3 + 115;
        com.bpjstku.presentation.promo.DetailPromoActivity.cancel = r3 % 128;
        r3 = r3 % 2;
        r6.IconCompatParcelizer();
        r6.TuitionPaymentFragmentspecialinlinedviewModeldefault1((com.bpjstku.domain.promo.model.DetailMerchant) ((VirtualCameraAdapter1.asBinder) r7).TuitionPaymentFragmentspecialinlinedviewModeldefault1, false);
        r6 = com.bpjstku.presentation.promo.DetailPromoActivity.cancel + 1;
        com.bpjstku.presentation.promo.DetailPromoActivity.onTransact = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if ((r6 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if ((r7 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        r1 = r1 + 67;
        com.bpjstku.presentation.promo.DetailPromoActivity.onTransact = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if ((r1 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        r6.IconCompatParcelizer();
        defpackage.retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r6, java.lang.String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r7).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        r6.IconCompatParcelizer();
        defpackage.retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r6, java.lang.String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r7).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null);
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((r7 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if ((r7 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r6.MediaBrowserCompat();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(com.bpjstku.presentation.promo.DetailPromoActivity r6, defpackage.VirtualCameraAdapter1 r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.bpjstku.presentation.promo.DetailPromoActivity.cancel
            int r2 = r1 + 57
            int r3 = r2 % 128
            com.bpjstku.presentation.promo.DetailPromoActivity.onTransact = r3
            int r2 = r2 % r0
            r4 = 0
            if (r2 == 0) goto L17
            boolean r2 = r7 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r5 = 67
            int r5 = r5 / r4
            if (r2 == 0) goto L1f
            goto L1b
        L17:
            boolean r2 = r7 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            if (r2 == 0) goto L1f
        L1b:
            r6.MediaBrowserCompat()
            return
        L1f:
            boolean r2 = r7 instanceof VirtualCameraAdapter1.asBinder
            r5 = 0
            if (r2 == 0) goto L44
            int r3 = r3 + 115
            int r1 = r3 % 128
            com.bpjstku.presentation.promo.DetailPromoActivity.cancel = r1
            int r3 = r3 % r0
            r6.IconCompatParcelizer()
            VirtualCameraAdapter1$asBinder r7 = (VirtualCameraAdapter1.asBinder) r7
            T r7 = r7.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            com.bpjstku.domain.promo.model.DetailMerchant r7 = (com.bpjstku.domain.promo.model.DetailMerchant) r7
            r6.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r7, r4)
            int r6 = com.bpjstku.presentation.promo.DetailPromoActivity.cancel
            int r6 = r6 + 1
            int r7 = r6 % 128
            com.bpjstku.presentation.promo.DetailPromoActivity.onTransact = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L43
            return
        L43:
            throw r5
        L44:
            boolean r2 = r7 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            if (r2 == 0) goto L76
            int r1 = r1 + 67
            int r2 = r1 % 128
            com.bpjstku.presentation.promo.DetailPromoActivity.onTransact = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L62
            r6.IconCompatParcelizer()
            com.nbs.nucleosnucleo.presentation.BaseActivity r6 = (com.nbs.nucleosnucleo.presentation.BaseActivity) r6
            VirtualCameraAdapter1$TuitionPaymentFragmentspecialinlinedviewModeldefault2 r7 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r7
            java.lang.String r7 = r7.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            java.lang.String r7 = java.lang.String.valueOf(r7)
            defpackage.retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r6, r7, r5)
            goto L76
        L62:
            r6.IconCompatParcelizer()
            com.nbs.nucleosnucleo.presentation.BaseActivity r6 = (com.nbs.nucleosnucleo.presentation.BaseActivity) r6
            VirtualCameraAdapter1$TuitionPaymentFragmentspecialinlinedviewModeldefault2 r7 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) r7
            java.lang.String r7 = r7.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            java.lang.String r7 = java.lang.String.valueOf(r7)
            defpackage.retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r6, r7, r5)
            r5.hashCode()
            throw r5
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.DetailPromoActivity.TuitionPaymentFragmentbindingInflater1(com.bpjstku.presentation.promo.DetailPromoActivity, VirtualCameraAdapter1):void");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityDetailMerchantBinding activityDetailMerchantBinding, DetailPromoActivity detailPromoActivity, View view) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(new Object[]{activityDetailMerchantBinding, detailPromoActivity, view}, 1062579866, -1062579864, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    static {
        INotificationSideChannelStub = 0;
        g();
        INSTANCE = new Companion(null);
        int i = getInterfaceDescriptor + 103;
        INotificationSideChannelStub = i % 128;
        if (i % 2 != 0) {
            int i2 = 77 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return ((Integer) TuitionPaymentFragmentbindingInflater1(new Object[]{this}, 217555786, -217555785, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), CameraSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1(new Object[]{this}, 70981295, -70981295, CameraSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), CameraSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), CameraSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CameraSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentbindingInflater1(new Object[]{this}, 1304318821, -1304318818, FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), FileTreeWalk.WalkState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), CameraSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancel + 73;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = onTransact + 47;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void g() {
        d = (char) 44472;
        notify = (char) 2330;
        INotificationSideChannel = (char) 44013;
        cancelAll = (char) 62110;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        int i = 2 % 2;
        int i2 = cancel + 43;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return Integer.valueOf(R.layout.activity_detail_merchant);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, int r7, int r8) {
        /*
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r8 = r8 + 108
            byte[] r1 = com.bpjstku.presentation.promo.DetailPromoActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2d:
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.promo.DetailPromoActivity.$$i(byte, int, int):java.lang.String");
    }
}
