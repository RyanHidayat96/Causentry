package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ProcessCameraProviderExternalSyntheticLambda0 implements accessgetActiveConcurrentCameraInfos {
    public final Handler TuitionPaymentFragmentbindingInflater1;
    public final Set<setContext> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final WebView b;

    public ProcessCameraProviderExternalSyntheticLambda0(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "");
        this.b = webView;
        this.TuitionPaymentFragmentbindingInflater1 = new Handler(Looper.getMainLooper());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new LinkedHashSet();
    }

    @Override // defpackage.accessgetActiveConcurrentCameraInfos
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, "loadVideo", str, Float.valueOf(f));
    }

    @Override // defpackage.accessgetActiveConcurrentCameraInfos
    public final void TuitionPaymentFragmentbindingInflater1(String str, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, "cueVideo", str, Float.valueOf(f));
    }

    @Override // defpackage.accessgetActiveConcurrentCameraInfos
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, "pauseVideo", new Object[0]);
    }

    @Override // defpackage.accessgetActiveConcurrentCameraInfos
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(setContext setcontext) {
        Intrinsics.checkNotNullParameter(setcontext, "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(setcontext);
    }

    @Override // defpackage.accessgetActiveConcurrentCameraInfos
    public final boolean TuitionPaymentFragmentbindingInflater1(setContext setcontext) {
        Intrinsics.checkNotNullParameter(setcontext, "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remove(setcontext);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final WebView webView, final String str, Object... objArr) {
        String string;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (obj instanceof String) {
                StringBuilder sb = new StringBuilder("'");
                sb.append(obj);
                sb.append('\'');
                string = sb.toString();
            } else {
                string = obj.toString();
            }
            arrayList.add(string);
        }
        final ArrayList arrayList2 = arrayList;
        this.TuitionPaymentFragmentbindingInflater1.post(new Runnable() { // from class: ProcessCameraProviderExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                WebView webView2 = webView;
                String str2 = str;
                List list = arrayList2;
                Intrinsics.checkNotNullParameter(webView2, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(list, "");
                StringBuilder sb2 = new StringBuilder("javascript:");
                sb2.append(str2);
                sb2.append('(');
                sb2.append(CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null));
                sb2.append(')');
                webView2.loadUrl(sb2.toString());
            }
        });
    }
}
