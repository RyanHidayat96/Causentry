package defpackage;

import android.text.Editable;
import android.text.InputFilter;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.FragmentManager;
import com.bpjstku.R;
import com.google.android.material.textfield.TextInputLayout;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class retrieveConcurrentCameraIds {
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "");
        editText.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(16)});
    }

    public static final Unit b(TextInputLayout textInputLayout, String str) {
        Intrinsics.checkNotNullParameter(textInputLayout, "");
        EditText editText = textInputLayout.getEditText();
        if (editText == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        editText.setText(str);
        return Unit.INSTANCE;
    }

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(TextInputLayout textInputLayout) {
        Editable text;
        String string;
        Intrinsics.checkNotNullParameter(textInputLayout, "");
        EditText editText = textInputLayout.getEditText();
        return (editText == null || (text = editText.getText()) == null || (string = text.toString()) == null) ? "" : string;
    }

    public static final void b(SearchView searchView, Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(searchView, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final acquireBuffer acquirebuffer = new acquireBuffer();
        searchView.setOnQueryTextListener(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(acquirebuffer, function1));
        searchView.setOnCloseListener(new SearchView.OnCloseListener() { // from class: getPairedConcurrentCameraId
            @Override // androidx.appcompat.widget.SearchView.OnCloseListener
            public final boolean onClose() {
                acquirebuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                return false;
            }
        });
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements SearchView.OnQueryTextListener {
        private /* synthetic */ Function1<String, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public final boolean onQueryTextSubmit(String str) {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(acquireBuffer acquirebuffer, Function1<? super String, Unit> function1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = acquirebuffer;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public final boolean onQueryTextChange(String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            String str2 = str;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                acquireBuffer acquirebuffer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                VideoRecordEventStart videoRecordEventStartObserveOn = VideoRecordEventStart.just(str).debounce(200L, TimeUnit.MILLISECONDS).subscribeOn(isSamsungJ2.b()).observeOn(dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1());
                final Function1<String, Unit> function1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                final Function1 function2 = new Function1() { // from class: setActiveConcurrentCameraInfos
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, (String) obj);
                    }
                };
                acquirebuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(videoRecordEventStartObserveOn.subscribe(new logToString() { // from class: shutdown
                    @Override // defpackage.logToString
                    public final void accept(Object obj) {
                        function2.invoke(obj);
                    }
                }));
                return true;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(null);
            return true;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, String str) {
            function1.invoke(str);
            return Unit.INSTANCE;
        }
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseActivity baseActivity, String str, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(baseActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = baseActivity.getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, "", str, string, function0, 96);
        FragmentManager supportFragmentManager = baseActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    public static final void TuitionPaymentFragmentbindingInflater1(BaseActivity baseActivity, String str, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(baseActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = baseActivity.getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, "", str, string, null, 96);
        FragmentManager supportFragmentManager = baseActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    public static final void TuitionPaymentFragmentbindingInflater1(BaseActivity baseActivity, String str, String str2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(baseActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = baseActivity.getString(R.string.action_ok);
        Intrinsics.checkNotNullExpressionValue(string, "");
        getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, "", str, string, function0, 96);
        FragmentManager supportFragmentManager = baseActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            getstringornullB.show(supportFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }
}
