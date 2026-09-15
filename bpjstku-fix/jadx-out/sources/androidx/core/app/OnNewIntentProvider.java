package androidx.core.app;

import android.content.Intent;
import androidx.core.util.Consumer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\b\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/core/app/OnNewIntentProvider;", "", "Landroidx/core/util/Consumer;", "Landroid/content/Intent;", "p0", "", "addOnNewIntentListener", "(Landroidx/core/util/Consumer;)V", "removeOnNewIntentListener"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface OnNewIntentProvider {
    void addOnNewIntentListener(Consumer<Intent> p0);

    void removeOnNewIntentListener(Consumer<Intent> p0);
}
