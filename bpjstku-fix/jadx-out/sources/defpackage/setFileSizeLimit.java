package defpackage;

import android.app.Activity;
import com.bpjstku.R;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.listener.single.BasePermissionListener;
import com.karumi.dexter.listener.single.CompositePermissionListener;
import com.karumi.dexter.listener.single.DialogOnDeniedPermissionListener;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"LsetFileSizeLimit;", "", "<init>", "()V", "Landroid/app/Activity;", "p0", "Lcom/karumi/dexter/listener/single/BasePermissionListener;", "p1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/app/Activity;Lcom/karumi/dexter/listener/single/BasePermissionListener;)V"}, k = 1, mv = {2, 3, 0})
public final class setFileSizeLimit {
    public static final setFileSizeLimit INSTANCE = new setFileSizeLimit();

    private setFileSizeLimit() {
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Activity p0, BasePermissionListener p1) {
        Dexter.withActivity(p0).withPermission("android.permission.ACCESS_FINE_LOCATION").withListener(new CompositePermissionListener(DialogOnDeniedPermissionListener.Builder.withContext(p0).withTitle(R.string.permission_fine_location_title).withMessage(R.string.permission_fine_location_message).withButtonText(android.R.string.ok).withIcon(R.drawable.ic_map_marker_radius_black_24dp).build(), p1)).check();
    }
}
