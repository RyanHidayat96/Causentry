package defpackage;

import androidx.p002lifecycle.Observer;
import com.bpjstku.presentation.vocational.VocationalBannerActivity;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class isOnePlus6 implements Observer {
    private /* synthetic */ VocationalBannerActivity b;

    public /* synthetic */ isOnePlus6(VocationalBannerActivity vocationalBannerActivity) {
        this.b = vocationalBannerActivity;
    }

    @Override // androidx.p002lifecycle.Observer
    public final void onChanged(Object obj) {
        VocationalBannerActivity.b(this.b, (VirtualCameraAdapter1) obj);
    }
}
