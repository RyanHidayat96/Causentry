package defpackage;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import com.bpjstku.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bind {
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageView imageView, Context context, String str, int i, int i2, boolean z) {
        Activity activity = (Activity) (!(context instanceof Activity) ? null : context);
        if (activity == null || !(activity.isDestroyed() || activity.isFinishing())) {
            RequestOptions requestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new RequestOptions().TuitionPaymentFragmentbindingInflater1(R.drawable.ic_placeholder).TuitionPaymentFragmentspecialinlinedviewModeldefault2(R.drawable.ic_placeholder);
            Intrinsics.checkExpressionValueIsNotNull(requestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
            Glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context).TuitionPaymentFragmentspecialinlinedviewModeldefault2(str).apply(requestOptionsTuitionPaymentFragmentspecialinlinedviewModeldefault2).into(imageView);
        }
    }
}
