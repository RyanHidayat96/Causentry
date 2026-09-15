package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ExtendableBuilder implements Camera<Uri, Drawable> {
    public static final isMirroring<Resources.Theme> b = isMirroring.TuitionPaymentFragmentspecialinlinedviewModeldefault3("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.Camera
    public final /* synthetic */ Resource<Drawable> TuitionPaymentFragmentbindingInflater1(Uri uri, int i, int i2, getTargetRotation gettargetrotation) throws IOException {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(uri, gettargetrotation);
    }

    @Override // defpackage.Camera
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(Uri uri, getTargetRotation gettargetrotation) throws IOException {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    public ExtendableBuilder(Context context) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context.getApplicationContext();
    }

    public final Resource<Drawable> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Uri uri, getTargetRotation gettargetrotation) {
        Resources.Theme theme;
        Drawable drawableTuitionPaymentFragmentbindingInflater1;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            StringBuilder sb = new StringBuilder("Package name for ");
            sb.append(uri);
            sb.append(" is null or empty");
            throw new IllegalStateException(sb.toString());
        }
        Context contextTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(uri, authority);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextTuitionPaymentFragmentspecialinlinedviewModeldefault3, uri);
        if (authority != null) {
            if (authority.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getPackageName())) {
                isMirroring<Resources.Theme> ismirroring = b;
                theme = (Resources.Theme) (gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.containsKey(ismirroring) ? gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(ismirroring) : ismirroring.b);
            } else {
                theme = null;
            }
            if (theme != null) {
                Context context = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                drawableTuitionPaymentFragmentbindingInflater1 = ExperimentalMirrorMode.TuitionPaymentFragmentbindingInflater1(context, context, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, theme);
            } else {
                drawableTuitionPaymentFragmentbindingInflater1 = ExperimentalMirrorMode.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, contextTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
            }
            return ExperimentalLensFacing.TuitionPaymentFragmentspecialinlinedviewModeldefault1(drawableTuitionPaymentFragmentbindingInflater1);
        }
        throw new NullPointerException("Argument must not be null");
    }

    private Context TuitionPaymentFragmentspecialinlinedviewModeldefault3(Uri uri, String str) {
        if (str.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getPackageName())) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        try {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            if (str.contains(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getPackageName())) {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: ".concat(String.valueOf(uri)), e2);
        }
    }

    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 2) {
            if (pathSegments.size() == 1) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(uri);
            }
            throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(uri)));
        }
        List<String> pathSegments2 = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments2.get(0);
        String str2 = pathSegments2.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: ".concat(String.valueOf(uri)));
    }

    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e2) {
            throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(uri)), e2);
        }
    }
}
