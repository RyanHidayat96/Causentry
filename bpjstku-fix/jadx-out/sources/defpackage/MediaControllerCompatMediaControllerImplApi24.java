package defpackage;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaControllerCompatMediaControllerImplApi24 {
    public playFromMediaId TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final AssetManager TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final MediaControllerCompatTransportControls<String> g = new MediaControllerCompatTransportControls<>();
    public final Map<MediaControllerCompatTransportControls<String>, Typeface> TuitionPaymentFragmentbindingInflater1 = new HashMap();
    public final Map<String, Typeface> b = new HashMap();
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ".ttf";

    public MediaControllerCompatMediaControllerImplApi24(Drawable.Callback callback, playFromMediaId playfrommediaid) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = playfrommediaid;
        if (!(callback instanceof View)) {
            onSetCaptioningEnabled.b("LottieDrawable must be inside of a view for images to work.");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ((View) callback).getContext().getAssets();
        }
    }
}
