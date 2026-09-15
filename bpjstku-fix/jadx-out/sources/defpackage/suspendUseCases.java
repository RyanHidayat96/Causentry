package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class suspendUseCases {

    public static final class TuitionPaymentFragmentbindingInflater1 implements TextWatcher {
        private /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public TuitionPaymentFragmentbindingInflater1(Function1 function1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(String.valueOf(editable));
        }
    }

    public static final void b(View view) {
        view.setEnabled(true);
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view) {
        view.setEnabled(false);
    }

    public static final void TuitionPaymentFragmentbindingInflater1(View view) {
        view.setVisibility(0);
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view) {
        view.setVisibility(8);
    }

    public static final class b implements TextWatcher {
        private /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public b(Function1 function1) {
            this.TuitionPaymentFragmentbindingInflater1 = function1;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            this.TuitionPaymentFragmentbindingInflater1.invoke(String.valueOf(editable));
        }
    }
}
