package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.measurement.internal.zzu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MediaControllerCompatMediaControllerImplApi23 {
    private static final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Object();
    public play TuitionPaymentFragmentbindingInflater1;
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Map<String, prepareFromMediaId> b;

    public MediaControllerCompatMediaControllerImplApi23(Drawable.Callback callback, String str, play playVar, Map<String, prepareFromMediaId> map) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (str2.charAt(str2.length() - 1) != '/') {
                StringBuilder sb = new StringBuilder();
                sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                sb.append('/');
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sb.toString();
            }
        }
        if (!(callback instanceof View)) {
            onSetCaptioningEnabled.b("LottieDrawable must be inside of a view for images to work.");
            this.b = new HashMap();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ((View) callback).getContext();
            this.b = map;
            this.TuitionPaymentFragmentbindingInflater1 = playVar;
        }
    }

    public final Bitmap b(String str) {
        prepareFromMediaId preparefrommediaid = this.b.get(str);
        if (preparefrommediaid == null) {
            return null;
        }
        Bitmap bitmap = preparefrommediaid.b;
        if (bitmap != null) {
            return bitmap;
        }
        play playVar = this.TuitionPaymentFragmentbindingInflater1;
        if (playVar != null) {
            Bitmap bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault3 = playVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            if (bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            return bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        String str2 = preparefrommediaid.TuitionPaymentFragmentbindingInflater1;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        int length = 0;
        if (str2.startsWith("data:") && str2.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException e2) {
                onSetCaptioningEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3("data URL did not have correct base64 format.", e2);
                return null;
            }
        }
        if (str != null) {
            try {
                length = str.length();
            } catch (IOException e3) {
                onSetCaptioningEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Unable to open asset.", e3);
                return null;
            }
        }
        if (zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ArrayList()) != 0) {
            int[] iArr = new int[length];
            int i = length - 1;
            iArr[i] = 1;
            Toast.makeText((Context) null, iArr[((length * i) % 2) - 1], 1).show();
        }
        if (TextUtils.isEmpty(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        }
        AssetManager assets = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getAssets();
        StringBuilder sb = new StringBuilder();
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(str2);
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, onSkipToPrevious.b(BitmapFactory.decodeStream(assets.open(sb.toString()), null, options), preparefrommediaid.TuitionPaymentFragmentspecialinlinedviewModeldefault1, preparefrommediaid.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    private Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, Bitmap bitmap) {
        synchronized (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.b.get(str).b = bitmap;
        }
        return bitmap;
    }
}
