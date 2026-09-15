package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import defpackage.ProcessCameraProviderExternalSyntheticLambda0;
import defpackage.accessgetActiveConcurrentCameraInfos;
import defpackage.accessgetMContextp;
import defpackage.accesssetCameraX;
import defpackage.getAvailableConcurrentCameraInfos;
import defpackage.setContext;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0010R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u00020\u001b8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020$0#8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\"\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0'8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0016\u0010("}, d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/WebViewYouTubePlayer;", "Landroid/webkit/WebView;", "LaccessgetMContextp$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "LaccesssetCameraX;", "p1", "Landroid/util/AttributeSet;", "p2", "", "p3", "(Landroid/content/Context;LaccesssetCameraX;Landroid/util/AttributeSet;I)V", "", "destroy", "()V", "LaccessgetActiveConcurrentCameraInfos;", "b", "()LaccessgetActiveConcurrentCameraInfos;", "onWindowVisibilityChanged", "(I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LProcessCameraProviderExternalSyntheticLambda0;", "TuitionPaymentFragmentbindingInflater1", "LProcessCameraProviderExternalSyntheticLambda0;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "isBackgroundPlaybackEnabled", "Z", "isBackgroundPlaybackEnabled$core_release", "()Z", "setBackgroundPlaybackEnabled$core_release", "(Z)V", "LaccesssetCameraX;", "", "LsetContext;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Ljava/util/Collection;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebViewYouTubePlayer extends WebView implements accessgetMContextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    final ProcessCameraProviderExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    Function1<? super accessgetActiveConcurrentCameraInfos, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final accesssetCameraX b;
    private boolean isBackgroundPlaybackEnabled;

    public /* synthetic */ WebViewYouTubePlayer(Context context, accesssetCameraX accesssetcamerax, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, accesssetcamerax, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private WebViewYouTubePlayer(Context context, accesssetCameraX accesssetcamerax, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(accesssetcamerax, "");
        this.b = accesssetcamerax;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ProcessCameraProviderExternalSyntheticLambda0(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebViewYouTubePlayer(Context context) {
        this(context, getAvailableConcurrentCameraInfos.INSTANCE, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX INFO: renamed from: isBackgroundPlaybackEnabled$core_release, reason: from getter */
    public final boolean getIsBackgroundPlaybackEnabled() {
        return this.isBackgroundPlaybackEnabled;
    }

    public final void setBackgroundPlaybackEnabled$core_release(boolean z) {
        this.isBackgroundPlaybackEnabled = z;
    }

    @Override // accessgetMContextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3
    public final Collection<setContext> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return CollectionsKt.toSet(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // accessgetMContextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3
    public final accessgetActiveConcurrentCameraInfos b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // accessgetMContextp.TuitionPaymentFragmentspecialinlinedviewModeldefault3
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Function1<? super accessgetActiveConcurrentCameraInfos, Unit> function1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            function1 = null;
        }
        function1.invoke(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        ProcessCameraProviderExternalSyntheticLambda0 processCameraProviderExternalSyntheticLambda0 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        processCameraProviderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3.clear();
        processCameraProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1.removeCallbacksAndMessages(null);
        super.destroy();
    }

    public static final class b extends WebChromeClient {
        b() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onShowCustomView(View view, final WebChromeClient.CustomViewCallback customViewCallback) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(customViewCallback, "");
            super.onShowCustomView(view, customViewCallback);
            WebViewYouTubePlayer.this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, new Function0<Unit>() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$initWebView$2$onShowCustomView$1
                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                    customViewCallback.onCustomViewHidden();
                }

                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ Unit invoke() {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public final void onHideCustomView() {
            super.onHideCustomView();
            WebViewYouTubePlayer.this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }

        @Override // android.webkit.WebChromeClient
        public final Bitmap getDefaultVideoPoster() {
            Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
            return defaultVideoPoster == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565) : defaultVideoPoster;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onWindowVisibilityChanged(int p0) {
        if (this.isBackgroundPlaybackEnabled && (p0 == 8 || p0 == 4)) {
            return;
        }
        super.onWindowVisibilityChanged(p0);
    }
}
