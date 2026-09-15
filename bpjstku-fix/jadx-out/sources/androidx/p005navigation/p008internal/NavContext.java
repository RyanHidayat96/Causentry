package androidx.p005navigation.p008internal;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/navigation/internal/NavContext;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "", "getResourceName", "(I)Ljava/lang/String;", "getApplication", "()Ljava/lang/Object;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavContext {
    private final Context context;

    public NavContext(Context context) {
        this.context = context;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getResourceName(int p0) {
        try {
            Context context = this.context;
            Intrinsics.checkNotNull(context);
            String resourceName = context.getResources().getResourceName(p0);
            Intrinsics.checkNotNull(resourceName);
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(p0);
        }
    }

    public final Object getApplication() {
        Context context = this.context;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        return null;
    }
}
