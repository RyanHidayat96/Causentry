package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes.dex */
public class onConnectionSuspended extends AppCompatDialogFragment {
    public static onConnectionSuspended b() {
        return new onConnectionSuspended();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.layout_midtrans_progress, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        if (getArguments() != null && (string = getArguments().getString("dialog.message")) != null && !TextUtils.isEmpty(string)) {
            ((TextView) view.findViewById(R.id.progress_bar_message)).setText(string);
        }
        getHumanReadableName.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3<? extends getHumanReadableName.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3<?>> tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = calculateInvertedTextureTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2((ImageView) view.findViewById(R.id.progress_bar_image));
        StringBuilder sb = new StringBuilder();
        FragmentActivity activity = getActivity();
        StringBuilder sb2 = new StringBuilder("android.resource://");
        sb2.append(activity.getPackageName());
        sb2.append("/");
        sb.append(sb2.toString());
        sb.append(R.drawable.midtrans_loader);
        tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(sb.toString());
    }
}
