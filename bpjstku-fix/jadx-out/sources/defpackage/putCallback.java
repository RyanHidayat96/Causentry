package defpackage;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "LocalImageLoader was intended to provide a method to overwrite the singleton ImageLoader in local compositions. In practice, it's not clear that `LocalImageLoader.provide` **does not** set the singleton ImageLoader. This can result in accidentally creating multiple ImageLoader instances if you use a combination of `LocalImageLoader.current` and `context.imageLoader`. To maximize performance, apps should create one ImageLoader or use `ImageLoader.newBuilder` to create new ImageLoaders that share the same resources.\n\nAdditionally, as a composition is at most scoped to an Activity, `LocalImageLoader.provide` encourages creating multiple ImageLoaders if the user creates multiple activities that use Compose.\n\nYou should migrate to `ImageLoaderFactory` to set the singleton ImageLoader and `LocalContext.current.imageLoader` to access the singleton ImageLoader in Compose. If you need to use a locally scoped ImageLoader it's recommended to use the `AsyncImage` and `rememberAsyncImagePainter` overloads that have an ImageLoader argument and pass the local ImageLoader as input.")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087@\u0018\u00002\u00020\u0001B\u001b\b\u0001\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0088\u0001\f\u0092\u0001\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002"}, d2 = {"LputCallback;", "", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LwriteToParcel;", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroidx/compose/runtime/ProvidableCompositionLocal;)Landroidx/compose/runtime/ProvidableCompositionLocal;", "b", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroidx/compose/runtime/ProvidableCompositionLocal;Landroidx/compose/runtime/Composer;)LwriteToParcel;", "delegate"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class putCallback {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ProvidableCompositionLocal<writeToParcel> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: Access modifiers changed from: private */
    public static ProvidableCompositionLocal<writeToParcel> TuitionPaymentFragmentspecialinlinedviewModeldefault1(ProvidableCompositionLocal<writeToParcel> providableCompositionLocal) {
        return providableCompositionLocal;
    }

    public static /* synthetic */ writeToParcel TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return null;
    }

    public static final writeToParcel TuitionPaymentFragmentspecialinlinedviewModeldefault2(ProvidableCompositionLocal<writeToParcel> providableCompositionLocal, Composer composer) {
        writeToParcel writetoparcel = (writeToParcel) composer.consume(providableCompositionLocal);
        return writetoparcel == null ? getDescription.TuitionPaymentFragmentbindingInflater1((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())) : writetoparcel;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof putCallback) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((putCallback) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }

    public final String toString() {
        ProvidableCompositionLocal<writeToParcel> providableCompositionLocal = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StringBuilder sb = new StringBuilder("ImageLoaderProvidableCompositionLocal(delegate=");
        sb.append(providableCompositionLocal);
        sb.append(')');
        return sb.toString();
    }
}
