package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdacreateCameraSelectorById0 {
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ImageView imageView, Context context, String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2(context)) {
            RequestOptions requestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new RequestOptions().TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentbindingInflater1(i).TuitionPaymentFragmentspecialinlinedviewModeldefault2(i2);
            Intrinsics.checkNotNullExpressionValue(requestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
            Glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context).TuitionPaymentFragmentspecialinlinedviewModeldefault2(str).apply(requestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault2).into(imageView);
        }
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ImageView imageView, Context context, String str, Drawable drawable, Drawable drawable2) throws Throwable {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(drawable, "");
        Intrinsics.checkNotNullParameter(drawable2, "");
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2(context)) {
            RequestOptions requestOptionsTuitionPaymentFragmentbindingInflater1 = new RequestOptions().TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault1(drawable).TuitionPaymentFragmentbindingInflater1(drawable2);
            Intrinsics.checkNotNullExpressionValue(requestOptionsTuitionPaymentFragmentbindingInflater1, "");
            Glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context).TuitionPaymentFragmentspecialinlinedviewModeldefault2(str).apply(requestOptionsTuitionPaymentFragmentbindingInflater1).into(imageView);
        }
    }

    public static final void b(ImageView imageView, Context context, Bitmap bitmap, Drawable drawable, Drawable drawable2) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        Intrinsics.checkNotNullParameter(drawable, "");
        Intrinsics.checkNotNullParameter(drawable2, "");
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2(context)) {
            RequestOptions requestOptionsTuitionPaymentFragmentbindingInflater1 = new RequestOptions().TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault1(drawable).TuitionPaymentFragmentbindingInflater1(drawable2);
            Intrinsics.checkNotNullExpressionValue(requestOptionsTuitionPaymentFragmentbindingInflater1, "");
            Glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context).load(bitmap).apply(requestOptionsTuitionPaymentFragmentbindingInflater1).into(imageView);
        }
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
        }
        return true;
    }
}
