package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\n\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R&\u0010\u0014\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016"}, d2 = {"LunregisterLifecycle;", "", "Landroid/view/View;", "p0", "", "LsetInactive;", "p1", "<init>", "(Landroid/view/View;Ljava/util/List;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Z", "b", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "I", "Ljava/util/List;", "Lkotlin/Pair;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Pair;", "Landroid/view/View;"}, k = 1, mv = {2, 3, 0})
public final class unregisterLifecycle {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final List<setInactive> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    final View TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private boolean b = true;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1;
    Pair<Boolean, Boolean> TuitionPaymentFragmentbindingInflater1 = new Pair<>(null, null);

    /* JADX WARN: Multi-variable type inference failed */
    public unregisterLifecycle(View view, List<? extends setInactive> list) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = view;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int size = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size();
        for (int i = 0; i < size; i++) {
            setInactive setinactive = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i);
            if (setinactive.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                this.b = true;
                View view = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (view instanceof EditText) {
                    if (i == this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size() - 1 && ((EditText) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2).getError() != null) {
                        ((EditText) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2).setError(null);
                    }
                } else if (view instanceof TextInputLayout) {
                    if (i == this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size() - 1 && ((TextInputLayout) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2).getError() != null) {
                        ((TextInputLayout) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2).setError(null);
                    }
                } else if ((view instanceof createLifecycleCamera) && i == this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size() - 1 && ((createLifecycleCamera) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b()) {
                }
            } else {
                this.b = false;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setinactive.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                KeyEvent.Callback callback = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (!(callback instanceof EditText)) {
                    if (!(callback instanceof TextInputLayout)) {
                        if (!(callback instanceof createLifecycleCamera)) {
                            break;
                        }
                        break;
                    }
                    ((TextInputLayout) callback).setError(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    break;
                }
                ((EditText) callback).setError(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                break;
            }
        }
        this.TuitionPaymentFragmentbindingInflater1 = new Pair<>(Boolean.valueOf(this.b), Pair.copy$default(this.TuitionPaymentFragmentbindingInflater1, null, null, 3, null).getFirst());
        return this.b;
    }
}
