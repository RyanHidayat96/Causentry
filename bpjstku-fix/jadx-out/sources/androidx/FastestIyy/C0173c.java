package androidx.FastestIyy;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.FastestIyy.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C0173c extends ContentObserver {
    public C0173c(Handler handler) {
        super(handler);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        try {
            super.onChange(z, uri);
            Objects.toString(uri);
            ((i0) i0.a()).b("com.zimperium.zdetection.android_settings_updated", "{}");
        } catch (Exception unused) {
        }
    }
}
