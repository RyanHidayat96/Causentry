package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import defpackage.ProcessCameraProviderExternalSyntheticLambda0;
import defpackage.accessgetActiveConcurrentCameraInfos;
import defpackage.accesssetCameraX;
import defpackage.accesssetContext;
import defpackage.accesssetMCameraXConfigProviderp;
import defpackage.bindToLifecycle;
import defpackage.getAvailableConcurrentCameraInfos;
import defpackage.setCameraX;
import defpackage.shutdownAsynclambda0;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00118\u0001@BX\u0080\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00118\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0012\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001e\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0014\u0010#\u001a\u00020\"8\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010("}, d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/LegacyYouTubePlayerView;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/SixteenByNineFrameLayout;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "LaccesssetCameraX;", "p1", "Landroid/util/AttributeSet;", "p2", "", "p3", "(Landroid/content/Context;LaccesssetCameraX;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "", "setCustomPlayerUi", "(Landroid/view/View;)V", "", "b", "Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "TuitionPaymentFragmentbindingInflater1", "isYouTubePlayerReady", "isYouTubePlayerReady$core_release", "()Z", "setYouTubePlayerReady$core_release", "(Z)V", "LsetCameraX;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LsetCameraX;", "LshutdownAsynclambda0;", "LshutdownAsynclambda0;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/WebViewYouTubePlayer;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/WebViewYouTubePlayer;", "", "LaccesssetContext;", "a", "Ljava/util/Set;", "g"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LegacyYouTubePlayerView extends SixteenByNineFrameLayout {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    final shutdownAsynclambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    Function0<Unit> TuitionPaymentFragmentbindingInflater1;
    final WebViewYouTubePlayer TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    final setCameraX b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<accesssetContext> g;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    boolean isYouTubePlayerReady;

    public /* synthetic */ LegacyYouTubePlayerView(Context context, accesssetCameraX accesssetcamerax, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, accesssetcamerax, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private LegacyYouTubePlayerView(Context context, accesssetCameraX accesssetcamerax, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(accesssetcamerax, "");
        WebViewYouTubePlayer webViewYouTubePlayer = new WebViewYouTubePlayer(context, accesssetcamerax, null, 0, 12, null);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = webViewYouTubePlayer;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        setCameraX setcamerax = new setCameraX(applicationContext);
        this.b = setcamerax;
        shutdownAsynclambda0 shutdownasynclambda0 = new shutdownAsynclambda0();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = shutdownasynclambda0;
        this.TuitionPaymentFragmentbindingInflater1 = new Function0<Unit>() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$initialize$1
            public final void TuitionPaymentFragmentbindingInflater1() {
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                TuitionPaymentFragmentbindingInflater1();
                return Unit.INSTANCE;
            }
        };
        this.g = new LinkedHashSet();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        addView(webViewYouTubePlayer, new FrameLayout.LayoutParams(-1, -1));
        shutdownAsynclambda0 shutdownasynclambda1 = shutdownasynclambda0;
        Intrinsics.checkNotNullParameter(shutdownasynclambda1, "");
        webViewYouTubePlayer.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(shutdownasynclambda1);
        accesssetMCameraXConfigProviderp accesssetmcameraxconfigproviderp = new accesssetMCameraXConfigProviderp() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView.1
            @Override // defpackage.accesssetMCameraXConfigProviderp, defpackage.setContext
            public final void b(accessgetActiveConcurrentCameraInfos accessgetactiveconcurrentcamerainfos, PlayerConstants.PlayerState playerState) {
                Intrinsics.checkNotNullParameter(accessgetactiveconcurrentcamerainfos, "");
                Intrinsics.checkNotNullParameter(playerState, "");
                if (playerState == PlayerConstants.PlayerState.PLAYING) {
                    LegacyYouTubePlayerView legacyYouTubePlayerView = LegacyYouTubePlayerView.this;
                    if (legacyYouTubePlayerView.TuitionPaymentFragmentspecialinlinedviewModeldefault1 || legacyYouTubePlayerView.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getIsBackgroundPlaybackEnabled()) {
                        return;
                    }
                    accessgetactiveconcurrentcamerainfos.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
            }
        };
        Intrinsics.checkNotNullParameter(accesssetmcameraxconfigproviderp, "");
        webViewYouTubePlayer.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(accesssetmcameraxconfigproviderp);
        accesssetMCameraXConfigProviderp accesssetmcameraxconfigproviderp2 = new accesssetMCameraXConfigProviderp() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView.3
            @Override // defpackage.accesssetMCameraXConfigProviderp, defpackage.setContext
            public final void TuitionPaymentFragmentbindingInflater1(accessgetActiveConcurrentCameraInfos accessgetactiveconcurrentcamerainfos) {
                Intrinsics.checkNotNullParameter(accessgetactiveconcurrentcamerainfos, "");
                LegacyYouTubePlayerView.this.setYouTubePlayerReady$core_release(true);
                for (accesssetContext accesssetcontext : LegacyYouTubePlayerView.this.g) {
                }
                LegacyYouTubePlayerView.this.g.clear();
                accessgetactiveconcurrentcamerainfos.TuitionPaymentFragmentbindingInflater1(this);
            }
        };
        Intrinsics.checkNotNullParameter(accesssetmcameraxconfigproviderp2, "");
        webViewYouTubePlayer.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(accesssetmcameraxconfigproviderp2);
        setcamerax.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(new setCameraX.TuitionPaymentFragmentspecialinlinedviewModeldefault3() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView.4
            @Override // setCameraX.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            public final void TuitionPaymentFragmentbindingInflater1() {
                if (!LegacyYouTubePlayerView.this.getIsYouTubePlayerReady()) {
                    LegacyYouTubePlayerView.this.TuitionPaymentFragmentbindingInflater1.invoke();
                    return;
                }
                shutdownAsynclambda0 shutdownasynclambda2 = LegacyYouTubePlayerView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                ProcessCameraProviderExternalSyntheticLambda0 processCameraProviderExternalSyntheticLambda0 = LegacyYouTubePlayerView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Intrinsics.checkNotNullParameter(processCameraProviderExternalSyntheticLambda0, "");
                String str = shutdownasynclambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (str != null) {
                    if (shutdownasynclambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && shutdownasynclambda2.TuitionPaymentFragmentbindingInflater1 == PlayerConstants.PlayerError.HTML_5_PLAYER) {
                        bindToLifecycle.TuitionPaymentFragmentbindingInflater1(processCameraProviderExternalSyntheticLambda0, shutdownasynclambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, str, shutdownasynclambda2.b);
                    } else if (!shutdownasynclambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && shutdownasynclambda2.TuitionPaymentFragmentbindingInflater1 == PlayerConstants.PlayerError.HTML_5_PLAYER) {
                        processCameraProviderExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(str, shutdownasynclambda2.b);
                    }
                    shutdownasynclambda2.TuitionPaymentFragmentbindingInflater1 = null;
                }
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegacyYouTubePlayerView(Context context) {
        this(context, getAvailableConcurrentCameraInfos.INSTANCE, null, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX INFO: renamed from: isYouTubePlayerReady$core_release, reason: from getter */
    public final boolean getIsYouTubePlayerReady() {
        return this.isYouTubePlayerReady;
    }

    public final void setYouTubePlayerReady$core_release(boolean z) {
        this.isYouTubePlayerReady = z;
    }

    public final void setCustomPlayerUi(View p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        removeViews(1, getChildCount() - 1);
        addView(p0);
    }
}
