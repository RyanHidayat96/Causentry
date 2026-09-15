package com.bpjstku.presentation.podcast;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.podcast.model.request.PodcastRequest;
import com.bpjstku.data.vocation.model.request.VocationProfileRequest;
import com.bpjstku.databinding.ActivityVideoListBinding;
import com.bpjstku.domain.podcast.model.PodcastVideoList;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.podcast.VideoListActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.gson.internal.bind.TypeAdapters;
import defpackage.BufferProviderState;
import defpackage.Camera2CameraControl;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.Camera2ImplConfigBuilder;
import defpackage.ShareTargetParams;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.addCallback;
import defpackage.addCaptureRequestOptionsInternal;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.deriveCodec;
import defpackage.getConfigs;
import defpackage.getEventTime;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.isQuickZoomEnabled;
import defpackage.logToString;
import defpackage.mapPoint;
import defpackage.modifyBitrate;
import defpackage.onResume;
import defpackage.retrieveConcurrentCameraIds;
import defpackage.setQuickZoomEnabled;
import defpackage.share;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\b\u0010\u000fJ#\u0010\u0007\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0007\u0010\u0010R\u0015\u0010\b\u001a\u00020\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0015\u0010\u0012\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u00188UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001b"}, d2 = {"Lcom/bpjstku/presentation/podcast/VideoListActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityVideoListBinding;", "LaddCaptureRequestOptionsInternal$TuitionPaymentFragmentbindingInflater1;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "", "p0", "p1", "(II)V", "(Ljava/lang/Integer;)V", "LShareTargetParams;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Lazy;", "I", "TuitionPaymentFragmentbindingInflater1", "LCamera2ImplConfigBuilder;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "()I", "d"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoListActivity extends BindingBaseActivity<ActivityVideoListBinding> implements addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy b;
    private static final byte[] $$c = {94, -1, 37, -59};
    private static final int $$f = 140;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {38, 31, -70, -1, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 19;
    private static int d = 0;
    private static int g = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {47335, 47344, 47387, 47267, 47333, 47331, 47338, 47358, 47384, 47390, 47389, 47340, 47332, 47336, 47341, 47305, 47337, 47310, 47330, 47391, 47342, 47334, 47329, 47359};
    private static int asBinder = 2047719569;
    private static boolean asInterface = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f576a = true;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int TuitionPaymentFragmentbindingInflater1 = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 10;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: getCameraXConfig
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VideoListActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

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

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 197 - r6
            byte[] r0 = com.bpjstku.presentation.podcast.VideoListActivity.$$a
            int r7 = r7 + 1
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r5 = r2
            r8 = r7
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r6]
        L25:
            int r6 = r6 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.podcast.VideoListActivity.c(short, int, int, java.lang.Object[]):void");
    }

    public VideoListActivity() {
        final VideoListActivity videoListActivity = this;
        this.b = LazyKt.lazy(new Function0<ShareTargetParams>() { // from class: com.bpjstku.presentation.podcast.VideoListActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ShareTargetParams, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ShareTargetParams invoke() {
                LifecycleOwner lifecycleOwner = videoListActivity;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ShareTargetParams.class);
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

    @Override // addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1
    public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Integer num, RecyclerView recyclerView) throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = g + 67;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Object[] objArr = {this, Integer.valueOf(iIntValue), Integer.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 652877856, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto5).substring(8, 9).codePointAt(0) - 1782800731, -1246589175, 1246589178, objArr, VocationProfileRequest.TuitionPaymentFragmentbindingInflater1(), TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            return;
        }
        int iIntValue2 = num.intValue();
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Object[] objArr2 = {this, Integer.valueOf(iIntValue2), Integer.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 652877856, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto5).substring(8, 9).codePointAt(0) - 1782800731, -1246589175, 1246589178, objArr2, VocationProfileRequest.TuitionPaymentFragmentbindingInflater1(), TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        int i3 = 58 / 0;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityVideoListBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g + 41;
        d = i2 % 128;
        int i3 = i2 % 2;
        VideoListActivity$bindingInflater$1 videoListActivity$bindingInflater$1 = VideoListActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = g + 107;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return videoListActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        ((ActivityVideoListBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: createCaptureRequestOption
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoListActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
            }
        });
        int i2 = g + 89;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        ((ShareTargetParams) this.b.getValue()).asInterface.observe(this, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: getCaptureRequestOptions
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoListActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
        int i2 = d + 45;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        String str;
        int i = 2 % 2;
        int i2 = g + 3;
        d = i2 % 128;
        int i3 = i2 % 2;
        Camera2ImplConfigBuilder camera2ImplConfigBuilder = (Camera2ImplConfigBuilder) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        Camera2CameraControl camera2CameraControl = camera2ImplConfigBuilder.f253a;
        camera2CameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = camera2CameraControl.b;
        camera2CameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        camera2CameraControl.TuitionPaymentFragmentbindingInflater1 = true;
        camera2ImplConfigBuilder.asInterface.addOnScrollListener(camera2ImplConfigBuilder.f253a);
        final ShareTargetParams shareTargetParams = (ShareTargetParams) this.b.getValue();
        int i4 = this.TuitionPaymentFragmentbindingInflater1;
        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        MutableLiveData<VirtualCameraAdapter1<List<PodcastVideoList>>> mutableLiveData = shareTargetParams.asInterface;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        User userAsBinder = shareTargetParams.d.asBinder();
        addCallback addcallback = shareTargetParams.TuitionPaymentFragmentbindingInflater1;
        if (userAsBinder != null) {
            int i6 = g + 125;
            d = i6 % 128;
            if (i6 % 2 != 0) {
                str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i7 = 48 / 0;
            } else {
                str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
        } else {
            str = null;
        }
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(addcallback.b(new PodcastRequest(String.valueOf(str), String.valueOf(i4), String.valueOf(i5)))));
        final Function1 function1 = new Function1() { // from class: ShareTarget
            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1821140573;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareTargetParams.b(shareTargetParams, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: defaultConfig
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: Camera2Config
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareTargetParams.TuitionPaymentFragmentspecialinlinedviewModeldefault3(shareTargetParams, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: SplashScreenParamKey
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        shareTargetParams.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        int i8 = d + 41;
        g = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 3 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        ((ActivityVideoListBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbarCenter.tvToolbarTitle.setText(getString(R.string.menu_podcast));
        RecyclerView recyclerView = ((ActivityVideoListBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvVideo;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter((Camera2ImplConfigBuilder) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        Camera2ImplConfigBuilder camera2ImplConfigBuilder = (Camera2ImplConfigBuilder) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        camera2ImplConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(((ActivityVideoListBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvVideo);
        camera2ImplConfigBuilder.g = this;
        int i2 = d + 19;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        String str;
        final VideoListActivity videoListActivity = (VideoListActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        ShareTargetParams shareTargetParams = (ShareTargetParams) videoListActivity.b.getValue();
        final MutableLiveData mutableLiveData = new MutableLiveData();
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        User userAsBinder = shareTargetParams.d.asBinder();
        addCallback addcallback = shareTargetParams.TuitionPaymentFragmentbindingInflater1;
        Object obj = null;
        if (userAsBinder != null) {
            int i2 = g + 5;
            d = i2 % 128;
            if (i2 % 2 != 0) {
                String str2 = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                throw null;
            }
            str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } else {
            str = null;
        }
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(addcallback.b(new PodcastRequest(String.valueOf(str), String.valueOf(iIntValue), String.valueOf(iIntValue2)))));
        final Function1 function1 = new Function1() { // from class: ShareData
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ShareTargetParams.TuitionPaymentFragmentbindingInflater1(mutableLiveData, (List) obj2);
            }
        };
        logToString logtostring = new logToString() { // from class: ShareTargetEncodingType
            @Override // defpackage.logToString
            public final void accept(Object obj2) {
                function1.invoke(obj2);
            }
        };
        final Function1 function2 = new Function1() { // from class: ShareTargetFileFormField
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ShareTargetParams.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mutableLiveData, (Throwable) obj2);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: ShareTargetRequestMethod
            @Override // defpackage.logToString
            public final void accept(Object obj2) {
                function2.invoke(obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        shareTargetParams.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        mutableLiveData.observe(videoListActivity, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: Camera2ConfigExternalSyntheticLambda0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static short[] f105a;
            private static final byte[] $$c = {87, -91, 60, 112};
            private static final int $$d = 74;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {1, 115, -83, 116, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
            private static final int $$b = 159;
            private static int d = 0;
            private static int asBinder = 1;
            private static int b = -691912492;
            private static int TuitionPaymentFragmentbindingInflater1 = -1934795534;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 216496848;
            private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {-66, 81, -77, 68, -67, 110, 87, -8, 68, 75, -77, 68, -67, 78, 119, -120, -71, -72, -65, 76, -76, 79, -40, 41, -12, 10, 46, -41, 36, -62, 47, 43, 44, 45, -47, -2, 28, -34, 47, 85, -92, 121, -121, -93, 90, -87, 79, -94, -90, -95, -96, 92, 115, 79, -99, -95, 30, -26, 90, 85, -83, 90, -93, 80, 105, -106, -89, -90, -95, 82, -86, 81, 43, 33, -46, 33, 109, -40, 85, 101, -106, -99, 102, -100, 110, -113, 97, -99, -85, 85, 101, 99, -100, -95, 39, -105, 103, -103, -90, 80, 115, -109, -86, -20, 31, 20, -17, 21, -25, 6, -24, 20, 35, -86, -24, -26, -26, -26, -26, -26, -26, -26};

            private static void e(short s, short s2, byte b2, Object[] objArr2) {
                byte[] bArr = $$a;
                int i3 = 98 - (s2 * 14);
                int i4 = s + 4;
                byte[] bArr2 = new byte[b2 + 1];
                int i5 = -1;
                if (bArr == null) {
                    int i6 = b2 + i4;
                    i4++;
                    i3 = i6 - 11;
                    i5 = -1;
                }
                while (true) {
                    int i7 = i5 + 1;
                    bArr2[i7] = (byte) i3;
                    if (i7 == b2) {
                        objArr2[0] = new String(bArr2, 0);
                        return;
                    }
                    i4++;
                    i3 = (i3 + bArr[i4]) - 11;
                    i5 = i7;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i3 = 2 % 2;
                int i4 = d + 9;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                Unit unitTuitionPaymentFragmentspecialinlinedviewModeldefault2 = VideoListActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj2);
                if (i5 == 0) {
                    int i6 = 29 / 0;
                }
                return unitTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }

            /* JADX WARN: Code duplicated, block: B:75:0x02b7  */
            /* JADX WARN: Code duplicated, block: B:76:0x02db  */
            private static void c(int i3, int i4, short s, byte b2, int i5, Object[] objArr2) throws Throwable {
                int i6;
                int i7 = 2;
                int i8 = 2 % 2;
                SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr3 = {Integer.valueOf(i4), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), TextUtils.indexOf("", "") + 2267, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33, 1387473586, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue3 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr3)).intValue();
                    boolean z = iIntValue3 == -1;
                    if (z) {
                        int i9 = $11 + 89;
                        $10 = i9 % 128;
                        if (i9 % 2 != 0) {
                            throw null;
                        }
                        byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i10 = 0;
                            while (i10 < length) {
                                int i11 = $11 + 7;
                                $10 = i11 % 128;
                                if (i11 % i7 != 0) {
                                    try {
                                        Object[] objArr4 = {Integer.valueOf(bArr[i10])};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            byte b5 = (byte) 0;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.green(0), 3358 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getLongPressTimeout() >> 16) + 18, -1054011043, false, $$e(b5, b5, (byte) $$c.length), new Class[]{Integer.TYPE});
                                        }
                                        bArr2[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr4)).byteValue();
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                } else {
                                    Object[] objArr5 = {Integer.valueOf(bArr[i10])};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        byte b6 = (byte) 0;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.MeasureSpec.getSize(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3358, (ViewConfiguration.getWindowTouchSlop() >> 8) + 18, -1054011043, false, $$e(b6, b6, (byte) $$c.length), new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr5)).byteValue();
                                    i10++;
                                }
                                i7 = 2;
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            int i12 = $11 + 97;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            Object[] objArr6 = {Integer.valueOf(i5), Integer.valueOf(b)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) Color.red(0), View.combineMeasuredStates(0, 0) + 2267, Color.blue(0) + 33, 1387473586, false, $$e(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue3 = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                        } else {
                            iIntValue3 = (short) (((short) (((long) f105a[i5 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                        }
                    }
                    if (iIntValue3 > 0) {
                        int i14 = ((i5 + iIntValue3) - 2) + ((int) (((long) b) ^ 3046761265686732006L));
                        if (z) {
                            int i15 = $11 + 85;
                            $10 = i15 % 128;
                            int i16 = i15 % 2;
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i14 + i6;
                        Object[] objArr7 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 55904), 2855 - (ViewConfiguration.getFadingEdgeLength() >> 16), 13 - Color.green(0), -1529949196, false, $$e(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr7)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            for (int i17 = 0; i17 < length2; i17++) {
                                bArr5[i17] = (byte) (((long) bArr4[i17]) ^ 3046761265686732006L);
                            }
                            bArr4 = bArr5;
                        }
                        boolean z2 = bArr4 != null;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                        while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue3) {
                            int i18 = $10 + 117;
                            $11 = i18 % 128;
                            if (i18 % 2 == 0) {
                                int i19 = 22 / 0;
                                if (z2) {
                                    byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
                                } else {
                                    short[] sArr = f105a;
                                    int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 - 1;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i21]) ^ 3046761265686732006L)) + s)) ^ b2));
                                }
                            } else if (z2) {
                                byte[] bArr7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i22 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i22 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i22]) ^ 3046761265686732006L)) + s)) ^ b2));
                            } else {
                                short[] sArr2 = f105a;
                                int i23 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i23 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr2[i23]) ^ 3046761265686732006L)) + s)) ^ b2));
                            }
                            sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                        }
                    }
                    objArr2[0] = sb.toString();
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v132 */
            /* JADX WARN: Type inference failed for: r1v63 */
            /* JADX WARN: Type inference failed for: r3v10, types: [int[]] */
            /* JADX WARN: Type inference failed for: r4v18 */
            /* JADX WARN: Type inference failed for: r4v184 */
            /* JADX WARN: Type inference failed for: r4v185 */
            /* JADX WARN: Type inference failed for: r4v186 */
            /* JADX WARN: Type inference failed for: r4v187 */
            /* JADX WARN: Type inference failed for: r4v19 */
            /* JADX WARN: Type inference failed for: r4v20 */
            /* JADX WARN: Type inference failed for: r4v21 */
            /* JADX WARN: Type inference failed for: r4v22 */
            /* JADX WARN: Type inference failed for: r4v23, types: [int] */
            /* JADX WARN: Type inference failed for: r4v47, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r4v52, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r4v7 */
            /* JADX WARN: Type inference failed for: r4v72 */
            /* JADX WARN: Type inference failed for: r4v8, types: [int] */
            /* JADX WARN: Type inference failed for: r6v44 */
            /* JADX WARN: Type inference failed for: r6v62 */
            /* JADX WARN: Type inference failed for: r6v65 */
            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] b(android.content.Context r27, int r28, int r29, int r30) {
                /*
                    Method dump skipped, instruction units count: 3143
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.Camera2ConfigExternalSyntheticLambda0.b(android.content.Context, int, int, int):java.lang.Object[]");
            }

            private static String $$e(short s, short s2, short s3) {
                int i3 = s3 + 117;
                byte[] bArr = $$c;
                int i4 = s * 2;
                int i5 = 4 - (s2 * 2);
                byte[] bArr2 = new byte[1 - i4];
                int i6 = 0 - i4;
                int i7 = -1;
                if (bArr == null) {
                    i3 += i6;
                    i5++;
                }
                while (true) {
                    i7++;
                    bArr2[i7] = (byte) i3;
                    if (i7 == i6) {
                        return new String(bArr2, 0);
                    }
                    i3 += bArr[i5];
                    i5++;
                }
            }
        }));
        int i3 = d + 27;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f = 0.0f;
        if (cArr2 != null) {
            int i3 = $10 + 125;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) ((AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 31339);
                        int iRed = 2994 - Color.red(0);
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 17;
                        byte b = (byte) ($$c[1] + 1);
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iRed, offsetAfter, 1182129903, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
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
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 253 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getTapTimeout() >> 16) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i6 = 1687675375;
        if (!f576a) {
            if (!asInterface) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i7 = $10 + 57;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char deadChar = (char) (33602 - KeyEvent.getDeadChar(0, 0));
                    int packedPositionType = 3085 - ExpandableListView.getPackedPositionType(0L);
                    int i9 = 26 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b3 = $$c[1];
                    byte b4 = (byte) (b3 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, packedPositionType, i9, -2146875848, false, $$i(b4, b4, (byte) (-b3)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i6 = 1687675375;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            int i10 = $11 + 27;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 >> 1) >>> getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] * iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 33603);
                    int mode = 3085 - View.MeasureSpec.getMode(0);
                    int deadChar2 = KeyEvent.getDeadChar(0, 0) + 26;
                    byte b5 = $$c[1];
                    byte b6 = (byte) (b5 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel, mode, deadChar2, -2146875848, false, $$i(b6, b6, (byte) (-b5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            } else {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) (33603 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int i11 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3086;
                    int i12 = 27 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte b7 = $$c[1];
                    byte b8 = (byte) (b7 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, i11, i12, -2146875848, false, $$i(b8, b8, (byte) (-b7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr6);
        int i13 = $10 + 113;
        $11 = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer num) {
        int i = 2 % 2;
        int i2 = d + 115;
        g = i2 % 128;
        int i3 = i2 % 2;
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 652877856, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto5).substring(8, 9).codePointAt(0) - 1782800731, -1246589175, 1246589178, new Object[]{this, Integer.valueOf(this.TuitionPaymentFragmentbindingInflater1), Integer.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)}, VocationProfileRequest.TuitionPaymentFragmentbindingInflater1(), TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        int i4 = g + 109;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 29945);
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 1755;
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((short) 193, (byte) (bArr[0] - 1), bArr[28], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, capsMode, keyRepeatTimeout, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i2 = d + 51;
            g = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char packedPositionType = (char) (29944 - ExpandableListView.getPackedPositionType(0L));
                int iResolveSize = View.resolveSize(0, 0) + 1755;
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 23;
                Object[] objArr3 = new Object[1];
                c((short) 156, (byte) 52, $$a[28], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, iResolveSize, offsetBefore, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int iNextInt = new Random().nextInt();
            int i4 = (((~((-642302082) | iNextInt)) | 557057) * (-566)) + 527896687 + ((~(iNextInt | (-641745025))) * 566) + 527527688;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91, new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(null, null, (ViewConfiguration.getFadingEdgeLength() >> 16) + 127, new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {1237246316};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 42049), 1725 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), 527527688);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 29944);
                    int pressedStateDuration = 1755 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 23;
                    Object[] objArr8 = new Object[1];
                    c((short) 156, (byte) 52, $$a[28], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize, pressedStateDuration, iIndexOf, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_bri_epay).substring(0, 9).codePointAt(1) + 82, new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 11, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 29945);
                        int iResolveSize2 = View.resolveSize(0, 0) + 1755;
                        int bitsPerPixel2 = 22 - ImageFormat.getBitsPerPixel(0);
                        short s = (short) 104;
                        Object[] objArr11 = new Object[1];
                        c(s, (byte) (s >>> 1), $$a[28], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, iResolveSize2, bitsPerPixel2, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char keyRepeatDelay = (char) (29944 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        int offsetAfter = 1755 - TextUtils.getOffsetAfter("", 0);
                        int bitsPerPixel3 = 22 - ImageFormat.getBitsPerPixel(0);
                        byte[] bArr2 = $$a;
                        Object[] objArr12 = new Object[1];
                        c((short) 193, (byte) (bArr2[0] - 1), bArr2[28], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatDelay, offsetAfter, bitsPerPixel3, 986134021, false, (String) objArr12[0], null);
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
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw null;
        }
        int i7 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        Object[] objArr13 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i8 = ~iIdentityHashCode;
        int i9 = i7 + (-37244843) + (((~(iIdentityHashCode | (-491893871))) | (~((-548160129) | i8)) | 335557702) * (-68)) + ((~((-156336169) | i8)) * (-68)) + (((~(491893870 | i8)) | (-704496297)) * 68);
        int i10 = (i9 << 13) ^ i9;
        int i11 = i10 ^ (i10 >>> 17);
        ((int[]) objArr13[3])[0] = i11 ^ (i11 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iGreen = 1031 - Color.green(0);
            int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0', 0, 0);
            short s2 = (short) 52;
            Object[] objArr14 = new Object[1];
            c(s2, (byte) s2, $$a[28], objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(minimumFlingVelocity, iGreen, iLastIndexOf, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(null, null, 127 - ((Process.getThreadPriority(0) + 20) >> 6), new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.thank_you).substring(0, 1).codePointAt(0) + 43, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
            int iAlpha = 1031 - Color.alpha(0);
            int iArgb = Color.argb(0, 0, 0, 0) + 15;
            Object[] objArr17 = new Object[1];
            c((short) 156, (byte) 52, $$a[28], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf2, iAlpha, iArgb, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
                int absoluteGravity = 15 - Gravity.getAbsoluteGravity(0, 0);
                short s3 = $$a[7];
                byte b = (byte) s3;
                Object[] objArr18 = new Object[1];
                c(s3, b, b, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c, threadPriority, absoluteGravity, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i12 = ((int[]) objArr19[3])[0];
            int i13 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i14 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            int i15 = ~i14;
            int i16 = (~((-459915258) | i15)) | 320973680;
            int i17 = ~(i14 | (-76693511));
            int i18 = (((-1835689719) + ((i16 | i17) * (-502))) + ((i17 | (~(i15 | (-138941578)))) * TypedValues.PositionType.TYPE_DRAWPATH)) - 2111814516;
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr[2])[0] = i20 ^ (i20 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.copied_company_code).substring(1, 2).codePointAt(0) + 16, new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.hint_expiry_date).substring(16, 17).length() + 126, new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {1237246316};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (MotionEvent.axisFromString("") + 46039), 1134 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.getTrimmedLength("") + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -2111814516, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char mode = (char) View.MeasureSpec.getMode(0);
                int packedPositionChild = 1030 - ExpandableListView.getPackedPositionChild(0L);
                int iIndexOf2 = 15 - TextUtils.indexOf("", "");
                short s4 = (short) 52;
                Object[] objArr24 = new Object[1];
                c(s4, (byte) s4, $$a[28], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(mode, packedPositionChild, iIndexOf2, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 45993), 1117 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 18), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int i21 = 1031 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int size = 15 - View.MeasureSpec.getSize(0);
                short s5 = $$a[7];
                byte b2 = (byte) s5;
                Object[] objArr25 = new Object[1];
                c(s5, b2, b2, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(maxKeyCode, i21, size, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(null, null, TextUtils.getOffsetAfter("", 0) + 127, new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(null, null, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 116, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char packedPositionChild2 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1031;
                    int fadingEdgeLength = 15 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    Object[] objArr28 = new Object[1];
                    c((short) 156, (byte) 52, $$a[28], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(packedPositionChild2, iCombineMeasuredStates, fadingEdgeLength, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char size2 = (char) View.MeasureSpec.getSize(0);
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 1032;
                    int i22 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14;
                    short s6 = (short) 52;
                    Object[] objArr29 = new Object[1];
                    c(s6, (byte) s6, $$a[28], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(size2, iLastIndexOf2, i22, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i23 = ((int[]) objArr[1])[0];
        int i24 = ((int[]) objArr[3])[0];
        if (i24 == i23) {
            int i25 = d + 115;
            g = i25 % 128;
            int i26 = i25 % 2;
            Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[3])[0];
            int i29 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[0];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i30 = i27 + ((~(elapsedCpuTime | (-552953737))) * TypedValues.CycleType.TYPE_EASING) + 1594135873 + (((~((~elapsedCpuTime) | (-552953737))) | 251695218) * TypedValues.CycleType.TYPE_EASING);
            int i31 = i30 ^ (i30 << 13);
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr30[2])[0] = i32 ^ (i32 << 5);
            int i33 = g + 33;
            d = i33 % 128;
            if (i33 % 2 != 0) {
                int i34 = 52 / 0;
                return;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 != null) {
            int i35 = d + 89;
            g = i35 % 128;
            int i36 = 2;
            int i37 = i35 % 2;
            int i38 = 0;
            while (i38 < strArr4.length) {
                int i39 = g + 39;
                d = i39 % 128;
                int i40 = i39 % i36;
                arrayList2.add(strArr4[i38]);
                i38++;
                i36 = 2;
            }
        }
        int[] iArr = new int[i24];
        int i41 = i24 - 1;
        iArr[i41] = 1;
        Toast.makeText((Context) null, iArr[((i24 * i41) % 2) - 1], 1).show();
        Object[] objArr31 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i42 = ((int[]) objArr[2])[0];
        int i43 = ((int[]) objArr[3])[0];
        int i44 = ((int[]) objArr[1])[0];
        String[] strArr5 = (String[]) objArr[0];
        int i45 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
        int i46 = i42 + ((((-1972138803) + (((~(171249788 | i45)) | (-415529959)) * (-948))) + ((~((~i45) | (-281045891))) * (-948))) - 720426856);
        int i47 = (i46 << 13) ^ i46;
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr31[2])[0] = i48 ^ (i48 << 5);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = g + 39;
        d = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i5 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
        int i6 = ~i5;
        if (i4 != 475278640 + (((~(1862124563 | i6)) | 1032137020) * (-90)) + (((~(1862124563 | i5)) | 1115210755) * (-45)) + (((~(i5 | (-1032137021))) | 1862124563 | (~(i6 | 1032137020))) * 45)) {
            throw new RuntimeException("-1958705942");
        }
        int i7 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i8 = (-1046128372) + ((~(iIdentityHashCode | 823801871)) * 216);
        int i9 = ~iIdentityHashCode;
        if (i7 != i8 + (((-1216677185) | i9) * (-216)) + (((~(i9 | 823801871)) | 1755254093) * 216)) {
            throw new RuntimeException("-1741817334");
        }
        super.onResume();
        int i10 = g + 21;
        d = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1737468315
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.podcast.VideoListActivity.onStart():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x012a, code lost:
    
        if (r1 != (((1385593784 + ((r7 | r8) * 1150)) + (((~((-2034694085) | r3)) | r8) * (-575))) + (((~(r2 | (-318782754))) | (~(r3 | 318782753))) * 575))) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x012c, code lost:
    
        super.onCreate(r12);
        r12 = com.bpjstku.presentation.podcast.VideoListActivity.g + 13;
        com.bpjstku.presentation.podcast.VideoListActivity.d = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0138, code lost:
    
        if ((r12 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x013a, code lost:
    
        r12 = 55 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x013d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x013e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x013f, code lost:
    
        r12 = (-1229189770) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0148, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0074, code lost:
    
        if (r1 == ((r9 + (((~(r6 | (-587726901))) | (~(728450228 | r8))) * 859)) + (((~(1558437771 | r8)) | (-2146164672)) * 859))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00da, code lost:
    
        if (r1 == (((604426472 + ((r6 | (-1854899128)) * 140)) + (((~((-1854899128) | r8)) | 738623648) * (-280))) + (((~(r6 | (-738623649))) | ((~(1024911584 | r8)) | (-2141187064))) * 140))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00dc, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        r3 = ~r2;
        r7 = ~((-318782754) | r3);
        r8 = ~(2034694084 | r2);
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.podcast.VideoListActivity.onCreate(android.os.Bundle):void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        VideoListActivity videoListActivity = (VideoListActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 119;
        int i4 = i3 % 128;
        d = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            boolean z = virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            obj.hashCode();
            throw null;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            ((Camera2ImplConfigBuilder) videoListActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).g();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            int i5 = i2 + 71;
            d = i5 % 128;
            int i6 = i5 % 2;
            ((Camera2ImplConfigBuilder) videoListActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1();
            ((Camera2ImplConfigBuilder) videoListActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2((List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = g + 75;
            d = i7 % 128;
            int i8 = i7 % 2;
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            int i9 = i4 + 81;
            g = i9 % 128;
            if (i9 % 2 == 0) {
                ((Camera2ImplConfigBuilder) videoListActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                throw null;
            }
            ((Camera2ImplConfigBuilder) videoListActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        } else if ((virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && ((Camera2ImplConfigBuilder) videoListActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() != 0) {
            ((Camera2ImplConfigBuilder) videoListActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1();
            ((Camera2ImplConfigBuilder) videoListActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        final VideoListActivity videoListActivity = (VideoListActivity) objArr[0];
        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) objArr[1];
        int i = 2 % 2;
        if (!(true ^ (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1))) {
            videoListActivity.MediaBrowserCompat();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            videoListActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            if (((Collection) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).isEmpty()) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(videoListActivity, "Data Tidak Tersedia.", new Function0() { // from class: Camera2ImplConfig
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return VideoListActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    }
                });
            } else {
                int i2 = g + 15;
                d = i2 % 128;
                if (i2 % 2 != 0) {
                    ((Camera2ImplConfigBuilder) videoListActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2((List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i3 = 14 / 0;
                } else {
                    ((Camera2ImplConfigBuilder) videoListActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2((List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i4 = d + 119;
            g = i4 % 128;
            int i5 = i4 % 2;
            videoListActivity.IconCompatParcelizer();
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            if (!Intrinsics.areEqual(String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), "DATA NOT FOUND") || !Intrinsics.areEqual(String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), "data tidak ditemukan")) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(videoListActivity, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), new Function0() { // from class: Camera2ConfigDefaultProvider
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return VideoListActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(VideoListActivity videoListActivity, PodcastVideoList podcastVideoList) {
        int i = 2 % 2;
        int i2 = g + 77;
        d = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(podcastVideoList, "");
        if (podcastVideoList.b.length() == 0) {
            int i4 = d + 39;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                LinearLayout linearLayout = ((ActivityVideoListBinding) ((ViewBinding) videoListActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rootView;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(linearLayout, "Video Tidak Dapat Diputar.");
                int i5 = 22 / 0;
            } else {
                LinearLayout linearLayout2 = ((ActivityVideoListBinding) ((ViewBinding) videoListActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rootView;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(linearLayout2, "Video Tidak Dapat Diputar.");
            }
        } else {
            Intent intent = new Intent(videoListActivity, (Class<?>) VideoPlayerActivity.class);
            intent.putExtra("podcastVideoList", podcastVideoList);
            intent.putExtra("videoId", podcastVideoList.b);
            videoListActivity.startActivity(intent);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(VideoListActivity videoListActivity, View view) {
        int i = 2 % 2;
        int i2 = g + 49;
        d = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 != 0) {
                videoListActivity.finish();
                ViewPortBuilder.b();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            videoListActivity.finish();
            ViewPortBuilder.b();
            int i4 = g + 61;
            d = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit b(VideoListActivity videoListActivity) {
        int i = 2 % 2;
        int i2 = g + 121;
        d = i2 % 128;
        int i3 = i2 % 2;
        videoListActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = d + 37;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Camera2ImplConfigBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2(final VideoListActivity videoListActivity) {
        int i = 2 % 2;
        Camera2ImplConfigBuilder camera2ImplConfigBuilder = new Camera2ImplConfigBuilder(videoListActivity, null, new Function1() { // from class: Camera2ConfigExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoListActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (PodcastVideoList) obj);
            }
        }, 2, null);
        int i2 = g + 61;
        d = i2 % 128;
        int i3 = i2 % 2;
        return camera2ImplConfigBuilder;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoListActivity videoListActivity) {
        int i = 2 % 2;
        int i2 = d + 37;
        g = i2 % 128;
        int i3 = i2 % 2;
        videoListActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = g + 81;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = ~(i7 | i8 | i);
        int i10 = ~i;
        int i11 = i9 | (~(i7 | i10 | i3));
        int i12 = (~(i | i8)) | i7 | (~(i10 | i3));
        int i13 = i4 + i3 + i2 + (1112421973 * i6) + ((-1897213938) * i5);
        int i14 = i13 * i13;
        int i15 = ((1216318437 * i4) - 781189120) + ((-1395624931) * i3) + (i11 * (-1305971684)) + ((-1305971684) * i8) + (1305971684 * i12) + ((-89653248) * i2) + ((-1446510592) * i6) + (892338176 * i5) + ((-1657864192) * i14);
        int i16 = (i4 * 2010092721) + 1217064380 + (i3 * 2010090761) + (i11 * (-980)) + (i8 * (-980)) + (i12 * 980) + (i2 * 2010091741) + (i6 * (-1378896031)) + (i5 * 856652822) + (i14 * 563281920);
        int i17 = i15 + (i16 * i16 * (-1077346304));
        if (i17 == 1) {
            return b(objArr);
        }
        if (i17 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i17 == 3) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        VideoListActivity videoListActivity = (VideoListActivity) objArr[0];
        int i18 = 2 % 2;
        int i19 = d + 37;
        g = i19 % 128;
        int i20 = i19 % 2;
        super.onPause();
        int i21 = d + 117;
        g = i21 % 128;
        int i22 = i21 % 2;
        return null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(VideoListActivity videoListActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        return (Unit) b(TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -228202881, 228202883, new Object[]{videoListActivity, virtualCameraAdapter1}, TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(VideoListActivity videoListActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        return (Unit) b(TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 568465564, -568465563, new Object[]{videoListActivity, virtualCameraAdapter1}, TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    private final void b(int p0, int p1) {
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 652877856, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto5).substring(8, 9).codePointAt(0) - 1782800731, -1246589175, 1246589178, new Object[]{this, Integer.valueOf(p0), Integer.valueOf(p1)}, VocationProfileRequest.TuitionPaymentFragmentbindingInflater1(), TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = g + 49;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 != 0) {
            int i4 = 95 / 0;
        }
        int i5 = i3 + 85;
        g = i5 % 128;
        int i6 = i5 % 2;
        return R.layout.activity_video_list;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = d + 107;
        g = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        b(TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), TypeAdapters.AnonymousClass27.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1840408440, 1840408440, new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 906614142, VocationProfileRequest.TuitionPaymentFragmentbindingInflater1());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, short r7, short r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.podcast.VideoListActivity.$$c
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r8 = 68 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2b
        L15:
            r3 = r2
        L16:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2b:
            int r3 = -r3
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.podcast.VideoListActivity.$$i(int, short, short):java.lang.String");
    }
}
