package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bpjstku.R;
import com.kennyc.view.MultiStateView;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Camera2CameraControlExternalSyntheticLambda0 {
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(MultiStateView multiStateView, Throwable th, String str, String str2, Drawable drawable, Pair<String, ? extends Function0<Unit>> pair) {
        Intrinsics.checkNotNullParameter(multiStateView, "");
        multiStateView.setViewState(MultiStateView.ViewState.ERROR);
        View viewTuitionPaymentFragmentbindingInflater1 = multiStateView.TuitionPaymentFragmentbindingInflater1(MultiStateView.ViewState.ERROR);
        TextView textView = viewTuitionPaymentFragmentbindingInflater1 != null ? (TextView) viewTuitionPaymentFragmentbindingInflater1.findViewById(R.id.tvMessage) : null;
        View viewTuitionPaymentFragmentbindingInflater2 = multiStateView.TuitionPaymentFragmentbindingInflater1(MultiStateView.ViewState.ERROR);
        ImageView imageView = viewTuitionPaymentFragmentbindingInflater2 != null ? (ImageView) viewTuitionPaymentFragmentbindingInflater2.findViewById(R.id.imgError) : null;
        View viewTuitionPaymentFragmentbindingInflater3 = multiStateView.TuitionPaymentFragmentbindingInflater1(MultiStateView.ViewState.ERROR);
        Button button = viewTuitionPaymentFragmentbindingInflater3 != null ? (Button) viewTuitionPaymentFragmentbindingInflater3.findViewById(R.id.btnError) : null;
        View viewTuitionPaymentFragmentbindingInflater4 = multiStateView.TuitionPaymentFragmentbindingInflater1(MultiStateView.ViewState.ERROR);
        if (viewTuitionPaymentFragmentbindingInflater4 != null) {
        }
        if ((th instanceof IOException) || (th instanceof SocketTimeoutException)) {
            if (textView != null) {
                textView.setText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.error_no_internet));
            }
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (imageView != null) {
                imageView.setImageDrawable(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getResources().getDrawable(R.drawable.ic_info_blue));
            }
        } else if (str2 != null && textView != null) {
            textView.setText(str2);
        }
        if (pair != null) {
            if (button != null) {
                button.setVisibility(0);
            }
            if (button != null) {
                button.setText(pair.getFirst());
            }
            if (button != null) {
                button.setOnClickListener(new isBound(new setCaptureRequestOptions(pair)));
            }
        }
    }

    public static final void TuitionPaymentFragmentbindingInflater1(MultiStateView multiStateView, String str, Drawable drawable, String str2) {
        Intrinsics.checkNotNullParameter(multiStateView, "");
        multiStateView.setViewState(MultiStateView.ViewState.EMPTY);
        if (str != null) {
            View viewTuitionPaymentFragmentbindingInflater1 = multiStateView.TuitionPaymentFragmentbindingInflater1(MultiStateView.ViewState.EMPTY);
            TextView textView = viewTuitionPaymentFragmentbindingInflater1 != null ? (TextView) viewTuitionPaymentFragmentbindingInflater1.findViewById(R.id.tvMessage) : null;
            if (textView != null) {
                textView.setText(str);
            }
        }
    }
}
