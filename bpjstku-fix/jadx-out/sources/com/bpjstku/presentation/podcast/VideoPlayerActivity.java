package com.bpjstku.presentation.podcast;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.point.PointDataStore;
import com.bpjstku.databinding.ActivityVideoPlayerBinding;
import com.bpjstku.domain.podcast.model.PodcastVideoList;
import com.bpjstku.domain.programinfo.model.BenefitItem;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.podcast.VideoPlayerActivity;
import com.bpjstku.util.constant.PodcastTypeLog;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.dynamiclinks.ShortDynamicLink;
import defpackage.ApiCompatApi29Impl;
import defpackage.DecorContentParent;
import defpackage.HandlerScheduledExecutorService1;
import defpackage.HandlerScheduledExecutorService2;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.ShareTargetParams;
import defpackage.ViewPortBuilder;
import defpackage.VirtualCameraAdapter1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.cacheInteropConfig;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.generateCameraId;
import defpackage.getConfigs;
import defpackage.getDelay;
import defpackage.getEventTime;
import defpackage.getMaxImages;
import defpackage.getServiceInfo;
import defpackage.initSession;
import defpackage.isPeriodic;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.onCaptureSessionStart;
import defpackage.scheduleAtFixedRate;
import defpackage.scheduleWithFixedDelay;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Random;
import kotlin.Deprecated;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0012\u0010\u0003R\u0015\u0010\n\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0015\u0010\t\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0014\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0016\u0010\u0018\u001a\u00020\u001b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u000e\u0010\u001c"}, d2 = {"Lcom/bpjstku/presentation/podcast/VideoPlayerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "b", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Z)V", "TuitionPaymentFragmentbindingInflater1", "onWindowFocusChanged", "onResume", "onDestroy", "onBackPressed", "LShareTargetParams;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Lazy;", "LApiCompatApi29Impl;", "", "d", "Ljava/lang/String;", "Z", "Lcom/bpjstku/databinding/ActivityVideoPlayerBinding;", "Lcom/bpjstku/databinding/ActivityVideoPlayerBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoPlayerActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private ActivityVideoPlayerBinding d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1 = "";
    private static final byte[] $$c = {39, -79, 42};
    private static final int $$f = 224;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {82, Base64.padSymbol, -66, -42, -15, -1, 60, -55, -17, 3, -12, -4, 6, -13, 68, -69, -5, 10, -17, 11, -12, -9, 16, -22, 8, -9, -2, Base64.padSymbol, -69, -5, 0, -1, -5, 62, -25, -36, -18, 16, -11, -6, 25, -37, 0, -1, -5, 43, -37, -20, 8, -16, 10, -14, -8, 82, -82, 0, 8, -1, -9, 5, -14, 69, -3, -72, -8, -1, 0, -8, 6, -2, Base64.padSymbol, -72, -8, 1, 2, -1, -20, 77, -67, -4, -4, 2, -23, 6, -11, 77, -16, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, 15, -10, -8, 7, -8, -8, 4, 27, -40, 5, -9, 8, -22, 12, -16, 62, -33, -15, 5, -16, 14, 44, -20, -33, -15, 5, -16, 14, 27, -47, -2, -9, -1, 0, 0, 36, -54, 1, 12, -16, 1, 10, -14, 22, -41, 8, -9, 9, 0, -18, 8, 3, 20, -24, -15, 8, -5, 0, 41, 14, -51, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, -2, 0, 8, -1, -9, 5, -14, 0, -8, -1, 0, -8, 6, -2, -21, 10, 1, -21, 39, -37, 8, -4, -10, 5, -4, -4, 2, -23, 6, -11, 63, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, -2, 0, 8, -1, -9, 5, -14, 0, -8, -1, 0, -8, 6, -2, -21, 10, 1, -21, 39, -37, 8, -4, -10, 5, -4, -4, 2, -23, 6, -11, 64, -1, -18, 27, -22, 1, -21, 32, -40, 6, 8, 31, -47, -9, 4, -9, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, -2, 0, 8, -1, -9, 5, -14, 0, -8, -1, 0, -8, 6, -2, -21, 10, 1, -21, 39, -37, 8, -4, -10, 5, -4, -4, 2, -23, 6, -11, 63, 8, -16, 9, -12, -6, 2, 33, -30, -4, -12, -9, 8, 0, -6, 1, -16, 46, -37, -20, 8, -9, -2, -15, -4, -12, 48, -38, -6, 4, 14, -30, 29, -41, -2, 1, -8, -2, 30, -36, -1, 10, 1, -15, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, -2, 0, 8, -1, -9, 5, -14, 0, -8, -1, 0, -8, 6, -2, -21, 10, 1, -21, 39, -37, 8, -4, -10, 5, -4, -4, 2, -23, 6, -11, 62, -1, -18, 34, -36, 8, -12, 2, -8, 4, 34, -45, -6, 9, -11, 3, -16, 75, -65};
    private static final int $$e = 101;
    private static final byte[] $$a = {23, -73, 107, 5, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 94;
    private static int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f577a = 1;
    private static int[] asInterface = {2110692263, -1914200634, -1970607247, -511432141, 2071425306, -1856891577, -715422227, -69167994, -985244294, -1535133636, -720093758, -1354273972, 1550898049, 540659848, 2064715509, -186138822, 2075554688, -1961545207};

    static final /* synthetic */ class TuitionPaymentFragmentbindingInflater1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentbindingInflater1(Function1 function1) {
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

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1454164016
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static /* synthetic */ java.lang.Object b(int r9, java.lang.Object[] r10, int r11, int r12, int r13, int r14, int r15) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.podcast.VideoPlayerActivity.b(int, java.lang.Object[], int, int, int, int, int):java.lang.Object");
    }

    private static void e(short s, byte b, short s2, Object[] objArr) {
        int i = 214 - s;
        int i2 = s2 + 84;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[b + 1];
        int i3 = -1;
        if (bArr == null) {
            i++;
            i2 = (b + i2) - 11;
        }
        while (true) {
            i3++;
            bArr2[i3] = (byte) i2;
            if (i3 == b) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b2 = bArr[i];
                i++;
                i2 = (i2 + b2) - 11;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001e -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = r5 + 1
            int r7 = r7 + 67
            int r6 = r6 + 4
            byte[] r1 = com.bpjstku.presentation.podcast.VideoPlayerActivity.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L10
            r4 = r5
            r3 = r2
            goto L22
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L1e
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L1e:
            int r3 = r3 + 1
            r4 = r1[r6]
        L22:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-3)
            int r6 = r6 + 1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.podcast.VideoPlayerActivity.f(byte, short, int, java.lang.Object[]):void");
    }

    public VideoPlayerActivity() {
        final VideoPlayerActivity videoPlayerActivity = this;
        this.b = LazyKt.lazy(new Function0<ShareTargetParams>() { // from class: com.bpjstku.presentation.podcast.VideoPlayerActivity$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ShareTargetParams, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ShareTargetParams invoke() {
                LifecycleOwner lifecycleOwner = videoPlayerActivity;
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
        final VideoPlayerActivity videoPlayerActivity2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<ApiCompatApi29Impl>() { // from class: com.bpjstku.presentation.podcast.VideoPlayerActivity$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ApiCompatApi29Impl, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ApiCompatApi29Impl invoke() {
                ComponentCallbacks componentCallbacks = videoPlayerActivity2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ApiCompatApi29Impl.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public static final /* synthetic */ ShareTargetParams TuitionPaymentFragmentbindingInflater1(VideoPlayerActivity videoPlayerActivity) {
        int i = 2 % 2;
        int i2 = g + 55;
        f577a = i2 % 128;
        int i3 = i2 % 2;
        ShareTargetParams shareTargetParams = (ShareTargetParams) videoPlayerActivity.b.getValue();
        int i4 = g + 65;
        f577a = i4 % 128;
        if (i4 % 2 != 0) {
            return shareTargetParams;
        }
        throw null;
    }

    public static final /* synthetic */ ActivityVideoPlayerBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoPlayerActivity videoPlayerActivity) {
        int i = 2 % 2;
        int i2 = f577a;
        int i3 = i2 + 79;
        g = i3 % 128;
        int i4 = i3 % 2;
        ActivityVideoPlayerBinding activityVideoPlayerBinding = videoPlayerActivity.d;
        int i5 = i2 + 35;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return activityVideoPlayerBinding;
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = asInterface;
        int i4 = -1870535734;
        int i5 = -1;
        int i6 = 1;
        int i7 = 0;
        if (iArr3 != null) {
            int i8 = $11 + 97;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i10 = 0;
            while (i10 < length2) {
                int i11 = $11 + 21;
                $10 = i11 % 128;
                int i12 = i11 % i2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i7] = Integer.valueOf(iArr3[i10]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i5;
                        byte b2 = (byte) (b + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), 3292 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.getCapsMode("", i7, i7) + 31, 1948206109, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr4[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i10++;
                    int i13 = $11 + 113;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    i2 = 2;
                    i4 = -1870535734;
                    i5 = -1;
                    i7 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = asInterface;
        long j = 0;
        if (iArr6 != null) {
            int i15 = $11 + 61;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i16 = 0;
            while (i16 < length) {
                try {
                    Object[] objArr3 = new Object[i6];
                    objArr3[0] = Integer.valueOf(iArr6[i16]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char c = (char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) - 1);
                        int iLastIndexOf = 3290 - TextUtils.lastIndexOf("", '0');
                        int i17 = 32 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1));
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iLastIndexOf, i17, 1948206109, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i16] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i16++;
                    iArr6 = iArr6;
                    j = 0;
                    i6 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        int i18 = 2;
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i19 = $11 + 91;
            $10 = i19 % 128;
            int i20 = i19 % i18;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i21 = 17;
            for (int i22 = 1; i21 > i22; i22 = 1) {
                int i23 = $10 + 97;
                $11 = i23 % 128;
                if (i23 % 2 == 0) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i21];
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), 2559 - Color.red(0), 30 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 683220507, false, $$g(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i21 += 50;
                } else {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i21];
                    Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (b7 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) KeyEvent.getDeadChar(0, 0), 2559 - KeyEvent.getDeadChar(0, 0), 29 - View.getDefaultSize(0, 0), 683220507, false, $$g(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                    i21--;
                }
            }
            int i24 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i24;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i25 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28879 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 348 - (ViewConfiguration.getTouchSlop() >> 8), 25 - View.MeasureSpec.getMode(0), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i18 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return false;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends WebChromeClient {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            super.onShowCustomView(view, customViewCallback);
            if (VideoPlayerActivity.TuitionPaymentFragmentbindingInflater1(VideoPlayerActivity.this).b) {
                ActivityVideoPlayerBinding activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault3 = VideoPlayerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoPlayerActivity.this);
                ActivityVideoPlayerBinding activityVideoPlayerBinding = null;
                if (activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                }
                activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault3.videoPlayer.setVisibility(8);
                ActivityVideoPlayerBinding activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault4 = VideoPlayerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoPlayerActivity.this);
                if (activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault4 = null;
                }
                activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault4.videoPlayerFullscreen.setVisibility(0);
                ActivityVideoPlayerBinding activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault5 = VideoPlayerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoPlayerActivity.this);
                if (activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    activityVideoPlayerBinding = activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                }
                activityVideoPlayerBinding.videoPlayerFullscreen.addView(view);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onHideCustomView() {
            super.onHideCustomView();
            if (VideoPlayerActivity.TuitionPaymentFragmentbindingInflater1(VideoPlayerActivity.this).b) {
                ActivityVideoPlayerBinding activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault3 = VideoPlayerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoPlayerActivity.this);
                ActivityVideoPlayerBinding activityVideoPlayerBinding = null;
                if (activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                }
                activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault3.videoPlayerFullscreen.removeAllViews();
                ActivityVideoPlayerBinding activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault4 = VideoPlayerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoPlayerActivity.this);
                if (activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault4 = null;
                }
                activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault4.videoPlayerFullscreen.setVisibility(8);
                ActivityVideoPlayerBinding activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault5 = VideoPlayerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoPlayerActivity.this);
                if (activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    activityVideoPlayerBinding = activityVideoPlayerBindingTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                }
                activityVideoPlayerBinding.videoPlayer.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:430:0x2903  */
    /* JADX WARN: Code duplicated, block: B:593:0x3447  */
    /* JADX WARN: Code duplicated, block: B:594:0x3448  */
    /* JADX WARN: Code duplicated, block: B:611:0x347f  */
    /* JADX WARN: Code duplicated, block: B:612:0x3480  */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        Throwable th;
        Throwable cause;
        String str;
        Object[] objArr2;
        int i;
        String str2;
        Object[] objArr3;
        Object[] objArr4;
        int i2;
        Throwable th2;
        Throwable cause2;
        String str3;
        Object[] objArr5;
        int i3;
        String str4;
        Object[] objArr6;
        int i4;
        int i5;
        Object[] objArr7;
        String str5;
        Object[] objArr8;
        Object[] objArr9;
        Object[] objArr10;
        String str6;
        char c;
        char c2;
        String str7;
        String str8;
        Object[] objArr11;
        Object[] objArr12;
        char c3;
        char c4;
        Object[] objArr13;
        Object[] objArr14;
        char c5;
        char c6;
        ActivityVideoPlayerBinding activityVideoPlayerBinding;
        PodcastVideoList podcastVideoList;
        int i6 = 2 % 2;
        String str9 = "android.app.ActivityThread";
        Object[] objArr15 = new Object[1];
        c(new int[]{1990361142, -305464592, -1899665438, 1848350860, -776411831, -1749514098, -1973281659, -572669690, 1546237203, -909758162, 1622992170, -1460702208, -543720961, -176484568}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.pay_now).substring(1, 3).length() + 20, objArr15);
        String str10 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        c(new int[]{1416255341, 296083240, -929532156, -1464790531, -729549954, -1710342877, 1786924892, -1934221825, 981273768, -340366550}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.cancel_transaction_message).substring(0, 1).length() + 14, objArr16);
        String str11 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        c(new int[]{-462013495, -1392157243, -96898725, -976205857, 1573374169, -2052066475, -1027475838, 1962070465, -1542091158, 1912709546}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 16, objArr17);
        String str12 = (String) objArr17[0];
        Object[] objArr18 = new Object[1];
        c(new int[]{-446004696, 1317449918, -1086459417, -264349137, -1493800831, 1550807602, -1096255253, 1048922120, -1759617917, -303703135}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.activity_bank_transfer_all_bank).substring(13, 15).codePointAt(0) - 81, objArr18);
        String str13 = (String) objArr18[0];
        Object[] objArr19 = new Object[1];
        c(new int[]{-1751616871, 980395047, 2069122275, 771559082, 1588985493, -1999236958, -1539033013, -1121014756, -768673816, -564173289, -1921412612, -841600503, -1931805642, -937493025, -451286324, -1219842894}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 10, objArr19);
        String str14 = (String) objArr19[0];
        Object[] objArr20 = new Object[1];
        c(new int[]{1886287568, -809074541, -1230861180, 740384040, -1037592103, 1987613907, -2103886966, -1136695855, 843883765, 557635599, -741936071, -311075855}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tnc_bni_point_3).substring(14, 15).codePointAt(0) - 14, objArr20);
        String str15 = (String) objArr20[0];
        int i7 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp;
        int i9 = ~i8;
        int i10 = ~(i9 | 661260928);
        if (i7 != (-113355672) + (((-2146086872) | i10) * (-712)) + (((~(i8 | (-1484825944))) | (~(2146086871 | i9))) * (-712)) + ((1491248471 | i10) * 712)) {
            throw new RuntimeException("437491654");
        }
        int i11 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i12 = ~startUptimeMillis;
        if (i11 != 1161482576 + ((startUptimeMillis | 1650471167) * 140) + ((353960960 | (~(1650471167 | i12))) * (-280)) + (((~(startUptimeMillis | (-353960961))) | (~(928584797 | i12)) | 1075847330) * 140)) {
            throw new RuntimeException("-1920686794");
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 43042);
            int scrollDefaultDelay = 3111 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int i13 = 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            short s = (short) 210;
            Object[] objArr21 = new Object[1];
            e(s, (byte) (s >>> 2), $$a[7], objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, scrollDefaultDelay, i13, -1272852037, false, (String) objArr21[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 43042);
                int iMyTid = 3111 - (Process.myTid() >> 22);
                int iCombineMeasuredStates = 22 - View.combineMeasuredStates(0, 0);
                Object[] objArr22 = new Object[1];
                e((short) 158, (byte) 37, $$a[7], objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iMyTid, iCombineMeasuredStates, 154975793, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i14 = ((int[]) objArr23[2])[0];
            int i15 = ((int[]) objArr23[1])[0];
            String[] strArr = (String[]) objArr23[3];
            int[] iArr = {i14};
            int[] iArr2 = {i15};
            int i16 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i17 = ~i16;
            int i18 = (-1272411950) + (((~((-1417729831) | i17)) | 268490532) * 168) + ((~((-268490533) | i16)) * 168) + (((~(i16 | (-1149239299))) | (~(i17 | (-287301629))) | 18811096) * 168) + 19007636;
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr[0])[0] = i20 ^ (i20 << 5);
            objArr = new Object[]{new int[1], iArr2, iArr, strArr};
            str12 = str12;
            str13 = str13;
        } else {
            str15 = str15;
            try {
                Object[] objArr24 = {null, Integer.valueOf(((Integer) Class.forName(str12).getMethod(str13, Object.class).invoke(null, this)).intValue()), 0, 19007636};
                byte[] bArr = $$d;
                Object[] objArr25 = new Object[1];
                f((byte) (bArr[0] + 1), bArr[30], bArr[279], objArr25);
                Class<?> cls = Class.forName((String) objArr25[0]);
                Object[] objArr26 = new Object[1];
                f((byte) (-bArr[41]), (short) (bArr[0] + 1), (byte) (-bArr[8]), objArr26);
                Object[] objArr27 = (Object[]) cls.getMethod((String) objArr26[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr24);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 43042);
                    int scrollBarFadeDuration = 3111 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int mode = 22 - View.MeasureSpec.getMode(0);
                    Object[] objArr28 = new Object[1];
                    e((short) 158, (byte) 37, $$a[7], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, scrollBarFadeDuration, mode, 154975793, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr27);
                try {
                    long jLongValue = ((Long) Class.forName(str10).getDeclaredMethod(str11, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char trimmedLength = (char) (43042 - TextUtils.getTrimmedLength(""));
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 3111;
                        int gidForName = Process.getGidForName("") + 23;
                        Object[] objArr29 = new Object[1];
                        e((short) 121, (byte) 52, $$a[7], objArr29);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(trimmedLength, tapTimeout, gidForName, -1269618118, false, (String) objArr29[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cKeyCodeFromString = (char) (43042 - KeyEvent.keyCodeFromString(""));
                        int iLastIndexOf = 3110 - TextUtils.lastIndexOf("", '0');
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 22;
                        short s2 = (short) 210;
                        Object[] objArr30 = new Object[1];
                        e(s2, (byte) (s2 >>> 2), $$a[7], objArr30);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cKeyCodeFromString, iLastIndexOf, iNormalizeMetaState, -1272852037, false, (String) objArr30[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                    objArr = objArr27;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th3) {
                th = th3;
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i21 = ((int[]) objArr[1])[0];
        int i22 = ((int[]) objArr[2])[0];
        if (i22 == i21) {
            int i23 = f577a + 61;
            g = i23 % 128;
            int i24 = i23 % 2;
            int i25 = ((int[]) objArr[0])[0];
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int[] iArr3 = {i26};
            int[] iArr4 = {i27};
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 73369031;
            int i28 = ~iCodePointAt;
            int i29 = (~((-1009106633) | i28)) | 335873664 | (~(695924826 | i28));
            int i30 = i25 + 1798703270 + (((~(iCodePointAt | (-22691859))) | i29) * 590) + (i29 * (-1180)) + (((~((-695924827) | i28)) | (~(i28 | 1009106632))) * 590);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr[0])[0] = i32 ^ (i32 << 5);
            Object[] objArr31 = {new int[1], iArr4, iArr3, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i33 = f577a + 41;
                g = i33 % 128;
                for (int i34 = i33 % 2 != 0 ? 1 : 0; i34 < strArr3.length; i34++) {
                    arrayList.add(strArr3[i34]);
                }
            }
            Toast.makeText((Context) null, i22 / (((i22 - 1) * i22) % 2), 0).show();
            int i35 = ((int[]) objArr[0])[0];
            int i36 = ((int[]) objArr[2])[0];
            int i37 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr5 = {i36};
            int[] iArr6 = {i37};
            int i38 = ~System.identityHashCode(this);
            int i39 = ~(27204577 | i38);
            int i40 = i35 + 1390493350 + ((i39 | 1677826881) * 764) + (((~(i38 | 1677826881)) | 27132064) * (-1528)) + ((1704886432 | i39) * 764);
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr[0])[0] = i42 ^ (i42 << 5);
            Object[] objArr32 = {new int[1], iArr6, iArr5, strArr4};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char c7 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
            int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 876;
            int iResolveOpacity = 10 - Drawable.resolveOpacity(0, 0);
            Object[] objArr33 = new Object[1];
            e((short) 158, (byte) 37, $$a[7], objArr33);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c7, pressedStateDuration2, iResolveOpacity, -1650998592, false, (String) objArr33[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
        long jLongValue2 = ((Long) Class.forName(str10).getDeclaredMethod(str11, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            int scrollBarFadeDuration2 = 876 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int packedPositionChild = 9 - ExpandableListView.getPackedPositionChild(0L);
            Object[] objArr34 = new Object[1];
            e((short) 121, (byte) 52, $$a[7], objArr34);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(threadPriority, scrollBarFadeDuration2, packedPositionChild, 2012020043, false, (String) objArr34[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int iMakeMeasureSpec = 876 - View.MeasureSpec.makeMeasureSpec(0, 0);
                int i43 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
                short s3 = (short) 210;
                Object[] objArr35 = new Object[1];
                e(s3, (byte) (s3 >>> 2), $$a[7], objArr35);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(windowTouchSlop, iMakeMeasureSpec, i43, 2012931276, false, (String) objArr35[0], null);
            }
            Object[] objArr36 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr36[0])[0]}, new int[1], new int[]{((int[]) objArr36[2])[0]}, (String[]) objArr36[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i44 = ~(842130362 | iIdentityHashCode);
            int i45 = (((1817682878 + (((-1073475584) | i44) * (-814))) + ((i44 | ((~((~iIdentityHashCode) | 801820133)) | 570474912)) * 407)) + (((~(iIdentityHashCode | (-801820134))) | ((~((-842130363) | iIdentityHashCode)) | 570474912)) * 407)) - 1369549507;
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArr2[1])[0] = i47 ^ (i47 << 5);
            str14 = str14;
            str = str13;
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                str15 = str15;
                baseContext = (Context) Class.forName(str14).getMethod(str15, new Class[0]).invoke(null, null);
            } else {
                str15 = str15;
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            str = str13;
            Object[] objArr37 = {baseContext, Integer.valueOf(((Integer) Class.forName(str12).getMethod(str, Object.class).invoke(null, this)).intValue()), 0, -1369549507};
            byte[] bArr2 = $$d;
            Object[] objArr38 = new Object[1];
            f((byte) ($$e - 4), (short) 120, bArr2[30], objArr38);
            Class<?> cls2 = Class.forName((String) objArr38[0]);
            byte b = (byte) 52;
            Object[] objArr39 = new Object[1];
            f(b, (short) 217, (byte) (-bArr2[8]), objArr39);
            Object[] objArr40 = (Object[]) cls2.getMethod((String) objArr39[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr37);
            if (baseContext != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char c8 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 876;
                    int i48 = 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    short s4 = (short) 210;
                    Object[] objArr41 = new Object[1];
                    e(s4, (byte) (s4 >>> 2), $$a[7], objArr41);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c8, longPressTimeout, i48, 2012931276, false, (String) objArr41[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, objArr40);
                try {
                    long jLongValue3 = ((Long) Class.forName(str10).getDeclaredMethod(str11, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                        int windowTouchSlop2 = 876 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10;
                        Object[] objArr42 = new Object[1];
                        e((short) 121, b, $$a[7], objArr42);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(capsMode, windowTouchSlop2, scrollDefaultDelay2, 2012020043, false, (String) objArr42[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char c9 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int iAxisFromString = MotionEvent.axisFromString("") + 877;
                        int i49 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
                        Object[] objArr43 = new Object[1];
                        e((short) 158, (byte) 37, $$a[7], objArr43);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c9, iAxisFromString, i49, -1650998592, false, (String) objArr43[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } else {
                str15 = str15;
                objArr40 = objArr40;
                str14 = str14;
            }
            objArr2 = objArr40;
        }
        int i50 = ((int[]) objArr2[2])[0];
        int i51 = ((int[]) objArr2[0])[0];
        if (i51 == i50) {
            int i52 = ((int[]) objArr2[1])[0];
            Object[] objArr44 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i53 = i52 + ((~((-277225505) | iIdentityHashCode2)) * 521) + 181972148 + (((~((~iIdentityHashCode2) | (-277225505))) | (-318715904)) * 521);
            int i54 = (i53 << 13) ^ i53;
            int i55 = i54 ^ (i54 >>> 17);
            ((int[]) objArr44[1])[0] = i55 ^ (i55 << 5);
            i = 0;
        } else {
            int[] iArr7 = new int[i51];
            int i56 = i51 - 1;
            iArr7[i56] = 1;
            Toast.makeText((Context) null, iArr7[((i51 * i56) % 2) - 1], 1).show();
            int i57 = ((int[]) objArr2[1])[0];
            Object[] objArr45 = {new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int iNextInt = new Random().nextInt(1099208455);
            int i58 = i57 + 143013812 + (((~(845820130 | iNextInt)) | 76629525) * 104) + ((~((~iNextInt) | (-36319297))) * (-104)) + ((iNextInt | 886130359) * 104);
            int i59 = (i58 << 13) ^ i58;
            int i60 = i59 ^ (i59 >>> 17);
            i = 0;
            ((int[]) objArr45[1])[0] = i60 ^ (i60 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char threadPriority2 = (char) ((Process.getThreadPriority(i) + 20) >> 6);
            int iArgb = 876 - Color.argb(i, i, i, i);
            int i61 = 9 - (ExpandableListView.getPackedPositionForChild(i, i) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i, i) == 0L ? 0 : -1));
            byte[] bArr3 = $$a;
            Object[] objArr46 = new Object[1];
            e((short) 69, bArr3[9], bArr3[153], objArr46);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(threadPriority2, iArgb, i61, -1199417970, false, (String) objArr46[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null);
        long jLongValue4 = ((Long) Class.forName(str10).getDeclaredMethod(str11, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
            char c10 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
            int iResolveSizeAndState = 876 - View.resolveSizeAndState(0, 0, 0);
            int iMyTid2 = 10 - (Process.myTid() >> 22);
            byte[] bArr4 = $$a;
            Object[] objArr47 = new Object[1];
            e((short) 59, bArr4[7], bArr4[33], objArr47);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c10, iResolveSizeAndState, iMyTid2, 254769921, false, (String) objArr47[0], null);
        }
        if (j2 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char c11 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 876;
                int iIndexOf = 9 - TextUtils.indexOf((CharSequence) "", '0');
                byte[] bArr5 = $$a;
                Object[] objArr48 = new Object[1];
                e((short) 59, bArr5[41], bArr5[153], objArr48);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c11, fadingEdgeLength, iIndexOf, 1324201839, false, (String) objArr48[0], null);
            }
            Object[] objArr49 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr49[0])[0]}, new int[1], new int[]{((int[]) objArr49[2])[0]}, (String[]) objArr49[3]};
            int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_mobile_instruction_5).substring(3, 4).codePointAt(0) - 1817517727;
            int i62 = (((-1365681468) + (((~((-1639692) | iCodePointAt2)) | 41949920) * (-756))) + (((~iCodePointAt2) | (-1639692)) * 756)) - 2125931644;
            int i63 = (i62 << 13) ^ i62;
            int i64 = i63 ^ (i63 >>> 17);
            ((int[]) objArr3[1])[0] = i64 ^ (i64 << 5);
            str2 = str11;
        } else {
            Object[] objArr50 = {Integer.valueOf(((Integer) Class.forName(str12).getMethod(str, Object.class).invoke(null, this)).intValue()), -2125931644};
            byte[] bArr6 = $$d;
            Object[] objArr51 = new Object[1];
            f(bArr6[108], (short) 269, bArr6[143], objArr51);
            Class<?> cls3 = Class.forName((String) objArr51[0]);
            Object[] objArr52 = new Object[1];
            f((byte) (-bArr6[41]), (short) (bArr6[0] + 1), (byte) (-bArr6[8]), objArr52);
            Object[] objArr53 = (Object[]) cls3.getMethod((String) objArr52[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr50);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 876;
                int scrollBarFadeDuration3 = 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte[] bArr7 = $$a;
                Object[] objArr54 = new Object[1];
                e((short) 59, bArr7[41], bArr7[153], objArr54);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(offsetAfter, offsetAfter2, scrollBarFadeDuration3, 1324201839, false, (String) objArr54[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArr53);
            try {
                str2 = str11;
                long jLongValue5 = ((Long) Class.forName(str10).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue5);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    char c12 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int size = View.MeasureSpec.getSize(0) + 876;
                    int jumpTapTimeout = 10 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    byte[] bArr8 = $$a;
                    Object[] objArr55 = new Object[1];
                    e((short) 59, bArr8[7], bArr8[33], objArr55);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(c12, size, jumpTapTimeout, 254769921, false, (String) objArr55[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue5 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                    char cMyTid = (char) (Process.myTid() >> 22);
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 876;
                    int iBlue = Color.blue(0) + 10;
                    byte[] bArr9 = $$a;
                    Object[] objArr56 = new Object[1];
                    e((short) 69, bArr9[9], bArr9[153], objArr56);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cMyTid, keyRepeatDelay, iBlue, -1199417970, false, (String) objArr56[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf6);
                objArr3 = objArr53;
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr3[0])[0] != ((int[]) objArr3[2])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArr3[3];
            if (strArr5 != null) {
                for (String str16 : strArr5) {
                    arrayList2.add(str16);
                }
            }
            throw null;
        }
        int i65 = ((int[]) objArr3[1])[0];
        Object[] objArr57 = {new int[]{((int[]) objArr3[0])[0]}, new int[1], new int[]{((int[]) objArr3[2])[0]}, (String[]) objArr3[3]};
        int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
        int i66 = ~startUptimeMillis2;
        int i67 = ~(678954706 | i66);
        int i68 = i65 + (-1787438252) + (((-779679488) | i67) * (-712)) + (((~(startUptimeMillis2 | (-100724782))) | (~(i66 | 779679487))) * (-712)) + ((638644477 | i67) * 712);
        int i69 = (i68 << 13) ^ i68;
        int i70 = i69 ^ (i69 >>> 17);
        ((int[]) objArr57[1])[0] = i70 ^ (i70 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int i71 = 651 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int iLastIndexOf2 = 43 - TextUtils.lastIndexOf("", '0');
            short s5 = (short) 52;
            Object[] objArr58 = new Object[1];
            e(s5, (byte) s5, $$a[7], objArr58);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(edgeSlop, i71, iLastIndexOf2, -459846511, false, (String) objArr58[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null);
        long jLongValue6 = ((Long) Class.forName(str10).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
            char cRed = (char) Color.red(0);
            int iResolveSize = View.resolveSize(0, 0) + 651;
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44;
            short s6 = $$a[7];
            byte b2 = (byte) s6;
            Object[] objArr59 = new Object[1];
            e(s6, b2, (byte) (b2 | 14), objArr59);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cRed, iResolveSize, doubleTapTimeout, -873460649, false, (String) objArr59[0], null);
        }
        if (j3 == ((jLongValue6 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                int doubleTapTimeout2 = 651 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 45;
                Object[] objArr60 = new Object[1];
                e((short) 158, (byte) 37, $$a[7], objArr60);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cRgb, doubleTapTimeout2, iLastIndexOf3, -1595579076, false, (String) objArr60[0], null);
            }
            Object[] objArr61 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).get(null);
            objArr4 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i72 = ((int[]) objArr61[2])[0];
            int i73 = ((int[]) objArr61[0])[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i74 = ((1049828164 + (((~(iIdentityHashCode3 | 502169051)) | 1048576) * 305)) + (((~((~iIdentityHashCode3) | 502169051)) | 498738241) * 305)) - 1407700638;
            int i75 = (i74 << 13) ^ i74;
            int i76 = i75 ^ (i75 >>> 17);
            ((int[]) objArr4[3])[0] = i76 ^ (i76 << 5);
            i2 = 0;
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b((char) Color.green(0), 1610 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0') + 27, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr62 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).newInstance(null), -1407700638, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                    char c13 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 651;
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 45;
                    short s7 = $$a[7];
                    byte b3 = (byte) s7;
                    Object[] objArr63 = new Object[1];
                    e(s7, b3, (byte) (b3 | 14), objArr63);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c13, minimumFlingVelocity, bitsPerPixel, 2075921419, false, (String) objArr63[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 695, 98 - TextUtils.indexOf("", "")), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 63405), 794 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 83 - ExpandableListView.getPackedPositionType(0L)), Integer.TYPE, Integer.TYPE});
                }
                objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).invoke(null, objArr62);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                    char cKeyCodeFromString2 = (char) KeyEvent.keyCodeFromString("");
                    int iBlue2 = Color.blue(0) + 651;
                    int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 45;
                    Object[] objArr64 = new Object[1];
                    e((short) 158, (byte) 37, $$a[7], objArr64);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cKeyCodeFromString2, iBlue2, packedPositionChild2, -1595579076, false, (String) objArr64[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, objArr4);
                try {
                    long jLongValue7 = ((Long) Class.forName(str10).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf7 = Long.valueOf(jLongValue7);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int iIndexOf2 = 650 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 44;
                        short s8 = $$a[7];
                        byte b4 = (byte) s8;
                        Object[] objArr65 = new Object[1];
                        e(s8, b4, (byte) (b4 | 14), objArr65);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(cCombineMeasuredStates, iIndexOf2, edgeSlop2, -873460649, false, (String) objArr65[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, lValueOf7);
                    Long lValueOf8 = Long.valueOf(jLongValue7 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                        char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
                        int keyRepeatDelay2 = 651 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int iIndexOf3 = TextUtils.indexOf("", "") + 44;
                        short s9 = (short) 52;
                        Object[] objArr66 = new Object[1];
                        e(s9, (byte) s9, $$a[7], objArr66);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(trimmedLength2, keyRepeatDelay2, iIndexOf3, -459846511, false, (String) objArr66[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf8);
                    i2 = 0;
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            } catch (Throwable th4) {
                th2 = th4;
                cause2 = th2.getCause();
                if (cause2 != null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i77 = ((int[]) objArr4[i2])[i2];
        int i78 = ((int[]) objArr4[2])[i2];
        if (i78 != i77) {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr6 = (String[]) objArr4[1];
            if (strArr6 != null) {
                for (int i79 = i2; i79 < strArr6.length; i79++) {
                    arrayList3.add(strArr6[i79]);
                }
            }
            throw new RuntimeException(String.valueOf(i78));
        }
        Object[] objArr67 = new Object[4];
        int[] iArr8 = new int[1];
        objArr67[i2] = iArr8;
        int[] iArr9 = new int[1];
        objArr67[2] = iArr9;
        objArr67[3] = new int[1];
        int i80 = ((int[]) objArr4[3])[i2];
        int i81 = ((int[]) objArr4[2])[i2];
        int i82 = ((int[]) objArr4[i2])[i2];
        iArr9[i2] = i81;
        iArr8[i2] = i82;
        objArr67[1] = new String[i2];
        int iMyUid = Process.myUid();
        int i83 = i80 + (-1820577047) + (((~(667534696 | iMyUid)) | (-670965507)) * (-964)) + (((~((~iMyUid) | 667534696)) | (-671080299)) * (-964));
        int i84 = (i83 << 13) ^ i83;
        int i85 = i84 ^ (i84 >>> 17);
        ((int[]) objArr67[3])[0] = i85 ^ (i85 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2267;
            int i86 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33;
            Object[] objArr68 = new Object[1];
            e((short) 121, (byte) 52, $$a[7], objArr68);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(touchSlop, jumpTapTimeout2, i86, -887667012, false, (String) objArr68[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                int scrollDefaultDelay3 = 2267 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int scrollBarSize = 33 - (ViewConfiguration.getScrollBarSize() >> 8);
                Object[] objArr69 = new Object[1];
                e((short) 158, (byte) 37, $$a[7], objArr69);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(cIndexOf2, scrollDefaultDelay3, scrollBarSize, -654680577, false, (String) objArr69[0], null);
            }
            Object[] objArr70 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).get(null);
            objArr5 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i87 = ((int[]) objArr70[0])[0];
            int i88 = ((int[]) objArr70[3])[0];
            String[] strArr7 = (String[]) objArr70[1];
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i89 = ~iIdentityHashCode4;
            int i90 = (~((-214451514) | i89)) | 209731601;
            int i91 = ~(iIdentityHashCode4 | (-589541891));
            int i92 = (((586916906 + ((i90 | i91) * (-713))) + (i91 * 1426)) + ((~((-594261803) | i89)) * 713)) - 1642360588;
            int i93 = (i92 << 13) ^ i92;
            int i94 = i93 ^ (i93 >>> 17);
            ((int[]) objArr5[2])[0] = i94 ^ (i94 << 5);
            str9 = "android.app.ActivityThread";
            str3 = str15;
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                str3 = str15;
                baseContext2 = (Context) Class.forName(str14).getMethod(str3, new Class[0]).invoke(null, null);
            } else {
                str3 = str15;
            }
            if (baseContext2 != null) {
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            Object[] objArr71 = {baseContext2, Integer.valueOf(((Integer) Class.forName(str12).getMethod(str, Object.class).invoke(null, this)).intValue()), 0, -1642360588};
            byte[] bArr10 = $$d;
            byte b5 = bArr10[30];
            Object[] objArr72 = new Object[1];
            f(b5, (short) (b5 | 284), (byte) (-bArr10[13]), objArr72);
            Class<?> cls4 = Class.forName((String) objArr72[0]);
            byte b6 = (byte) 52;
            Object[] objArr73 = new Object[1];
            f(b6, (short) 284, (byte) (-bArr10[8]), objArr73);
            Object[] objArr74 = (Object[]) cls4.getMethod((String) objArr73[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr71);
            if (baseContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                    char c14 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                    int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 2267;
                    int iIndexOf4 = 32 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    Object[] objArr75 = new Object[1];
                    e((short) 158, (byte) 37, $$a[7], objArr75);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(c14, threadPriority3, iIndexOf4, -654680577, false, (String) objArr75[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, objArr74);
                try {
                    long jLongValue8 = ((Long) Class.forName(str10).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                        char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int i95 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2266;
                        int i96 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 32;
                        short s10 = (short) 210;
                        Object[] objArr76 = new Object[1];
                        e(s10, (byte) (s10 >>> 2), $$a[7], objArr76);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(tapTimeout2, i95, i96, -874156483, false, (String) objArr76[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue8 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                        char c15 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 2267;
                        int size2 = 33 - View.MeasureSpec.getSize(0);
                        Object[] objArr77 = new Object[1];
                        e((short) 121, b6, $$a[7], objArr77);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(c15, scrollBarSize2, size2, -887667012, false, (String) objArr77[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf10);
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            } else {
                objArr74 = objArr74;
                str9 = "android.app.ActivityThread";
            }
            objArr5 = objArr74;
        }
        int i97 = ((int[]) objArr5[3])[0];
        int i98 = ((int[]) objArr5[0])[0];
        if (i98 == i97) {
            Object[] objArr78 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i99 = ((int[]) objArr5[2])[0];
            int i100 = ((int[]) objArr5[0])[0];
            int i101 = ((int[]) objArr5[3])[0];
            String[] strArr8 = (String[]) objArr5[1];
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i102 = (-2035550891) + (((~((-103417779) | iIdentityHashCode5)) | 69337858 | (~(705295537 | iIdentityHashCode5))) * (-754));
            int i103 = ~((-69337859) | iIdentityHashCode5);
            int i104 = ~iIdentityHashCode5;
            int i105 = i99 + i102 + ((i103 | (~(774633395 | i104))) * (-754)) + ((i104 | (-103417779)) * 754);
            int i106 = (i105 << 13) ^ i105;
            int i107 = i106 ^ (i106 >>> 17);
            i3 = 0;
            ((int[]) objArr78[2])[0] = i107 ^ (i107 << 5);
        } else {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr9 = (String[]) objArr5[1];
            if (strArr9 != null) {
                int i108 = g + 17;
                f577a = i108 % 128;
                int i109 = i108 % 2;
                for (String str17 : strArr9) {
                    arrayList4.add(str17);
                }
            }
            Toast.makeText((Context) null, i98 / (((i98 - 1) * i98) % 2), 0).show();
            Object[] objArr79 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i110 = ((int[]) objArr5[2])[0];
            int i111 = ((int[]) objArr5[0])[0];
            int i112 = ((int[]) objArr5[3])[0];
            String[] strArr10 = (String[]) objArr5[1];
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i113 = ~(870219390 | iIdentityHashCode6);
            int i114 = i110 + 1178733631 + ((59931138 | i113) * (-476)) + (i113 * 952) + ((~((~iIdentityHashCode6) | 870219390)) * 476);
            int i115 = (i114 << 13) ^ i114;
            int i116 = i115 ^ (i115 >>> 17);
            i3 = 0;
            ((int[]) objArr79[2])[0] = i116 ^ (i116 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
            char deadChar = (char) (37567 - KeyEvent.getDeadChar(i3, i3));
            int tapTimeout3 = 625 - (ViewConfiguration.getTapTimeout() >> 16);
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 14;
            short s11 = $$a[7];
            byte b7 = (byte) s11;
            Object[] objArr80 = new Object[1];
            e(s11, b7, (byte) (b7 | 14), objArr80);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(deadChar, tapTimeout3, maximumDrawingCacheSize, -477065106, false, (String) objArr80[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).getLong(null);
        long jLongValue9 = ((Long) Class.forName(str10).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
            char offsetAfter3 = (char) (TextUtils.getOffsetAfter("", 0) + 37567);
            int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 625;
            int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15;
            short s12 = (short) 210;
            Object[] objArr81 = new Object[1];
            e(s12, (byte) (s12 >>> 2), $$a[7], objArr81);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(offsetAfter3, iNormalizeMetaState2, iIndexOf5, -976899241, false, (String) objArr81[0], null);
        }
        if (j4 == ((jLongValue9 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                char cIndexOf3 = (char) (37567 - TextUtils.indexOf("", "", 0));
                int iLastIndexOf4 = TextUtils.lastIndexOf("", '0') + 626;
                int doubleTapTimeout3 = 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                Object[] objArr82 = new Object[1];
                e((short) 121, (byte) 52, $$a[7], objArr82);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(cIndexOf3, iLastIndexOf4, doubleTapTimeout3, -973632554, false, (String) objArr82[0], null);
            }
            Object[] objArr83 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).get(null);
            int i117 = ((int[]) objArr83[2])[0];
            int i118 = ((int[]) objArr83[0])[0];
            String[] strArr11 = (String[]) objArr83[3];
            int[] iArr10 = {i117};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i119 = ~elapsedCpuTime;
            int i120 = ((((-1582050568) + (((~(1731262781 | i119)) | 8586946) * 184)) + ((elapsedCpuTime | 1647374388) * (-184))) + ((~((-92475340) | i119)) * 184)) - 1609906554;
            int i121 = (i120 << 13) ^ i120;
            int i122 = i121 ^ (i121 >>> 17);
            ((int[]) objArr6[1])[0] = i122 ^ (i122 << 5);
            objArr6 = new Object[]{new int[]{i118}, new int[1], iArr10, strArr11};
            i4 = 0;
            str4 = "currentApplication";
        } else {
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                baseContext3 = (Context) Class.forName(str14).getMethod(str3, new Class[0]).invoke(null, null);
            }
            if (baseContext3 != null) {
                int i123 = f577a + 23;
                g = i123 % 128;
                if (i123 % 2 != 0) {
                    boolean z = baseContext3 instanceof ContextWrapper;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                baseContext3 = ((baseContext3 instanceof ContextWrapper) && ((ContextWrapper) baseContext3).getBaseContext() == null) ? null : baseContext3.getApplicationContext();
            }
            int iIntValue = ((Integer) Class.forName(str12).getMethod(str, Object.class).invoke(null, this)).intValue();
            Object[] objArr84 = new Object[1];
            c(new int[]{173424819, 1931714302, 604484786, 1056247140, -1303132298, -1249698088, 1068089962, -1228697184, 1833134150, -505901746, 328537550, 1552805742, 2066582603, -52532532, 258923594, -1907875383, -921459274, 358778873, -1560964547, -718205970, -165866504, -502411415, 214750886, 267156274, 838506577, -1351180072, 541262982, -1574501631, -2132887551, -2078420678, 1561857108, -1881031974, -164525805, -1702518585}, Color.green(0) + 64, objArr84);
            String str18 = (String) objArr84[0];
            str4 = r8;
            Object[] objArr85 = new Object[1];
            c(new int[]{-1111187411, -228509721, 442057790, 1354961816, -2094486646, 1156092173, -334950335, -934468620, 256002249, -825346534, -1232466856, 1328396715, -121150983, -564513993, 1515568575, 129876898, -1657320555, 253242232, -1965527477, -1696008138, -435032023, -2072259121, -1778764552, 761426, -105771764, 1866666131, -91993891, 729366939, 1252307308, 922569427, 71923333, 1504285308, -1296963512, 724280237}, ((Context) Class.forName(str9).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bni_atm_instruction_7).substring(39, 40).length() + 63, objArr85);
            Object[] objArr86 = {baseContext3, new String[]{str18, (String) objArr85[0]}, Integer.valueOf(iIntValue), 17, -1609906554};
            byte[] bArr11 = $$d;
            Object[] objArr87 = new Object[1];
            f(bArr11[151], (short) 336, (byte) (-bArr11[445]), objArr87);
            Class<?> cls5 = Class.forName((String) objArr87[0]);
            byte b8 = bArr11[30];
            Object[] objArr88 = new Object[1];
            f(b8, (short) (b8 | 358), bArr11[283], objArr88);
            Object[] objArr89 = (Object[]) cls5.getMethod((String) objArr88[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr86);
            int i124 = ((int[]) objArr89[0])[0];
            int i125 = ((int[]) objArr89[2])[0];
            if (baseContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                    char maximumDrawingCacheSize2 = (char) (37567 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    int i126 = 625 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iAlpha = Color.alpha(0) + 14;
                    Object[] objArr90 = new Object[1];
                    e((short) 121, (byte) 52, $$a[7], objArr90);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(maximumDrawingCacheSize2, i126, iAlpha, -973632554, false, (String) objArr90[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, objArr89);
                try {
                    long jLongValue10 = ((Long) Class.forName(str10).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                        char cKeyCodeFromString3 = (char) (37567 - KeyEvent.keyCodeFromString(""));
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 625;
                        int trimmedLength3 = TextUtils.getTrimmedLength("") + 14;
                        short s13 = (short) 210;
                        Object[] objArr91 = new Object[1];
                        e(s13, (byte) (s13 >>> 2), $$a[7], objArr91);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(cKeyCodeFromString3, packedPositionType, trimmedLength3, -976899241, false, (String) objArr91[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue10 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                        char c16 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 37566);
                        int mirror = 673 - AndroidCharacter.getMirror('0');
                        int i127 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15;
                        short s14 = $$a[7];
                        byte b9 = (byte) s14;
                        Object[] objArr92 = new Object[1];
                        e(s14, b9, (byte) (b9 | 14), objArr92);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(c16, mirror, i127, -477065106, false, (String) objArr92[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            } else {
                objArr89 = objArr89;
            }
            objArr6 = objArr89;
            i4 = 0;
        }
        int i128 = ((int[]) objArr6[i4])[i4];
        int i129 = ((int[]) objArr6[2])[i4];
        if (i129 == i128) {
            Object[] objArr93 = new Object[4];
            int[] iArr11 = new int[1];
            objArr93[i4] = iArr11;
            objArr93[1] = new int[1];
            int[] iArr12 = new int[1];
            objArr93[2] = iArr12;
            int i130 = ((int[]) objArr6[1])[i4];
            int i131 = ((int[]) objArr6[2])[i4];
            int i132 = ((int[]) objArr6[i4])[i4];
            String[] strArr12 = (String[]) objArr6[3];
            iArr12[i4] = i131;
            iArr11[i4] = i132;
            int i133 = ((Context) Class.forName(str9).getMethod(str4, new Class[i4]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i134 = 1078273240 + ((~(i133 | 353388427)) * 216);
            int i135 = ~i133;
            int i136 = i130 + i134 + (((-1118011509) | i135) * (-216)) + (((~(i135 | 353388427)) | 1470349693) * 216);
            int i137 = (i136 << 13) ^ i136;
            int i138 = i137 ^ (i137 >>> 17);
            ((int[]) objArr93[1])[0] = i138 ^ (i138 << 5);
            objArr93[3] = strArr12;
            i5 = 0;
        } else {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr13 = (String[]) objArr6[3];
            if (strArr13 != null) {
                for (String str19 : strArr13) {
                    arrayList5.add(str19);
                }
            }
            int[] iArr13 = new int[i129];
            int i139 = i129 - 1;
            iArr13[i139] = 1;
            Toast.makeText((Context) null, iArr13[((i129 * i139) % 2) - 1], 1).show();
            int i140 = ((int[]) objArr6[1])[0];
            int i141 = ((int[]) objArr6[2])[0];
            int i142 = ((int[]) objArr6[0])[0];
            String[] strArr14 = (String[]) objArr6[3];
            int[] iArr14 = {i141};
            int i143 = ((Context) Class.forName(str9).getMethod(str4, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i144 = i140 + ((((~((-966139921) | i143)) | 176933096) * 262) - 1677984312) + (((~((~i143) | (-966139921))) | 176933096) * 262);
            int i145 = (i144 << 13) ^ i144;
            int i146 = i145 ^ (i145 >>> 17);
            i5 = 0;
            ((int[]) objArr[1])[0] = i146 ^ (i146 << 5);
            Object[] objArr94 = {new int[]{i142}, new int[1], iArr14, strArr14};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b((char) (TextUtils.getOffsetAfter("", i5) + 46400), 39 - TextUtils.indexOf((CharSequence) "", '0', i5, i5), 19 - View.combineMeasuredStates(i5, i5), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).get(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b((char) (46400 - TextUtils.indexOf("", "", 0)), ExpandableListView.getPackedPositionGroup(0L) + 40, 19 - Color.argb(0, 0, 0, 0), 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).invoke(obj2, null);
        super.onCreate(p0);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int i147 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1031;
            int trimmedLength4 = TextUtils.getTrimmedLength("") + 15;
            short s15 = (short) 210;
            Object[] objArr95 = new Object[1];
            e(s15, (byte) (s15 >>> 2), $$a[7], objArr95);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(maxKeyCode, i147, trimmedLength4, 1357589585, false, (String) objArr95[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str10).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
            char cMyTid2 = (char) (Process.myTid() >> 22);
            int iArgb2 = Color.argb(0, 0, 0, 0) + 1031;
            int iIndexOf6 = TextUtils.indexOf("", "", 0, 0) + 15;
            Object[] objArr96 = new Object[1];
            e((short) 121, (byte) 52, $$a[7], objArr96);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(cMyTid2, iArgb2, iIndexOf6, 1344079056, false, (String) objArr96[0], null);
        }
        if (j5 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                int mode2 = 1031 - View.MeasureSpec.getMode(0);
                int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 15;
                short s16 = $$a[7];
                byte b10 = (byte) s16;
                Object[] objArr97 = new Object[1];
                e(s16, b10, (byte) (b10 | 14), objArr97);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(cLastIndexOf, mode2, fadingEdgeLength2, 632103528, false, (String) objArr97[0], null);
            }
            Object[] objArr98 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).get(null);
            objArr7 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i148 = ((int[]) objArr98[3])[0];
            int i149 = ((int[]) objArr98[1])[0];
            String[] strArr15 = (String[]) objArr98[0];
            int i150 = ((Context) Class.forName(str9).getMethod(str4, new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i151 = ((((~((-134629953) | i150)) * 521) + 468716688) + (((~((~i150) | (-134629953))) | 21569553) * 521)) - 2038523868;
            int i152 = (i151 << 13) ^ i151;
            int i153 = i152 ^ (i152 >>> 17);
            ((int[]) objArr7[2])[0] = i153 ^ (i153 << 5);
        } else {
            int iIntValue2 = ((Integer) Class.forName(str12).getMethod(str, Object.class).invoke(null, this)).intValue();
            Object[] objArr99 = {633286147};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b((char) (46038 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 1133 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr100 = {Integer.valueOf(iIntValue2), 0, -2038523868, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).newInstance(objArr99), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                char windowTouchSlop3 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int fadingEdgeLength3 = 1031 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int iNormalizeMetaState3 = 15 - KeyEvent.normalizeMetaState(0);
                short s17 = (short) 210;
                Object[] objArr101 = new Object[1];
                e(s17, (byte) (s17 >>> 2), $$a[7], objArr101);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(windowTouchSlop3, fadingEdgeLength3, iNormalizeMetaState3, 1298546779, false, (String) objArr101[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 45994), TextUtils.indexOf((CharSequence) "", '0', 0) + 1118, 16 - MotionEvent.axisFromString("")), Boolean.TYPE});
            }
            objArr7 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).invoke(null, objArr100);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                char mirror2 = (char) (AndroidCharacter.getMirror('0') - '0');
                int packedPositionType2 = 1031 - ExpandableListView.getPackedPositionType(0L);
                int defaultSize = 15 - View.getDefaultSize(0, 0);
                short s18 = $$a[7];
                byte b11 = (byte) s18;
                Object[] objArr102 = new Object[1];
                e(s18, b11, (byte) (b11 | 14), objArr102);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(mirror2, packedPositionType2, defaultSize, 632103528, false, (String) objArr102[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, objArr7);
            try {
                long jLongValue12 = ((Long) Class.forName(str10).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf13 = Long.valueOf(jLongValue12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                    char defaultSize2 = (char) View.getDefaultSize(0, 0);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1031;
                    int trimmedLength5 = 15 - TextUtils.getTrimmedLength("");
                    Object[] objArr103 = new Object[1];
                    e((short) 121, (byte) 52, $$a[7], objArr103);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(defaultSize2, maximumFlingVelocity, trimmedLength5, 1344079056, false, (String) objArr103[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, lValueOf13);
                Long lValueOf14 = Long.valueOf(jLongValue12 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                    char trimmedLength6 = (char) TextUtils.getTrimmedLength("");
                    int trimmedLength7 = 1031 - TextUtils.getTrimmedLength("");
                    int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L) + 16;
                    short s19 = (short) 210;
                    Object[] objArr104 = new Object[1];
                    e(s19, (byte) (s19 >>> 2), $$a[7], objArr104);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(trimmedLength6, trimmedLength7, packedPositionChild3, 1357589585, false, (String) objArr104[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, lValueOf14);
            } catch (Exception unused7) {
                throw new RuntimeException();
            }
        }
        int i154 = ((int[]) objArr7[1])[0];
        int i155 = ((int[]) objArr7[3])[0];
        if (i155 != i154) {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr16 = (String[]) objArr7[0];
            if (strArr16 != null) {
                for (String str20 : strArr16) {
                    arrayList6.add(str20);
                }
            }
            throw new RuntimeException(String.valueOf(i155));
        }
        Object[] objArr105 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i156 = ((int[]) objArr7[2])[0];
        int i157 = ((int[]) objArr7[3])[0];
        int i158 = ((int[]) objArr7[1])[0];
        String[] strArr17 = (String[]) objArr7[0];
        int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
        int i159 = ~(532542903 | elapsedCpuTime2);
        int i160 = i156 + (-423178395) + ((151805953 | i159) * (-476)) + (i159 * 952) + ((~((~elapsedCpuTime2) | 532542903)) * 476);
        int i161 = (i160 << 13) ^ i160;
        int i162 = i161 ^ (i161 >>> 17);
        ((int[]) objArr105[2])[0] = i162 ^ (i162 << 5);
        ActivityVideoPlayerBinding activityVideoPlayerBindingInflate = ActivityVideoPlayerBinding.inflate(getLayoutInflater());
        this.d = activityVideoPlayerBindingInflate;
        if (activityVideoPlayerBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            activityVideoPlayerBindingInflate = null;
        }
        setContentView(activityVideoPlayerBindingInflate.getRoot());
        ((ShareTargetParams) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (PodcastVideoList) getIntent().getParcelableExtra("podcastVideoList");
        String stringExtra = getIntent().getStringExtra("videoId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.TuitionPaymentFragmentbindingInflater1 = stringExtra;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
            char c17 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
            int i163 = 922 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int modifierMetaStateMask = 27 - ((byte) KeyEvent.getModifierMetaStateMask());
            short s20 = $$a[7];
            byte b12 = (byte) s20;
            Object[] objArr106 = new Object[1];
            e(s20, b12, (byte) (b12 | 14), objArr106);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(c17, i163, modifierMetaStateMask, -1048449946, false, (String) objArr106[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                char scrollBarSize3 = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
                int mirror3 = AndroidCharacter.getMirror('0') + 873;
                int defaultSize3 = View.getDefaultSize(0, 0) + 28;
                Object[] objArr107 = new Object[1];
                e((short) 158, (byte) 37, $$a[7], objArr107);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(scrollBarSize3, mirror3, defaultSize3, -1142834547, false, (String) objArr107[0], null);
            }
            Object[] objArr108 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).get(null);
            objArr8 = new Object[]{new int[1], new int[]{((int[]) objArr108[1])[0]}, (Object[]) objArr108[2], new int[]{((int[]) objArr108[3])[0]}, (String[]) objArr108[4]};
            int i164 = ((Context) Class.forName(str9).getMethod(str4, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 820804304;
            int i165 = (-570274892) + ((~(1073626111 | i164)) * (-301)) + (((~((-804666077) | i164)) | (~((~i164) | 969413567))) * (-301)) + (((~(i164 | (-969413568))) | (-804666077)) * 301) + 1585912338;
            int i166 = (i165 << 13) ^ i165;
            int i167 = i166 ^ (i166 >>> 17);
            ((int[]) objArr8[0])[0] = i167 ^ (i167 << 5);
            str4 = str4;
            str5 = str3;
        } else {
            Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                str5 = str3;
                baseContext4 = (Context) Class.forName(str14).getMethod(str5, new Class[0]).invoke(null, null);
            } else {
                str5 = str3;
            }
            if (baseContext4 != null) {
                baseContext4 = ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) ? null : baseContext4.getApplicationContext();
            }
            try {
                Object[] objArr109 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str12).getMethod(str, Object.class).invoke(null, this)).intValue()), 0, 1585912338};
                byte[] bArr12 = $$d;
                Object[] objArr110 = new Object[1];
                f((byte) (-bArr12[204]), (short) 358, bArr12[279], objArr110);
                Class<?> cls6 = Class.forName((String) objArr110[0]);
                byte b13 = (byte) 52;
                Object[] objArr111 = new Object[1];
                f(b13, (short) 379, (byte) (-bArr12[8]), objArr111);
                Object[] objArr112 = (Object[]) cls6.getMethod((String) objArr111[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr109);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                    char cIndexOf4 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 31534);
                    int packedPositionChild4 = 920 - ExpandableListView.getPackedPositionChild(0L);
                    int iIndexOf7 = 27 - TextUtils.indexOf((CharSequence) "", '0');
                    Object[] objArr113 = new Object[1];
                    e((short) 158, (byte) 37, $$a[7], objArr113);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cIndexOf4, packedPositionChild4, iIndexOf7, -1142834547, false, (String) objArr113[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, objArr112);
                try {
                    long jLongValue13 = ((Long) Class.forName(str10).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf15 = Long.valueOf(jLongValue13);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                        char c18 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31533);
                        int i168 = 922 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int windowTouchSlop4 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 28;
                        Object[] objArr114 = new Object[1];
                        e((short) 121, b13, $$a[7], objArr114);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(c18, i168, windowTouchSlop4, -778300370, false, (String) objArr114[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, lValueOf15);
                    Long lValueOf16 = Long.valueOf(jLongValue13 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                        char cMakeMeasureSpec = (char) (31533 - View.MeasureSpec.makeMeasureSpec(0, 0));
                        int i169 = 922 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int iRed = 28 - Color.red(0);
                        short s21 = $$a[7];
                        byte b14 = (byte) s21;
                        Object[] objArr115 = new Object[1];
                        e(s21, b14, (byte) (b14 | 14), objArr115);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(cMakeMeasureSpec, i169, iRed, -1048449946, false, (String) objArr115[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, lValueOf16);
                    objArr8 = objArr112;
                } catch (Exception unused8) {
                    throw new RuntimeException();
                }
            } catch (Throwable th5) {
                th = th5;
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i170 = ((int[]) objArr8[1])[0];
        int i171 = ((int[]) objArr8[3])[0];
        if (i171 != i170) {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr18 = (String[]) objArr8[4];
            if (strArr18 != null) {
                int i172 = 0;
                while (i172 < strArr18.length) {
                    int i173 = g + 67;
                    f577a = i173 % 128;
                    if (i173 % 2 == 0) {
                        arrayList7.add(strArr18[i172]);
                        i172 += 92;
                    } else {
                        arrayList7.add(strArr18[i172]);
                        i172++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i171));
        }
        int i174 = ((int[]) objArr8[0])[0];
        Object[] objArr116 = {new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
        int iIdentityHashCode7 = System.identityHashCode(this);
        int i175 = ~iIdentityHashCode7;
        int i176 = i174 + 1446910645 + (((~((-729463523) | i175)) | (~((-1044616122) | iIdentityHashCode7))) * 210) + (((~(iIdentityHashCode7 | (-20457539))) | (~(i175 | (-335610138)))) * 210);
        int i177 = (i176 << 13) ^ i176;
        int i178 = i177 ^ (i177 >>> 17);
        ((int[]) objArr116[0])[0] = i178 ^ (i178 << 5);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getIntent().getBooleanExtra("isDeepLink", false);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            int i179 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 876;
            int scrollDefaultDelay4 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10;
            short s22 = $$a[7];
            byte b15 = (byte) s22;
            Object[] objArr117 = new Object[1];
            e(s22, b15, (byte) (b15 | 14), objArr117);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(offsetBefore, i179, scrollDefaultDelay4, 252381699, false, (String) objArr117[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).getLong(null);
        long jLongValue14 = ((Long) Class.forName(str10).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
            char c19 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
            int iIndexOf8 = 876 - TextUtils.indexOf("", "", 0, 0);
            int mirror4 = AndroidCharacter.getMirror('0') - '&';
            short s23 = (short) 52;
            Object[] objArr118 = new Object[1];
            e(s23, (byte) s23, $$a[7], objArr118);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(c19, iIndexOf8, mirror4, 2009631821, false, (String) objArr118[0], null);
        }
        if (j6 == ((jLongValue14 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                char c20 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int edgeSlop3 = 876 - (ViewConfiguration.getEdgeSlop() >> 16);
                int i180 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10;
                byte[] bArr13 = $$a;
                short s24 = bArr13[7];
                Object[] objArr119 = new Object[1];
                e(s24, (byte) s24, bArr13[54], objArr119);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(c20, edgeSlop3, i180, 256017550, false, (String) objArr119[0], null);
            }
            Object[] objArr120 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).get(null);
            objArr9 = new Object[]{new int[]{((int[]) objArr120[0])[0]}, new int[1], new int[]{((int[]) objArr120[2])[0]}, (String[]) objArr120[3]};
            int i181 = ~(((int) Process.getStartUptimeMillis()) | 473401370);
            int i182 = ((((-99088992) | i181) * (-658)) - 611904044) + ((i181 | (-502790752)) * 658) + 1456898790;
            int i183 = (i182 << 13) ^ i182;
            int i184 = i183 ^ (i183 >>> 17);
            ((int[]) objArr9[1])[0] = i184 ^ (i184 << 5);
        } else {
            Context baseContext5 = getBaseContext();
            if (baseContext5 == null) {
                baseContext5 = (Context) Class.forName(str14).getMethod(str5, new Class[0]).invoke(null, null);
            }
            if (baseContext5 != null) {
                baseContext5 = ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) ? null : baseContext5.getApplicationContext();
            }
            Object[] objArr121 = {baseContext5, Integer.valueOf(((Integer) Class.forName(str12).getMethod(str, Object.class).invoke(null, this)).intValue()), 1456898790};
            byte[] bArr14 = $$d;
            Object[] objArr122 = new Object[1];
            f((byte) (-bArr14[36]), (short) 431, bArr14[143], objArr122);
            Class<?> cls7 = Class.forName((String) objArr122[0]);
            Object[] objArr123 = new Object[1];
            f((byte) 52, (short) 284, (byte) (-bArr14[8]), objArr123);
            Object[] objArr124 = (Object[]) cls7.getMethod((String) objArr123[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr121);
            if (baseContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                    char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int longPressTimeout2 = 876 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int mirror5 = AndroidCharacter.getMirror('0') - '&';
                    byte[] bArr15 = $$a;
                    short s25 = bArr15[7];
                    Object[] objArr125 = new Object[1];
                    e(s25, (byte) s25, bArr15[54], objArr125);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(minimumFlingVelocity2, longPressTimeout2, mirror5, 256017550, false, (String) objArr125[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, objArr124);
                try {
                    long jLongValue15 = ((Long) Class.forName(str10).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue15);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                        char packedPositionChild5 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                        int size3 = 876 - View.MeasureSpec.getSize(0);
                        int iIndexOf9 = 10 - TextUtils.indexOf("", "", 0, 0);
                        short s26 = (short) 52;
                        Object[] objArr126 = new Object[1];
                        e(s26, (byte) s26, $$a[7], objArr126);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(packedPositionChild5, size3, iIndexOf9, 2009631821, false, (String) objArr126[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue15 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                        char doubleTapTimeout4 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int iIndexOf10 = TextUtils.indexOf("", "", 0) + 876;
                        int minimumFlingVelocity3 = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        short s27 = $$a[7];
                        byte b16 = (byte) s27;
                        Object[] objArr127 = new Object[1];
                        e(s27, b16, (byte) (b16 | 14), objArr127);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(doubleTapTimeout4, iIndexOf10, minimumFlingVelocity3, 252381699, false, (String) objArr127[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            } else {
                objArr124 = objArr124;
            }
            objArr9 = objArr124;
        }
        int i185 = ((int[]) objArr9[2])[0];
        int i186 = ((int[]) objArr9[0])[0];
        if (i186 == i185) {
            int i187 = ((int[]) objArr9[1])[0];
            objArr10 = new Object[]{new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
            int i188 = ~Process.myUid();
            int i189 = i187 + (-500156700) + (((~((-1011897043) | i188)) | 971586813) * (-933)) + (((~(i188 | 971586813)) | (-1039761152)) * 933) + 227409921;
            int i190 = (i189 << 13) ^ i189;
            int i191 = i190 ^ (i190 >>> 17);
            ((int[]) objArr10[1])[0] = i191 ^ (i191 << 5);
            c2 = 0;
            str6 = str4;
            c = 1;
        } else {
            Toast.makeText((Context) null, i186 / (((i186 - 1) * i186) % 2), 0).show();
            int i192 = ((int[]) objArr9[1])[0];
            objArr10 = new Object[]{new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
            str6 = str4;
            int i193 = ((Context) Class.forName(str9).getMethod(str6, new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
            int i194 = i192 + (-110414582) + (((~((~i193) | 417846357)) | 100674176) * 529) + (((~(i193 | 417846357)) | 377536128) * 529);
            int i195 = i194 ^ (i194 << 13);
            int i196 = i195 ^ (i195 >>> 17);
            c = 1;
            c2 = 0;
            ((int[]) objArr10[1])[0] = i196 ^ (i196 << 5);
        }
        ((Field) getDelay.TuitionPaymentFragmentspecialinlinedviewModeldefault1[c2]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{783886506, 655528103, 1553654292}, ((int[]) objArr10[c])[c2], Integer.MAX_VALUE) + 253422646);
        ActivityVideoPlayerBinding activityVideoPlayerBinding2 = this.d;
        if (activityVideoPlayerBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            activityVideoPlayerBinding2 = null;
        }
        activityVideoPlayerBinding2.layoutToolbarCenter.tvToolbarTitle.setText(getString(R.string.menu_podcast));
        PodcastVideoList podcastVideoList2 = ((ShareTargetParams) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (podcastVideoList2 != null) {
            ActivityVideoPlayerBinding activityVideoPlayerBinding3 = this.d;
            if (activityVideoPlayerBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityVideoPlayerBinding3 = null;
            }
            activityVideoPlayerBinding3.tvTitleVideo.setText(podcastVideoList2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            ActivityVideoPlayerBinding activityVideoPlayerBinding4 = this.d;
            if (activityVideoPlayerBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityVideoPlayerBinding4 = null;
            }
            activityVideoPlayerBinding4.tvDescVideo.setText(podcastVideoList2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
        String type = PodcastTypeLog.VIEW.getType();
        PodcastVideoList podcastVideoList3 = ((ShareTargetParams) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (podcastVideoList3 != null) {
            int i197 = g + 101;
            f577a = i197 % 128;
            if (i197 % 2 == 0) {
                String str21 = podcastVideoList3.b;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            str7 = podcastVideoList3.b;
            if (str7 == null) {
                str7 = this.TuitionPaymentFragmentbindingInflater1;
            }
        } else {
            str7 = this.TuitionPaymentFragmentbindingInflater1;
        }
        ShareTargetParams shareTargetParams = (ShareTargetParams) this.b.getValue();
        VideoPlayerActivity videoPlayerActivity = this;
        String string = Settings.Secure.getString(videoPlayerActivity.getContentResolver(), "android_id");
        Intrinsics.checkExpressionValueIsNotNull(string, "");
        shareTargetParams.TuitionPaymentFragmentbindingInflater1(type, string, str7);
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 || (podcastVideoList = ((ShareTargetParams) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null || (str8 = podcastVideoList.b) == null) {
            str8 = this.TuitionPaymentFragmentbindingInflater1;
        }
        if (str8.length() == 0) {
            Toast.makeText(videoPlayerActivity, "Video ID is empty", 0).show();
        } else {
            ActivityVideoPlayerBinding activityVideoPlayerBinding5 = this.d;
            if (activityVideoPlayerBinding5 == null) {
                int i198 = f577a + 59;
                g = i198 % 128;
                if (i198 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityVideoPlayerBinding5 = null;
            }
            WebView webView = activityVideoPlayerBinding5.videoPlayer;
            Intrinsics.checkNotNullExpressionValue(webView, "");
            webView.setVisibility(0);
            webView.setBackgroundColor(0);
            webView.setWebViewClient(new TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            webView.setWebChromeClient(new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            WebSettings settings = webView.getSettings();
            Intrinsics.checkNotNullExpressionValue(settings, "");
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setSupportZoom(false);
            settings.setBuiltInZoomControls(false);
            settings.setDisplayZoomControls(false);
            settings.setCacheMode(-1);
            settings.setAllowFileAccess(true);
            settings.setAllowContentAccess(true);
            settings.setMixedContentMode(0);
            settings.setUserAgentString("Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.91 Mobile Safari/537.36");
            StringBuilder sb = new StringBuilder("\n            <!DOCTYPE html>\n            <html>\n            <head>\n                <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n                <meta http-equiv=\"Content-Security-Policy\" content=\"upgrade-insecure-requests\">\n                <style>\n                    * {\n                        margin: 0;\n                        padding: 0;\n                        box-sizing: border-box;\n                    }\n                    html, body {\n                        width: 100%;\n                        height: 100%;\n                        background-color: #000;\n                        overflow: hidden;\n                    }\n                    .video-container {\n                        position: relative;\n                        width: 100%;\n                        height: 100%;\n                        overflow: hidden;\n                    }\n                    iframe {\n                        position: absolute;\n                        top: 0;\n                        left: 0;\n                        width: 100%;\n                        height: 100%;\n                        border: none;\n                    }\n                </style>\n            </head>\n            <body>\n                <div class=\"video-container\">\n                    <iframe \n                        id=\"ytplayer\"\n                        type=\"text/html\"\n                        src=\"https://www.youtube.com/embed/");
            sb.append(str8);
            sb.append("?autoplay=1&playsinline=1&rel=0&modestbranding=1&controls=1&showinfo=0&fs=1&iv_load_policy=3&enablejsapi=1&origin=https://bpjsketenagakerjaan.go.id&widget_referrer=https://bpjsketenagakerjaan.go.id\"\n                        allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\"\n                        allowfullscreen\n                        frameborder=\"0\"\n                        referrerpolicy=\"strict-origin-when-cross-origin\">\n                    </iframe>\n                </div>\n                <script>\n                    // Prevent any interaction issues\n                    document.addEventListener('DOMContentLoaded', function() {\n                        var iframe = document.getElementById('ytplayer');\n                        iframe.contentWindow.focus();\n                    });\n                </script>\n            </body>\n            </html>\n        ");
            String strTrimIndent = StringsKt.trimIndent(sb.toString());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("Referer", "https://bpjsketenagakerjaan.go.id/");
            linkedHashMap.put("Origin", "https://bpjsketenagakerjaan.go.id");
            webView.loadDataWithBaseURL("https://bpjsketenagakerjaan.go.id/", strTrimIndent, "text/html", Hex.DEFAULT_CHARSET_NAME, null);
        }
        ((ShareTargetParams) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.observe(this, new TuitionPaymentFragmentbindingInflater1(new Function1() { // from class: getDeviceStateCallback
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                return VideoPlayerActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj4);
            }
        }));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 29945);
            int i199 = 1756 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int keyRepeatDelay3 = 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            Object[] objArr128 = new Object[1];
            e((short) 158, (byte) 37, $$a[7], objArr128);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(cAxisFromString, i199, keyRepeatDelay3, 986134021, false, (String) objArr128[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).getLong(null) != -1) {
            int i200 = g + 11;
            f577a = i200 % 128;
            int i201 = i200 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 29944);
                int i202 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1755;
                int scrollDefaultDelay5 = 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                Object[] objArr129 = new Object[1];
                e((short) 121, (byte) 52, $$a[7], objArr129);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(cNormalizeMetaState, i202, scrollDefaultDelay5, 1599039318, false, (String) objArr129[0], null);
            }
            Object[] objArr130 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).get(null);
            objArr11 = new Object[]{new int[]{((int[]) objArr130[0])[0]}, new int[]{((int[]) objArr130[1])[0]}, (Object[]) objArr130[2], new int[1], (String[]) objArr130[4]};
            int iMyUid2 = Process.myUid();
            int i203 = ~iMyUid2;
            int i204 = ((((-1596857560) + (((~(729489338 | i203)) | (~((-56103435) | iMyUid2))) * (-831))) + ((~(998195198 | iMyUid2)) * (-1662))) + (((~(iMyUid2 | (-729489339))) | ((~(i203 | (-942091765))) | (~(942091764 | iMyUid2)))) * 831)) - 1874810925;
            int i205 = (i204 << 13) ^ i204;
            int i206 = i205 ^ (i205 >>> 17);
            ((int[]) objArr11[3])[0] = i206 ^ (i206 << 5);
        } else {
            int iIntValue3 = ((Integer) Class.forName(str12).getMethod(str, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr131 = {-395878025};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b((char) (42049 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 1726 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = DecorContentParent.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue3, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).newInstance(objArr131), -1874810925);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                    char packedPositionGroup = (char) (29944 - ExpandableListView.getPackedPositionGroup(0L));
                    int gidForName2 = 1754 - Process.getGidForName("");
                    int windowTouchSlop5 = 23 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    Object[] objArr132 = new Object[1];
                    e((short) 121, (byte) 52, $$a[7], objArr132);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(packedPositionGroup, gidForName2, windowTouchSlop5, 1599039318, false, (String) objArr132[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    long jLongValue16 = ((Long) Class.forName(str10).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue16);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                        char size4 = (char) (View.MeasureSpec.getSize(0) + 29944);
                        int windowTouchSlop6 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1755;
                        int doubleTapTimeout5 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23;
                        short s28 = (short) 52;
                        Object[] objArr133 = new Object[1];
                        e(s28, (byte) s28, $$a[7], objArr133);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(size4, windowTouchSlop6, doubleTapTimeout5, 1596667560, false, (String) objArr133[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                        char scrollDefaultDelay6 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29944);
                        int offsetBefore2 = 1755 - TextUtils.getOffsetBefore("", 0);
                        int scrollDefaultDelay7 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23;
                        Object[] objArr134 = new Object[1];
                        e((short) 158, (byte) 37, $$a[7], objArr134);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(scrollDefaultDelay6, offsetBefore2, scrollDefaultDelay7, 986134021, false, (String) objArr134[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, lValueOf20);
                    objArr11 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            } catch (Throwable th6) {
                th2 = th6;
                cause2 = th2.getCause();
                if (cause2 != null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i207 = ((int[]) objArr11[1])[0];
        int i208 = ((int[]) objArr11[0])[0];
        if (i208 == i207) {
            int i209 = ((int[]) objArr11[3])[0];
            objArr12 = new Object[]{new int[]{((int[]) objArr11[0])[0]}, new int[]{((int[]) objArr11[1])[0]}, (Object[]) objArr11[2], new int[1], (String[]) objArr11[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i210 = (-899585511) + (((~(166748551 | iUptimeMillis)) | 45853874) * 672);
            int i211 = ~iUptimeMillis;
            int i212 = i209 + i210 + (((~(iUptimeMillis | 45853874)) | (~((-166748552) | i211))) * (-672)) + (((~((-45853875) | i211)) | 34311216) * 672);
            int i213 = (i212 << 13) ^ i212;
            int i214 = i213 ^ (i213 >>> 17);
            ((int[]) objArr12[3])[0] = i214 ^ (i214 << 5);
            c4 = 0;
            c3 = 3;
        } else {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr19 = (String[]) objArr11[4];
            if (strArr19 != null) {
                for (String str22 : strArr19) {
                    arrayList8.add(str22);
                }
            }
            Toast.makeText((Context) null, i208 / (((i208 - 1) * i208) % 2), 0).show();
            int i215 = ((int[]) objArr11[3])[0];
            objArr12 = new Object[]{new int[]{((int[]) objArr11[0])[0]}, new int[]{((int[]) objArr11[1])[0]}, (Object[]) objArr11[2], new int[1], (String[]) objArr11[4]};
            int i216 = ((Context) Class.forName(str9).getMethod(str6, new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            int i217 = ~i216;
            int i218 = ~((-38923817) | i217);
            int i219 = ~((-173678610) | i216);
            int i220 = i215 + (-1774707662) + ((i218 | i219) * 1150) + (((~(173678609 | i217)) | i219) * (-575)) + (((~(i216 | (-38923817))) | (~(i217 | 38923816))) * 575);
            int i221 = (i220 << 13) ^ i220;
            int i222 = i221 ^ (i221 >>> 17);
            c3 = 3;
            c4 = 0;
            ((int[]) objArr12[3])[0] = i222 ^ (i222 << 5);
        }
        ((Field) HandlerScheduledExecutorService2.TuitionPaymentFragmentspecialinlinedviewModeldefault2[c4]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{505586747, 1991593638, 394788947}, ((int[]) objArr12[c3])[c4], Integer.MAX_VALUE) + 549444648);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
            char doubleTapTimeout6 = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 53893);
            int iRed2 = 1320 - Color.red(0);
            int mirror6 = AndroidCharacter.getMirror('0') - '\f';
            short s29 = $$a[7];
            byte b17 = (byte) s29;
            Object[] objArr135 = new Object[1];
            e(s29, b17, (byte) (b17 | 14), objArr135);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(doubleTapTimeout6, iRed2, mirror6, -1433084963, false, (String) objArr135[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char cNormalizeMetaState2 = (char) (53893 - KeyEvent.normalizeMetaState(0));
                int iBlue3 = 1320 - Color.blue(0);
                int iIndexOf11 = TextUtils.indexOf("", "", 0) + 36;
                Object[] objArr136 = new Object[1];
                e((short) 121, (byte) 52, $$a[7], objArr136);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(cNormalizeMetaState2, iBlue3, iIndexOf11, -1920778747, false, (String) objArr136[0], null);
            }
            Object[] objArr137 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).get(null);
            objArr13 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i223 = ((int[]) objArr137[0])[0];
            int i224 = ((int[]) objArr137[3])[0];
            String[] strArr20 = (String[]) objArr137[2];
            int iCodePointAt3 = ((Context) Class.forName(str9).getMethod(str6, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_email_invalid_optional).substring(30, 31).codePointAt(0) - 2141567526;
            int i225 = 1410641520 + (((-1212784335) | iCodePointAt3) * 376) + (((~((~iCodePointAt3) | 213668889)) | (-1291706080)) * (-376)) + (((~(iCodePointAt3 | (-213668890))) | 1156958935) * 376) + 1736741978;
            int i226 = (i225 << 13) ^ i225;
            int i227 = i226 ^ (i226 >>> 17);
            ((int[]) objArr13[1])[0] = i227 ^ (i227 << 5);
        } else {
            Context baseContext6 = getBaseContext();
            if (baseContext6 == null) {
                int i228 = f577a + 7;
                g = i228 % 128;
                int i229 = i228 % 2;
                baseContext6 = (Context) Class.forName(str14).getMethod(str5, new Class[0]).invoke(null, null);
            }
            if (baseContext6 != null) {
                baseContext6 = ((baseContext6 instanceof ContextWrapper) && ((ContextWrapper) baseContext6).getBaseContext() == null) ? null : baseContext6.getApplicationContext();
            }
            int iIntValue4 = ((Integer) Class.forName(str12).getMethod(str, Object.class).invoke(null, this)).intValue();
            Object[] objArr138 = {1767743278};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b((char) (Color.green(0) + 47977), 1300 - TextUtils.getOffsetAfter("", 0), 19 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr139 = {baseContext6, "com.bpjstku", 1736741978, Integer.valueOf(iIntValue4), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).newInstance(objArr138), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                char packedPositionType3 = (char) (ExpandableListView.getPackedPositionType(0L) + 53893);
                int offsetAfter4 = 1320 - TextUtils.getOffsetAfter("", 0);
                int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 36;
                Object[] objArr140 = new Object[1];
                e((short) 121, (byte) 52, $$a[7], objArr140);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(packedPositionType3, offsetAfter4, iResolveOpacity2, 819724799, false, (String) objArr140[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 1394 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 74), Boolean.TYPE});
            }
            Object[] objArr141 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).invoke(null, objArr139);
            if (baseContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                    char cRed2 = (char) (Color.red(0) + 53893);
                    int iCombineMeasuredStates2 = 1320 - View.combineMeasuredStates(0, 0);
                    int scrollBarSize4 = 36 - (ViewConfiguration.getScrollBarSize() >> 8);
                    Object[] objArr142 = new Object[1];
                    e((short) 121, (byte) 52, $$a[7], objArr142);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cRed2, iCombineMeasuredStates2, scrollBarSize4, -1920778747, false, (String) objArr142[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, objArr141);
                try {
                    long jLongValue17 = ((Long) Class.forName(str10).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                        char mirror7 = (char) (AndroidCharacter.getMirror('0') + 53845);
                        int scrollBarFadeDuration4 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1320;
                        int iResolveSize2 = View.resolveSize(0, 0) + 36;
                        Object[] objArr143 = new Object[1];
                        e((short) 158, (byte) 37, $$a[7], objArr143);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(mirror7, scrollBarFadeDuration4, iResolveSize2, -1273706634, false, (String) objArr143[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                        char minimumFlingVelocity4 = (char) (53893 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int tapTimeout4 = (ViewConfiguration.getTapTimeout() >> 16) + 1320;
                        int iAxisFromString2 = MotionEvent.axisFromString("") + 37;
                        short s30 = $$a[7];
                        byte b18 = (byte) s30;
                        Object[] objArr144 = new Object[1];
                        e(s30, b18, (byte) (b18 | 14), objArr144);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(minimumFlingVelocity4, tapTimeout4, iAxisFromString2, -1433084963, false, (String) objArr144[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).set(null, lValueOf22);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
            objArr13 = objArr141;
        }
        int i230 = ((int[]) objArr13[3])[0];
        int i231 = ((int[]) objArr13[0])[0];
        if (i231 == i230) {
            int i232 = f577a + 97;
            g = i232 % 128;
            int i233 = i232 % 2;
            objArr14 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i234 = ((int[]) objArr13[1])[0];
            int i235 = ((int[]) objArr13[0])[0];
            int i236 = ((int[]) objArr13[3])[0];
            String[] strArr21 = (String[]) objArr13[2];
            int iCodePointAt4 = ((Context) Class.forName(str9).getMethod(str6, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_unsuccessful).substring(0, 1).codePointAt(0) - 1179812083;
            int i237 = ~iCodePointAt4;
            int i238 = (~((-567895385) | i237)) | 567812376;
            int i239 = ~(iCodePointAt4 | 802815448);
            int i240 = i234 + (-1350368256) + ((i238 | i239) * (-502)) + ((i239 | (~(i237 | (-83009)))) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i241 = (i240 << 13) ^ i240;
            int i242 = i241 ^ (i241 >>> 17);
            c5 = 1;
            c6 = 0;
            ((int[]) objArr14[1])[0] = i242 ^ (i242 << 5);
        } else {
            int[] iArr15 = new int[i231];
            int i243 = i231 - 1;
            iArr15[i243] = 1;
            Toast.makeText((Context) null, iArr15[((i231 * i243) % 2) - 1], 1).show();
            objArr14 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i244 = ((int[]) objArr13[1])[0];
            int i245 = ((int[]) objArr13[0])[0];
            int i246 = ((int[]) objArr13[3])[0];
            String[] strArr22 = (String[]) objArr13[2];
            int i247 = ((Context) Class.forName(str9).getMethod(str6, new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i248 = ~i247;
            int i249 = i244 + 1888766556 + ((i247 | 903113850) * (-859)) + (((~(i247 | (-299114611))) | (~(903113850 | i248))) * 859) + (((~((-467513975) | i248)) | 168399364) * 859);
            int i250 = (i249 << 13) ^ i249;
            int i251 = i250 ^ (i250 >>> 17);
            c5 = 1;
            c6 = 0;
            ((int[]) objArr14[1])[0] = i251 ^ (i251 << 5);
        }
        ((Field) scheduleAtFixedRate.TuitionPaymentFragmentspecialinlinedviewModeldefault3[c6]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{840936834, 1200744909, 1533727383}, ((int[]) objArr14[c5])[c6], Integer.MAX_VALUE) + 1298601839);
        ActivityVideoPlayerBinding activityVideoPlayerBinding6 = this.d;
        if (activityVideoPlayerBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            activityVideoPlayerBinding6 = null;
        }
        activityVideoPlayerBinding6.layoutToolbarCenter.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: getSessionCaptureCallback
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPlayerActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
        ActivityVideoPlayerBinding activityVideoPlayerBinding7 = this.d;
        if (activityVideoPlayerBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            activityVideoPlayerBinding7 = null;
        }
        activityVideoPlayerBinding7.fab.setOnClickListener(new View.OnClickListener() { // from class: getMutableConfig
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPlayerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, view);
            }
        });
        ActivityVideoPlayerBinding activityVideoPlayerBinding8 = this.d;
        if (activityVideoPlayerBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            activityVideoPlayerBinding = null;
        } else {
            activityVideoPlayerBinding = activityVideoPlayerBinding8;
        }
        activityVideoPlayerBinding.btnFullscreen.setOnClickListener(new View.OnClickListener() { // from class: insertAllOptions
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPlayerActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        ActivityVideoPlayerBinding activityVideoPlayerBinding;
        int i = 2 % 2;
        int i2 = f577a + 9;
        g = i2 % 128;
        ActivityVideoPlayerBinding activityVideoPlayerBinding2 = null;
        if (i2 % 2 != 0) {
            ((ShareTargetParams) this.b.getValue()).b = false;
            setRequestedOrientation(1);
            activityVideoPlayerBinding = this.d;
            if (activityVideoPlayerBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityVideoPlayerBinding = null;
            }
        } else {
            ((ShareTargetParams) this.b.getValue()).b = true;
            setRequestedOrientation(0);
            activityVideoPlayerBinding = this.d;
            if (activityVideoPlayerBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityVideoPlayerBinding = null;
            }
        }
        activityVideoPlayerBinding.fab.setVisibility(8);
        ActivityVideoPlayerBinding activityVideoPlayerBinding3 = this.d;
        if (activityVideoPlayerBinding3 == null) {
            int i3 = f577a + 55;
            g = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i4 = 66 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            activityVideoPlayerBinding3 = null;
        }
        activityVideoPlayerBinding3.btnFullscreen.setVisibility(8);
        ActivityVideoPlayerBinding activityVideoPlayerBinding4 = this.d;
        if (activityVideoPlayerBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            activityVideoPlayerBinding4 = null;
        }
        activityVideoPlayerBinding4.layoutToolbarCenter.toolbar.setVisibility(8);
        ActivityVideoPlayerBinding activityVideoPlayerBinding5 = this.d;
        if (activityVideoPlayerBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            activityVideoPlayerBinding5 = null;
        }
        activityVideoPlayerBinding5.llVideo.setVisibility(8);
        ActivityVideoPlayerBinding activityVideoPlayerBinding6 = this.d;
        if (activityVideoPlayerBinding6 == null) {
            int i5 = g + 53;
            f577a = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = 98 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            activityVideoPlayerBinding6 = null;
        }
        ViewGroup.LayoutParams layoutParams = activityVideoPlayerBinding6.videoPlayer.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        ((ViewGroup.LayoutParams) layoutParams2).height = -1;
        layoutParams2.removeRule(3);
        ActivityVideoPlayerBinding activityVideoPlayerBinding7 = this.d;
        if (activityVideoPlayerBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            activityVideoPlayerBinding2 = activityVideoPlayerBinding7;
        }
        activityVideoPlayerBinding2.videoPlayer.setLayoutParams(layoutParams2);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(false);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    private final void b() {
        int i = 2 % 2;
        int i2 = f577a + 121;
        g = i2 % 128;
        int i3 = i2 % 2;
        ((ShareTargetParams) this.b.getValue()).b = false;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            startActivity(new Intent(this, (Class<?>) VideoListActivity.class));
            finish();
        } else {
            setRequestedOrientation(1);
            ActivityVideoPlayerBinding activityVideoPlayerBinding = this.d;
            ActivityVideoPlayerBinding activityVideoPlayerBinding2 = null;
            if (activityVideoPlayerBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityVideoPlayerBinding = null;
            }
            activityVideoPlayerBinding.fab.setVisibility(0);
            ActivityVideoPlayerBinding activityVideoPlayerBinding3 = this.d;
            if (activityVideoPlayerBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityVideoPlayerBinding3 = null;
            }
            activityVideoPlayerBinding3.btnFullscreen.setVisibility(0);
            ActivityVideoPlayerBinding activityVideoPlayerBinding4 = this.d;
            if (activityVideoPlayerBinding4 == null) {
                int i4 = f577a + 29;
                g = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityVideoPlayerBinding4 = null;
            }
            activityVideoPlayerBinding4.layoutToolbarCenter.toolbar.setVisibility(0);
            ActivityVideoPlayerBinding activityVideoPlayerBinding5 = this.d;
            if (activityVideoPlayerBinding5 == null) {
                int i6 = f577a + 61;
                g = i6 % 128;
                int i7 = i6 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                activityVideoPlayerBinding5 = null;
            }
            activityVideoPlayerBinding5.llVideo.setVisibility(0);
            ActivityVideoPlayerBinding activityVideoPlayerBinding6 = this.d;
            if (activityVideoPlayerBinding6 == null) {
                int i8 = g + 41;
                f577a = i8 % 128;
                if (i8 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i9 = 49 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                activityVideoPlayerBinding6 = null;
            }
            ViewGroup.LayoutParams layoutParams = activityVideoPlayerBinding6.videoPlayer.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            ((ViewGroup.LayoutParams) layoutParams2).height = (int) (getResources().getDisplayMetrics().density * 250.0f);
            layoutParams2.addRule(3, R.id.layout_toolbar_center);
            ActivityVideoPlayerBinding activityVideoPlayerBinding7 = this.d;
            if (activityVideoPlayerBinding7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                activityVideoPlayerBinding2 = activityVideoPlayerBinding7;
            }
            activityVideoPlayerBinding2.videoPlayer.setLayoutParams(layoutParams2);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
        TuitionPaymentFragmentbindingInflater1();
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean p0) {
        int i = 2 % 2;
        Object obj = null;
        if (Build.VERSION.SDK_INT < 30) {
            if (!p0) {
                getWindow().getDecorView().setSystemUiVisibility(4);
                return;
            }
            getWindow().getDecorView().setSystemUiVisibility(0);
            int i2 = f577a + 41;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i3 = g + 45;
        f577a = i3 % 128;
        int i4 = i3 % 2;
        WindowInsetsController insetsController = getWindow().getInsetsController();
        if (insetsController != null) {
            insetsController.setSystemBarsBehavior(2);
        }
        if (p0) {
            if (insetsController != null) {
                int i5 = f577a + 25;
                g = i5 % 128;
                int i6 = i5 % 2;
                insetsController.show(WindowInsets.Type.statusBars());
                return;
            }
            return;
        }
        if (insetsController != null) {
            int i7 = g + 115;
            f577a = i7 % 128;
            if (i7 % 2 != 0) {
                insetsController.hide(WindowInsets.Type.statusBars());
            } else {
                insetsController.hide(WindowInsets.Type.statusBars());
                obj.hashCode();
                throw null;
            }
        }
    }

    private final void TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = f577a + 89;
        g = i2 % 128;
        if (i2 % 2 == 0 ? Build.VERSION.SDK_INT >= 30 : Build.VERSION.SDK_INT >= 92) {
            getWindow().setDecorFitsSystemWindows(true);
            WindowInsetsController insetsController = getWindow().getInsetsController();
            if (insetsController != null) {
                int i3 = f577a + 11;
                g = i3 % 128;
                if (i3 % 2 != 0) {
                    insetsController.setSystemBarsBehavior(2);
                } else {
                    insetsController.setSystemBarsBehavior(2);
                }
            }
            WindowInsetsController insetsController2 = getWindow().getInsetsController();
            if (insetsController2 != null) {
                insetsController2.show(WindowInsets.Type.navigationBars());
                return;
            }
            return;
        }
        getWindow().getDecorView().setSystemUiVisibility(1792);
        int i4 = g + 73;
        f577a = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT < 30) {
            getWindow().getDecorView().setSystemUiVisibility(3846);
            return;
        }
        int i2 = g + 23;
        f577a = i2 % 128;
        int i3 = i2 % 2;
        getWindow().setDecorFitsSystemWindows(false);
        WindowInsetsController insetsController = getWindow().getInsetsController();
        if (insetsController != null) {
            int i4 = g + 85;
            f577a = i4 % 128;
            if (i4 % 2 == 0) {
                insetsController.setSystemBarsBehavior(2);
            } else {
                insetsController.setSystemBarsBehavior(2);
            }
        }
        WindowInsetsController insetsController2 = getWindow().getInsetsController();
        if (insetsController2 != null) {
            insetsController2.hide(WindowInsets.Type.navigationBars());
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        VideoPlayerActivity videoPlayerActivity = (VideoPlayerActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = g + 99;
        f577a = i2 % 128;
        if (i2 % 2 != 0) {
            super.onWindowFocusChanged(zBooleanValue);
            if (zBooleanValue) {
                if (!(!((ShareTargetParams) videoPlayerActivity.b.getValue()).b)) {
                    videoPlayerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    videoPlayerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(false);
                    int i3 = g + 101;
                    f577a = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    int i5 = g + 23;
                    f577a = i5 % 128;
                    if (i5 % 2 == 0) {
                        videoPlayerActivity.TuitionPaymentFragmentbindingInflater1();
                        videoPlayerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
                    } else {
                        videoPlayerActivity.TuitionPaymentFragmentbindingInflater1();
                        videoPlayerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
                    }
                }
            }
            return null;
        }
        super.onWindowFocusChanged(zBooleanValue);
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = f577a + 1;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) scheduleWithFixedDelay.TuitionPaymentFragmentspecialinlinedviewModeldefault2[1]).getInt(null);
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 635912276;
            int i4 = ~iCodePointAt;
            if (i3 != (-571500829) + (((~((-870673009) | i4)) | 572809760) * 168) + ((~((-572809761) | iCodePointAt)) * 168) + (((~(iCodePointAt | (-297863249))) | (~(i4 | (-572977708))) | 167947) * 168)) {
                throw null;
            }
        } else {
            int i5 = ((Field) scheduleWithFixedDelay.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i6 = ~iUptimeMillis;
            if (i5 != ((((~((-1072275350) | i6)) | (~(iUptimeMillis | 371375366))) * 959) - 704533847) + (((~(iUptimeMillis | (-1072275350))) | (~(i6 | 371375366))) * 959)) {
                throw null;
            }
        }
        int i7 = ((Field) HandlerScheduledExecutorService1.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i7 != 299220373 + (((~((~iIdentityHashCode) | (-23341322))) | (~(394264575 | iIdentityHashCode))) * (-302)) + ((~((-23341322) | iIdentityHashCode)) * (-604)) + (((~(iIdentityHashCode | 370923254)) | 67326562) * 302)) {
            throw null;
        }
        int i8 = ((Field) isPeriodic.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        if (i8 != ((~(iIdentityHashCode2 | 61784128)) * TypedValues.CycleType.TYPE_EASING) + 519348459 + (((~((~iIdentityHashCode2) | 61784128)) | 147456) * TypedValues.CycleType.TYPE_EASING)) {
            throw new RuntimeException("-853026040");
        }
        int i9 = ((Field) cacheInteropConfig.b[0]).getInt(null);
        int i10 = (int) Runtime.getRuntime().totalMemory();
        if (i9 != 2041446280 + (((~(886975779 | i10)) | 882519331) * (-502)) + ((~((~i10) | 939507567)) * (-502)) + (((~(i10 | (-56988237))) | 886975779) * TypedValues.PositionType.TYPE_DRAWPATH)) {
            int i11 = (-5955912) % 2;
            throw new ArithmeticException();
        }
        int i12 = ((Field) generateCameraId.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMyTid = Process.myTid();
        if (i12 != (-927720804) + (((~(2021979531 | iMyTid)) | 306068200) * (-366)) + (((~(iMyTid | 2059337707)) | 268710024) * 366)) {
            throw new RuntimeException("1695041603");
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - View.MeasureSpec.getSize(0)), 40 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf("", "", 0) + 19, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.blue(0) + 46400), AndroidCharacter.getMirror('0') - '\b', (KeyEvent.getMaxKeyCode() >> 16) + 19, 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
            super.onResume();
            if (((ApiCompatApi29Impl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.g()) {
                return;
            }
            int i13 = f577a + 33;
            g = i13 % 128;
            int i14 = i13 % 2;
            LoginActivity.Companion companion = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, null, false, 6);
            finish();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = f577a;
        int i3 = i2 + 91;
        g = i3 % 128;
        int i4 = i3 % 2;
        ActivityVideoPlayerBinding activityVideoPlayerBinding = this.d;
        if (activityVideoPlayerBinding == null) {
            int i5 = i2 + 3;
            g = i5 % 128;
            activityVideoPlayerBinding = null;
            if (i5 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        activityVideoPlayerBinding.videoPlayer.destroy();
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = f577a + 125;
        g = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - TextUtils.indexOf("", "")), 40 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 19, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
                }
                Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 46400), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 40, Color.red(0) + 19, 41588667, false, "b", new Class[0]);
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
                super.onPause();
                return;
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46448 - AndroidCharacter.getMirror('0')), 40 - Color.red(0), 19 - (ViewConfiguration.getPressedStateDuration() >> 16), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            Object obj2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 46400), View.getDefaultSize(0, 0) + 40, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 20, 41588667, false, "b", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(obj2, null);
            super.onPause();
            int i3 = 75 / 0;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = g + 43;
        f577a = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 1031;
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 15;
            short s = (short) 210;
            Object[] objArr3 = new Object[1];
            e(s, (byte) (s >>> 2), $$a[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, iIndexOf, touchSlop, 1357589585, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new int[]{1990361142, -305464592, -1899665438, 1848350860, -776411831, -1749514098, -1973281659, -572669690, 1546237203, -909758162, 1622992170, -1460702208, -543720961, -176484568}, View.combineMeasuredStates(0, 0) + 22, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new int[]{1416255341, 296083240, -929532156, -1464790531, -729549954, -1710342877, 1786924892, -1934221825, 981273768, -340366550}, 14 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char mode = (char) View.MeasureSpec.getMode(0);
            int offsetBefore2 = 1031 - TextUtils.getOffsetBefore("", 0);
            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
            Object[] objArr6 = new Object[1];
            e((short) 121, (byte) 52, $$a[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, offsetBefore2, maximumFlingVelocity, 1344079056, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = g + 3;
            f577a = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                int minimumFlingVelocity = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 15;
                short s2 = $$a[7];
                byte b = (byte) s2;
                Object[] objArr7 = new Object[1];
                e(s2, b, (byte) (b | 14), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, minimumFlingVelocity, iIndexOf2, 632103528, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i7 = ((int[]) objArr8[3])[0];
            int i8 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[0];
            int i9 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            int i10 = ~i9;
            int i11 = 110627453 + (((~((-100057450) | i10)) | 344337619) * (-328)) + ((i9 | 344337619) * 164) + (((~(i9 | 100057449)) | 268446866 | (~(i10 | (-24166697)))) * 164) + 1824997241;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[2])[0] = i13 ^ (i13 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new int[]{-462013495, -1392157243, -96898725, -976205857, 1573374169, -2052066475, -1027475838, 1962070465, -1542091158, 1912709546}, 16 - TextUtils.getTrimmedLength(""), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new int[]{-446004696, 1317449918, -1086459417, -264349137, -1493800831, 1550807602, -1096255253, 1048922120, -1759617917, -303703135}, 16 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr11 = {1593854743};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Color.blue(0) + 1134, 18 - Gravity.getAbsoluteGravity(0, 0), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12 = {Integer.valueOf(iIntValue), 0, 1824997241, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr11), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cBlue = (char) Color.blue(0);
                    int defaultSize = 1031 - View.getDefaultSize(0, 0);
                    int iAxisFromString = MotionEvent.axisFromString("") + 16;
                    short s3 = (short) 210;
                    Object[] objArr13 = new Object[1];
                    e(s3, (byte) (s3 >>> 2), $$a[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cBlue, defaultSize, iAxisFromString, 1298546779, false, (String) objArr13[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (View.MeasureSpec.getSize(0) + 45993), 1117 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.argb(0, 0, 0, 0) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cRed = (char) Color.red(0);
                    int capsMode = 1031 - TextUtils.getCapsMode("", 0, 0);
                    int iIndexOf3 = 15 - TextUtils.indexOf("", "");
                    short s4 = $$a[7];
                    byte b2 = (byte) s4;
                    Object[] objArr14 = new Object[1];
                    e(s4, b2, (byte) (b2 | 14), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed, capsMode, iIndexOf3, 632103528, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new int[]{1990361142, -305464592, -1899665438, 1848350860, -776411831, -1749514098, -1973281659, -572669690, 1546237203, -909758162, 1622992170, -1460702208, -543720961, -176484568}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr15);
                    Class<?> cls3 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new int[]{1416255341, 296083240, -929532156, -1464790531, -729549954, -1710342877, 1786924892, -1934221825, 981273768, -340366550}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_klikbca2).substring(15, 16).codePointAt(0) - 17, objArr16);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int i14 = 1032 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0') + 16;
                        Object[] objArr17 = new Object[1];
                        e((short) 121, (byte) 52, $$a[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollBarSize, i14, iIndexOf4, 1344079056, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int i15 = 1032 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int minimumFlingVelocity2 = 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        short s5 = (short) 210;
                        Object[] objArr18 = new Object[1];
                        e(s5, (byte) (s5 >>> 2), $$a[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionType, i15, minimumFlingVelocity2, 1357589585, false, (String) objArr18[0], null);
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
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[3])[0];
        if (i17 != i16) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                while (i4 < strArr2.length) {
                    int i18 = f577a + 47;
                    g = i18 % 128;
                    if (i18 % 2 != 0) {
                        arrayList.add(strArr2[i4]);
                        i4 += 109;
                    } else {
                        arrayList.add(strArr2[i4]);
                        i4++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i17));
        }
        int i19 = f577a + 121;
        g = i19 % 128;
        int i20 = i19 % 2;
        Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i21 = ((int[]) objArr[2])[0];
        int i22 = ((int[]) objArr[3])[0];
        int i23 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i24 = i21 + (-1598785894) + (((~((-10978227) | iUptimeMillis)) | (~(233301943 | iUptimeMillis))) * 69) + (((~(iUptimeMillis | 11003830)) | (~((-233276340) | iUptimeMillis)) | 222298113) * (-69)) + 1766676;
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr19[2])[0] = i26 ^ (i26 << 5);
        int i27 = f577a + 23;
        g = i27 % 128;
        if (i27 % 2 != 0) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29944);
                int iMyPid = 1755 - (Process.myPid() >> 22);
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 23;
                Object[] objArr20 = new Object[1];
                e((short) 158, (byte) 37, $$a[7], objArr20);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c, iMyPid, pressedStateDuration, 986134021, false, (String) objArr20[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null);
            throw null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
            char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29944);
            int iMyPid2 = 1755 - (Process.myPid() >> 22);
            int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23;
            Object[] objArr21 = new Object[1];
            e((short) 158, (byte) 37, $$a[7], objArr21);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(keyRepeatTimeout, iMyPid2, minimumFlingVelocity3, 986134021, false, (String) objArr21[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).getLong(null) != -1) {
            int i28 = f577a + 85;
            g = i28 % 128;
            int i29 = i28 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 29944);
                int touchSlop2 = 1755 - (ViewConfiguration.getTouchSlop() >> 8);
                int iRgb = (-16777193) - Color.rgb(0, 0, 0);
                Object[] objArr22 = new Object[1];
                e((short) 121, (byte) 52, $$a[7], objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(threadPriority, touchSlop2, iRgb, 1599039318, false, (String) objArr22[0], null);
            }
            Object[] objArr23 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).get(null);
            int i30 = ((int[]) objArr23[0])[0];
            objArr2 = new Object[]{new int[]{i30}, new int[]{((int[]) objArr23[1])[0]}, (Object[]) objArr23[2], new int[1], (String[]) objArr23[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i31 = ~iIdentityHashCode;
            int i32 = ((((~(503062527 | i31)) | (~((-11010251) | iIdentityHashCode))) * 988) - 857043151) + (((~(iIdentityHashCode | 279449851)) | 223612676 | (~(i31 | (-11010251)))) * 988) + 296324290;
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr2[3])[0] = i34 ^ (i34 << 5);
        } else {
            Object[] objArr24 = new Object[1];
            c(new int[]{-462013495, -1392157243, -96898725, -976205857, 1573374169, -2052066475, -1027475838, 1962070465, -1542091158, 1912709546}, 16 - KeyEvent.getDeadChar(0, 0), objArr24);
            Class<?> cls4 = Class.forName((String) objArr24[0]);
            Object[] objArr25 = new Object[1];
            c(new int[]{-446004696, 1317449918, -1086459417, -264349137, -1493800831, 1550807602, -1096255253, 1048922120, -1759617917, -303703135}, 16 - TextUtils.getCapsMode("", 0, 0), objArr25);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr25[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr26 = {1593854743};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b((char) (42049 - (ViewConfiguration.getEdgeSlop() >> 16)), TextUtils.indexOf("", "") + 1726, TextUtils.getOffsetAfter("", 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).newInstance(objArr26), 296324290, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char c2 = (char) (29945 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                int i35 = 1755 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 23;
                Object[] objArr27 = new Object[1];
                e((short) 121, (byte) 52, $$a[7], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c2, i35, capsMode2, 1599039318, false, (String) objArr27[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
            try {
                Object[] objArr28 = new Object[1];
                c(new int[]{1990361142, -305464592, -1899665438, 1848350860, -776411831, -1749514098, -1973281659, -572669690, 1546237203, -909758162, 1622992170, -1460702208, -543720961, -176484568}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, objArr28);
                Class<?> cls5 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                c(new int[]{1416255341, 296083240, -929532156, -1464790531, -729549954, -1710342877, 1786924892, -1934221825, 981273768, -340366550}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_alto7_bni).substring(105, 113).codePointAt(3) - 87, objArr29);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr29[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 29944);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1756;
                    int longPressTimeout = 23 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    short s6 = (short) 52;
                    Object[] objArr30 = new Object[1];
                    e(s6, (byte) s6, $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cIndexOf, iLastIndexOf, longPressTimeout, 1596667560, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cMyTid = (char) ((Process.myTid() >> 22) + 29944);
                    int tapTimeout = 1755 - (ViewConfiguration.getTapTimeout() >> 16);
                    int iLastIndexOf2 = 22 - TextUtils.lastIndexOf("", '0');
                    Object[] objArr31 = new Object[1];
                    e((short) 158, (byte) 37, $$a[7], objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cMyTid, tapTimeout, iLastIndexOf2, 986134021, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf4);
                objArr2 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i36 = ((int[]) objArr2[1])[0];
        int i37 = ((int[]) objArr2[0])[0];
        if (i37 != i36) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArr2[4];
            if (strArr4 != null) {
                while (i4 < strArr4.length) {
                    arrayList2.add(strArr4[i4]);
                    i4++;
                }
            }
            throw new RuntimeException(String.valueOf(i37));
        }
        int i38 = ((int[]) objArr2[3])[0];
        int i39 = ((int[]) objArr2[0])[0];
        Object[] objArr32 = {new int[]{i39}, new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[1], (String[]) objArr2[4]};
        int i40 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().touchscreen;
        int i41 = 1550005579 + (((~((-622698086) | i40)) | 1151009 | (~((-410095660) | i40))) * (-754));
        int i42 = ~((-1151010) | i40);
        int i43 = ~i40;
        int i44 = i38 + i41 + ((i42 | (~((-408944651) | i43))) * (-754)) + ((i43 | (-622698086)) * 754);
        int i45 = (i44 << 13) ^ i44;
        int i46 = i45 ^ (i45 >>> 17);
        ((int[]) objArr32[3])[0] = i46 ^ (i46 << 5);
    }

    public static /* synthetic */ void b(VideoPlayerActivity videoPlayerActivity, View view) {
        int i = 2 % 2;
        int i2 = g + 21;
        f577a = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (i3 == 0) {
                videoPlayerActivity.finish();
                ViewPortBuilder.b();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            videoPlayerActivity.finish();
            ViewPortBuilder.b();
            int i4 = f577a + 85;
            g = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            ViewPortBuilder.b();
            throw th;
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(final VideoPlayerActivity videoPlayerActivity, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        int i = 2 % 2;
        ActivityVideoPlayerBinding activityVideoPlayerBinding = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            ActivityVideoPlayerBinding activityVideoPlayerBinding2 = videoPlayerActivity.d;
            if (activityVideoPlayerBinding2 == null) {
                int i2 = f577a + 93;
                g = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                activityVideoPlayerBinding = activityVideoPlayerBinding2;
            }
            activityVideoPlayerBinding.progressBar.setVisibility(0);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            ActivityVideoPlayerBinding activityVideoPlayerBinding3 = videoPlayerActivity.d;
            if (activityVideoPlayerBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                activityVideoPlayerBinding = activityVideoPlayerBinding3;
            }
            activityVideoPlayerBinding.progressBar.setVisibility(8);
            if (videoPlayerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                videoPlayerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
                PodcastVideoList podcastVideoList = ((ShareTargetParams) videoPlayerActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (podcastVideoList == null || (str = podcastVideoList.b) == null) {
                    str = videoPlayerActivity.TuitionPaymentFragmentbindingInflater1;
                }
                getMaxImages getmaximages = getMaxImages.INSTANCE;
                Task<ShortDynamicLink> taskBuildShortDynamicLink = FirebaseDynamicLinks.getInstance().createDynamicLink().setLink(Uri.parse("https://bpjstku-191004.web.app/podcast?videoId=".concat(String.valueOf(str)))).setDomainUriPrefix(getMaxImages.INotificationSideChannelDefault()).setAndroidParameters(new DynamicLink.AndroidParameters.Builder().build()).setIosParameters(new DynamicLink.IosParameters.Builder("com.bpjstku.ios").setAppStoreId("1444834757").build()).buildShortDynamicLink();
                final Function1 function1 = new Function1() { // from class: getCaptureRequestTemplate
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return VideoPlayerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (ShortDynamicLink) obj);
                    }
                };
                taskBuildShortDynamicLink.addOnSuccessListener(new OnSuccessListener() { // from class: getPhysicalCameraId
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        VideoPlayerActivity.TuitionPaymentFragmentbindingInflater1(function1, obj);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: getCaptureRequestTag
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) throws IllegalAccessException {
                        VideoPlayerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, exc);
                    }
                });
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i4 = g;
            int i5 = i4 + 23;
            f577a = i5 % 128;
            int i6 = i5 % 2;
            ActivityVideoPlayerBinding activityVideoPlayerBinding4 = videoPlayerActivity.d;
            if (activityVideoPlayerBinding4 == null) {
                int i7 = i4 + 59;
                f577a = i7 % 128;
                if (i7 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i8 = 21 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
            } else {
                activityVideoPlayerBinding = activityVideoPlayerBinding4;
            }
            activityVideoPlayerBinding.progressBar.setVisibility(8);
            String str2 = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(VideoPlayerActivity videoPlayerActivity, View view) {
        String str;
        int i = 2 % 2;
        int i2 = g + 49;
        f577a = i2 % 128;
        int i3 = i2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            videoPlayerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            String type = PodcastTypeLog.SHARE.getType();
            PodcastVideoList podcastVideoList = ((ShareTargetParams) videoPlayerActivity.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (podcastVideoList == null || (str = podcastVideoList.b) == null) {
                str = videoPlayerActivity.TuitionPaymentFragmentbindingInflater1;
            }
            ShareTargetParams shareTargetParams = (ShareTargetParams) videoPlayerActivity.b.getValue();
            String string = Settings.Secure.getString(videoPlayerActivity.getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(string, "");
            shareTargetParams.TuitionPaymentFragmentbindingInflater1(type, string, str);
            ViewPortBuilder.b();
            int i4 = g + 109;
            f577a = i4 % 128;
            if (i4 % 2 != 0) {
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

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = f577a + 125;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(obj);
            int i3 = 75 / 0;
        } else {
            function1.invoke(obj);
        }
        int i4 = g + 41;
        f577a = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(VideoPlayerActivity videoPlayerActivity, View view) {
        int i = 2 % 2;
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (((ShareTargetParams) videoPlayerActivity.b.getValue()).b) {
                int i2 = f577a + 19;
                g = i2 % 128;
                int i3 = i2 % 2;
                videoPlayerActivity.b();
                int i4 = f577a + 7;
                g = i4 % 128;
                int i5 = i4 % 2;
            } else {
                videoPlayerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(VideoPlayerActivity videoPlayerActivity, ShortDynamicLink shortDynamicLink) {
        int i = 2 % 2;
        String strValueOf = String.valueOf(shortDynamicLink.getShortLink());
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", "Pastikan Anda sudah menginstall aplikasi JMO untuk mengakses tautan berikut :\n".concat(String.valueOf(strValueOf)));
        videoPlayerActivity.startActivity(Intent.createChooser(intent, "Bagikan video"));
        Unit unit = Unit.INSTANCE;
        int i2 = f577a + 53;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 67 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(VideoPlayerActivity videoPlayerActivity, Exception exc) throws IllegalAccessException {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{videoPlayerActivity, exc}, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1934705732, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 1934705732, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    @Deprecated(message = "Use OnBackPressedDispatcher instead")
    public final void onBackPressed() throws IllegalAccessException {
        int iB = BenefitItem.b.b();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iB2 = BenefitItem.b.b();
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1469214084, new Object[]{this}, iB, -458538699, iB2, 458538702, iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean p0) throws IllegalAccessException {
        b(getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this, Boolean.valueOf(p0)}, BenefitItem.b.b(), 1656435236, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_indosat_dompetku).substring(1, 3).codePointAt(1) - 915364627, -1656435234, BenefitItem.b.b());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int iB = BenefitItem.b.b();
        int iB2 = BenefitItem.b.b();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getServiceInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        b(BenefitItem.b.b(), new Object[]{this}, iB, 1328150177, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1328150176, iB2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, byte r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.podcast.VideoPlayerActivity.$$c
            int r8 = r8 * 56
            int r8 = 122 - r8
            int r7 = r7 * 2
            int r1 = 1 - r7
            int r6 = r6 + 3
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.podcast.VideoPlayerActivity.$$g(short, int, byte):java.lang.String");
    }
}
