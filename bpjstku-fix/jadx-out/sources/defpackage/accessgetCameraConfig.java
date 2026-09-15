package defpackage;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.nbs.validacion.RuleNotApplicableException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetCameraConfig {
    /* JADX WARN: Multi-variable type inference failed */
    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view) throws RuleNotApplicableException {
        if (view instanceof EditText) {
            String string = ((EditText) view).getText().toString();
            if (string != null) {
                return StringsKt.trim((CharSequence) string).toString();
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        if (view instanceof TextInputLayout) {
            EditText editText = ((TextInputLayout) view).getEditText();
            if (editText == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(editText, "");
            String string2 = editText.getText().toString();
            if (string2 != null) {
                return StringsKt.trim((CharSequence) string2).toString();
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        if (view instanceof unsuspendUseCases) {
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ((unsuspendUseCases) view).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            if (strTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                return StringsKt.trim((CharSequence) strTuitionPaymentFragmentspecialinlinedviewModeldefault3).toString();
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        throw new RuleNotApplicableException("this view is not applicable");
    }
}
