package com.midtrans.sdk.uikit.widgets;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Toast;
import com.bpjstku.R;
import com.google.android.gms.common.internal.ImagesContract;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import defpackage.RotationProvider;

/* JADX INFO: loaded from: classes6.dex */
public class DefaultTextViewWithLink extends DefaultTextView {

    public class TuitionPaymentFragmentbindingInflater1 implements RotationProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        public TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // RotationProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
            ((ClipboardManager) DefaultTextViewWithLink.this.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(ImagesContract.URL, str));
            Toast.makeText(DefaultTextViewWithLink.this.getContext(), R.string.copied_to_clipboard, 0).show();
            return true;
        }
    }

    public DefaultTextViewWithLink(Context context) {
        super(context);
        TuitionPaymentFragmentbindingInflater1();
        RotationProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this).TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentbindingInflater1();
    }

    private void TuitionPaymentFragmentbindingInflater1() {
        int secondaryColor;
        MidtransSDK midtransSDK = MidtransSDK.getInstance();
        if (midtransSDK == null || midtransSDK.getColorTheme() == null || (secondaryColor = midtransSDK.getColorTheme().getSecondaryColor()) == 0) {
            return;
        }
        setLinkTextColor(secondaryColor);
    }

    public DefaultTextViewWithLink(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TuitionPaymentFragmentbindingInflater1();
        RotationProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this).TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentbindingInflater1();
    }

    public DefaultTextViewWithLink(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TuitionPaymentFragmentbindingInflater1();
        RotationProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this).TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentbindingInflater1();
    }
}
