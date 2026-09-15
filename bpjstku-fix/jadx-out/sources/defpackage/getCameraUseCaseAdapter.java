package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.bpjstku.R;
import com.kennyc.view.MultiStateView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class getCameraUseCaseAdapter {
    public static final void TuitionPaymentFragmentbindingInflater1(MultiStateView multiStateView, String str, String str2, Drawable drawable, Pair<String, ? extends Function0<Unit>> pair) {
        multiStateView.setViewState(MultiStateView.ViewState.ERROR);
        if (str != null) {
            View viewTuitionPaymentFragmentbindingInflater1 = multiStateView.TuitionPaymentFragmentbindingInflater1(MultiStateView.ViewState.ERROR);
            TextView textView = viewTuitionPaymentFragmentbindingInflater1 != null ? (TextView) viewTuitionPaymentFragmentbindingInflater1.findViewById(R.id.tv_error) : null;
            if (textView != null) {
                textView.setText(str);
            }
        }
    }
}
