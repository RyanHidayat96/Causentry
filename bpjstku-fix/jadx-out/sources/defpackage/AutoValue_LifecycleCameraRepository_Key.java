package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoValue_LifecycleCameraRepository_Key {
    public static final void b(Context context, String str) {
        new AlertDialog.Builder(context).setMessage(str).setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: AutoValue_LifecycleCameraRepository_Key.2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).show();
    }
}
