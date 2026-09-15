package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.TypedValue;
import com.bpjstku.R;
import com.google.android.libraries.places.api.model.Place;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"LAutoValue_MediaSpecBuilder;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;I)I", "Lcom/google/android/libraries/places/api/model/Place;", "b", "(Landroid/content/Context;Lcom/google/android/libraries/places/api/model/Place;)I", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;)Z"}, k = 1, mv = {2, 3, 0})
public final class AutoValue_MediaSpecBuilder {
    public static final AutoValue_MediaSpecBuilder INSTANCE = new AutoValue_MediaSpecBuilder();

    private AutoValue_MediaSpecBuilder() {
    }

    public static int b(Context p0, Place p1) {
        String packageName = p0.getPackageName();
        List<Place.Type> types = p1.getTypes();
        if (types == null) {
            return R.drawable.ic_map_marker_black_24dp;
        }
        Iterator<Place.Type> it = types.iterator();
        while (it.hasNext()) {
            String strName = it.next().name();
            Locale locale = Locale.ENGLISH;
            Intrinsics.checkExpressionValueIsNotNull(locale, "");
            if (strName == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strName.toLowerCase(locale);
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "");
            int identifier = p0.getResources().getIdentifier("ic_places_".concat(String.valueOf(lowerCase)), "drawable", packageName);
            if (identifier > 0) {
                return identifier;
            }
        }
        return R.drawable.ic_map_marker_black_24dp;
    }

    public static int TuitionPaymentFragmentbindingInflater1(Context p0, int p1) {
        TypedValue typedValue = new TypedValue();
        p0.getTheme().resolveAttribute(R.attr.colorPrimarySurface, typedValue, true);
        return typedValue.data;
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0) {
        Resources resources = p0.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkExpressionValueIsNotNull(configuration, "");
        return (configuration.uiMode & 48) == 32;
    }
}
