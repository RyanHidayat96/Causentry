package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class TemplateParamsOverride implements TextWatcher {
    private final String TuitionPaymentFragmentbindingInflater1;
    private final Locale TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final EditText TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f233a;
    private double asBinder;
    private final String b;
    private String g;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public TemplateParamsOverride(EditText editText, String str, Locale locale) {
        Intrinsics.checkNotNullParameter(editText, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = editText;
        this.f233a = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = locale;
        this.b = "id";
        this.TuitionPaymentFragmentbindingInflater1 = "ID";
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 20;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strValueOf = String.valueOf(editable);
        if (strValueOf.length() < this.f233a.length()) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setText(this.f233a);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setSelection(this.f233a.length());
            return;
        }
        if (Intrinsics.areEqual(strValueOf, this.f233a)) {
            this.asBinder = 0.0d;
            return;
        }
        String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(new Regex("[.]").replace(StringsKt.replace$default(strValueOf, this.f233a, "", false, 4, (Object) null), ""), " ", "", false, 4, (Object) null), StringsKt.trim((CharSequence) this.f233a).toString(), "", false, 4, (Object) null);
        if (Intrinsics.areEqual(strReplace$default, this.g) || strReplace$default.length() == 0) {
            return;
        }
        this.g = strReplace$default;
        Double doubleOrNull = StringsKt.toDoubleOrNull(strReplace$default);
        double dDoubleValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        currencyInstance.setMaximumFractionDigits(0);
        String str = currencyInstance.format(dDoubleValue);
        Intrinsics.checkNotNullExpressionValue(str, "");
        String strSubstring = str.substring(2, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        String str2 = this.f233a;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(strSubstring);
        String string = sb.toString();
        TemplateParamsOverride templateParamsOverride = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.removeTextChangedListener(templateParamsOverride);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setText(string);
        Double doubleOrNull2 = StringsKt.toDoubleOrNull(strReplace$default);
        this.asBinder = doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 0.0d;
        int length = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getText().length();
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (length <= i) {
            EditText editText = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            editText.setSelection(editText.getText().length());
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setSelection(i);
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addTextChangedListener(templateParamsOverride);
    }
}
