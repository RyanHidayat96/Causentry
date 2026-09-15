package defpackage;

import android.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class TextureViewImplementation1ExternalSyntheticLambda0 {

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends DialogFragment implements DialogInterface.OnClickListener {
        @Override // androidx.fragment.app.DialogFragment
        public Dialog onCreateDialog(Bundle bundle) {
            FragmentActivity activity = getActivity();
            Bundle arguments = getArguments();
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle(arguments.getString("de.greenrobot.eventbus.errordialog.title"));
            builder.setMessage(arguments.getString("de.greenrobot.eventbus.errordialog.message"));
            builder.setPositiveButton(R.string.ok, this);
            return builder.create();
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            FragmentActivity activity = getActivity();
            if (!getArguments().getBoolean("de.greenrobot.eventbus.errordialog.finish_after_dialog", false) || activity == null) {
                return;
            }
            activity.finish();
        }
    }
}
