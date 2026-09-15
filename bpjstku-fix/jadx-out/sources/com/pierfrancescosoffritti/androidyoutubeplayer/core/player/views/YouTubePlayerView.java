package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.ConnectivityManager;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleEventObserver;
import androidx.p002lifecycle.LifecycleOwner;
import com.bpjstku.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer.b;
import defpackage.accessgetActiveConcurrentCameraInfos;
import defpackage.accessgetCameraOperatingMode;
import defpackage.accessgetMContextp;
import defpackage.accesssetCameraX;
import defpackage.accesssetMCameraXConfigProviderp;
import defpackage.bindToLifecycle;
import defpackage.getOrCreateCameraXInstancelambda18lambda17lambda16lambda15;
import defpackage.isConcurrentCameraModeOn;
import defpackage.setCameraX;
import defpackage.setContext;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import setCameraX.TuitionPaymentFragmentbindingInflater1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001e\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerView;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/SixteenByNineFrameLayout;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "p1", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "p2", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/Lifecycle$Event;", "", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "Landroid/view/View;", "setCustomPlayerUi", "(Landroid/view/View;)V", "", "enableAutomaticInitialization", "Z", "getEnableAutomaticInitialization", "()Z", "setEnableAutomaticInitialization", "(Z)V", "", "LaccesssetCameraX;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/LegacyYouTubePlayerView;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/LegacyYouTubePlayerView;", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerView$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "b", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerView$TuitionPaymentFragmentspecialinlinedviewModeldefault3;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class YouTubePlayerView extends SixteenByNineFrameLayout implements LifecycleEventObserver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final List<accesssetCameraX> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final LegacyYouTubePlayerView TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault3 b;
    private boolean enableAutomaticInitialization;

    public /* synthetic */ YouTubePlayerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayList();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        this.b = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final LegacyYouTubePlayerView legacyYouTubePlayerView = new LegacyYouTubePlayerView(context, tuitionPaymentFragmentspecialinlinedviewModeldefault3, null, 0, 12, null);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = legacyYouTubePlayerView;
        addView(legacyYouTubePlayerView, new FrameLayout.LayoutParams(-1, -1));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, accessgetCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.enableAutomaticInitialization = typedArrayObtainStyledAttributes.getBoolean(accessgetCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(accessgetCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(accessgetCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, true);
        final String string = typedArrayObtainStyledAttributes.getString(accessgetCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        typedArrayObtainStyledAttributes.recycle();
        if (z && string == null) {
            throw new IllegalStateException("YouTubePlayerView: videoId is not set but autoPlay is set to true. This combination is not allowed.");
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(string, this, z);
        if (this.enableAutomaticInitialization) {
            final TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
            getOrCreateCameraXInstancelambda18lambda17lambda16lambda15.Companion companion = getOrCreateCameraXInstancelambda18lambda17lambda16lambda15.INSTANCE;
            final getOrCreateCameraXInstancelambda18lambda17lambda16lambda15 getorcreatecameraxinstancelambda18lambda17lambda16lambda15TuitionPaymentFragmentbindingInflater1 = getOrCreateCameraXInstancelambda18lambda17lambda16lambda15.Companion.TuitionPaymentFragmentbindingInflater1();
            Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
            Intrinsics.checkNotNullParameter(getorcreatecameraxinstancelambda18lambda17lambda16lambda15TuitionPaymentFragmentbindingInflater1, "");
            if (legacyYouTubePlayerView.isYouTubePlayerReady) {
                throw new IllegalStateException("This YouTubePlayerView has already been initialized.");
            }
            if (z2) {
                setCameraX setcamerax = legacyYouTubePlayerView.b;
                Context context2 = setcamerax.TuitionPaymentFragmentbindingInflater1;
                setCameraX.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = setcamerax.new TuitionPaymentFragmentbindingInflater1();
                setcamerax.b = tuitionPaymentFragmentbindingInflater1;
                Object systemService = context2.getSystemService("connectivity");
                Intrinsics.checkNotNull(systemService, "");
                ((ConnectivityManager) systemService).registerDefaultNetworkCallback(tuitionPaymentFragmentbindingInflater1);
            }
            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$initialize$2
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ Unit invoke() throws JSONException {
                    b();
                    return Unit.INSTANCE;
                }

                public final void b() throws JSONException {
                    String string2;
                    WebViewYouTubePlayer webViewYouTubePlayer = legacyYouTubePlayerView.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    final setContext setcontext = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    Function1<accessgetActiveConcurrentCameraInfos, Unit> function1 = new Function1<accessgetActiveConcurrentCameraInfos, Unit>() { // from class: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.LegacyYouTubePlayerView$initialize$2.1
                        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(accessgetActiveConcurrentCameraInfos accessgetactiveconcurrentcamerainfos) {
                            Intrinsics.checkNotNullParameter(accessgetactiveconcurrentcamerainfos, "");
                            accessgetactiveconcurrentcamerainfos.TuitionPaymentFragmentspecialinlinedviewModeldefault1(setcontext);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ Unit invoke(accessgetActiveConcurrentCameraInfos accessgetactiveconcurrentcamerainfos) {
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1(accessgetactiveconcurrentcamerainfos);
                            return Unit.INSTANCE;
                        }

                        {
                            super(1);
                        }
                    };
                    getOrCreateCameraXInstancelambda18lambda17lambda16lambda15 getorcreatecameraxinstancelambda18lambda17lambda16lambda15TuitionPaymentFragmentbindingInflater2 = getorcreatecameraxinstancelambda18lambda17lambda16lambda15TuitionPaymentFragmentbindingInflater1;
                    String str = string;
                    Intrinsics.checkNotNullParameter(function1, "");
                    webViewYouTubePlayer.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
                    if (getorcreatecameraxinstancelambda18lambda17lambda16lambda15TuitionPaymentFragmentbindingInflater2 == null) {
                        getOrCreateCameraXInstancelambda18lambda17lambda16lambda15.Companion companion2 = getOrCreateCameraXInstancelambda18lambda17lambda16lambda15.INSTANCE;
                        getorcreatecameraxinstancelambda18lambda17lambda16lambda15TuitionPaymentFragmentbindingInflater2 = getOrCreateCameraXInstancelambda18lambda17lambda16lambda15.Companion.TuitionPaymentFragmentbindingInflater1();
                    }
                    WebSettings settings = webViewYouTubePlayer.getSettings();
                    settings.setJavaScriptEnabled(true);
                    settings.setMediaPlaybackRequiresUserGesture(false);
                    settings.setCacheMode(-1);
                    webViewYouTubePlayer.addJavascriptInterface(new accessgetMContextp(webViewYouTubePlayer), "YouTubePlayerBridge");
                    InputStream inputStreamOpenRawResource = webViewYouTubePlayer.getResources().openRawResource(R.raw.ayp_youtube_player);
                    Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "");
                    String strB = isConcurrentCameraModeOn.b(inputStreamOpenRawResource);
                    if (str != null) {
                        StringBuilder sb = new StringBuilder("'");
                        sb.append(str);
                        sb.append('\'');
                        string2 = sb.toString();
                    } else {
                        string2 = "undefined";
                    }
                    String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(strB, "<<injectedVideoId>>", string2, false, 4, (Object) null), "<<injectedPlayerVars>>", getorcreatecameraxinstancelambda18lambda17lambda16lambda15TuitionPaymentFragmentbindingInflater2.toString(), false, 4, (Object) null);
                    String string3 = getorcreatecameraxinstancelambda18lambda17lambda16lambda15TuitionPaymentFragmentbindingInflater2.b.getString("origin");
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    webViewYouTubePlayer.loadDataWithBaseURL(string3, strReplace$default, "text/html", "utf-8", null);
                    webViewYouTubePlayer.setWebChromeClient(webViewYouTubePlayer.new b());
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            };
            legacyYouTubePlayerView.TuitionPaymentFragmentbindingInflater1 = function0;
            if (z2) {
                return;
            }
            function0.invoke();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public /* synthetic */ YouTubePlayerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements accesssetCameraX {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // defpackage.accesssetCameraX
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(function0, "");
            if (YouTubePlayerView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isEmpty()) {
                throw new IllegalStateException("To enter fullscreen you need to first register a FullscreenListener.");
            }
            Iterator it = YouTubePlayerView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.iterator();
            while (it.hasNext()) {
                ((accesssetCameraX) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, function0);
            }
        }

        @Override // defpackage.accesssetCameraX
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            if (YouTubePlayerView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isEmpty()) {
                throw new IllegalStateException("To enter fullscreen you need to first register a FullscreenListener.");
            }
            Iterator it = YouTubePlayerView.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.iterator();
            while (it.hasNext()) {
                ((accesssetCameraX) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        }
    }

    public final boolean getEnableAutomaticInitialization() {
        return this.enableAutomaticInitialization;
    }

    public final void setEnableAutomaticInitialization(boolean z) {
        this.enableAutomaticInitialization = z;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends accesssetMCameraXConfigProviderp {
        private /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ YouTubePlayerView b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, YouTubePlayerView youTubePlayerView, boolean z) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.b = youTubePlayerView;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
        }

        @Override // defpackage.accesssetMCameraXConfigProviderp, defpackage.setContext
        public final void TuitionPaymentFragmentbindingInflater1(accessgetActiveConcurrentCameraInfos accessgetactiveconcurrentcamerainfos) {
            Intrinsics.checkNotNullParameter(accessgetactiveconcurrentcamerainfos, "");
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (str != null) {
                bindToLifecycle.TuitionPaymentFragmentbindingInflater1(accessgetactiveconcurrentcamerainfos, this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, str, 0.0f);
            }
            accessgetactiveconcurrentcamerainfos.TuitionPaymentFragmentbindingInflater1(this);
        }
    }

    public final void setCustomPlayerUi(View p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setCustomPlayerUi(p0);
    }

    @Override // androidx.p002lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner p0, Lifecycle.Event p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        int i = YouTubePlayerView$TuitionPaymentFragmentbindingInflater1$WhenMappings.$EnumSwitchMapping$0[p1.ordinal()];
        if (i == 1) {
            LegacyYouTubePlayerView legacyYouTubePlayerView = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            legacyYouTubePlayerView.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            legacyYouTubePlayerView.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            return;
        }
        if (i == 2) {
            LegacyYouTubePlayerView legacyYouTubePlayerView2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            legacyYouTubePlayerView2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            legacyYouTubePlayerView2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
            legacyYouTubePlayerView2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
            return;
        }
        if (i != 3) {
            return;
        }
        LegacyYouTubePlayerView legacyYouTubePlayerView3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        setCameraX setcamerax = legacyYouTubePlayerView3.b;
        ConnectivityManager.NetworkCallback networkCallback = setcamerax.b;
        if (networkCallback != null) {
            Object systemService = setcamerax.TuitionPaymentFragmentbindingInflater1.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "");
            ((ConnectivityManager) systemService).unregisterNetworkCallback(networkCallback);
            setcamerax.TuitionPaymentFragmentspecialinlinedviewModeldefault1.clear();
            setcamerax.b = null;
            setcamerax.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        }
        legacyYouTubePlayerView3.removeView(legacyYouTubePlayerView3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        legacyYouTubePlayerView3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.removeAllViews();
        legacyYouTubePlayerView3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.destroy();
    }
}
