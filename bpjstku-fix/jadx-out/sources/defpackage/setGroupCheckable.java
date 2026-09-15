package defpackage;

import android.webkit.DownloadListener;
import com.bpjstku.databinding.ActivityWebViewIctBinding;
import com.bpjstku.presentation.ict.WebViewIctActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setGroupCheckable implements DownloadListener {
    private /* synthetic */ WebViewIctActivity TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private /* synthetic */ ActivityWebViewIctBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public /* synthetic */ setGroupCheckable(WebViewIctActivity webViewIctActivity, ActivityWebViewIctBinding activityWebViewIctBinding) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = webViewIctActivity;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = activityWebViewIctBinding;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        reverseSize.b[0] = reverseSizeF.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0];
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        WebViewIctActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, str, str2, str4);
    }
}
