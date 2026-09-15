package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class ExperimentalMirrorMode {
    private static volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;

    public static Drawable TuitionPaymentFragmentbindingInflater1(Context context, Context context2, int i, Resources.Theme theme) {
        Context context3;
        try {
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                if (theme != null) {
                    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, theme);
                    contextThemeWrapper.applyOverrideConfiguration(theme.getResources().getConfiguration());
                    context3 = contextThemeWrapper;
                } else {
                    context3 = context2;
                }
                return AppCompatResources.getDrawable(context3, i);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e2;
            }
            return ContextCompat.getDrawable(context2, i);
        } catch (NoClassDefFoundError unused2) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return ResourcesCompat.getDrawable(context2.getResources(), i, theme);
    }
}
