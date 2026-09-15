package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getImageAnalysisBackpressureStrategy<E, C extends Collection<? extends E>, B> extends getImageAnalysisOutputImageFormat<E, C, B> {
    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Iterator TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.checkNotNullParameter(collection, "");
        return collection.iterator();
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int b(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.checkNotNullParameter(collection, "");
        return collection.size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getImageAnalysisBackpressureStrategy(videoProfileHdrFormatsToDynamicRangeEncoding<E> videoprofilehdrformatstodynamicrangeencoding) {
        super(videoprofilehdrformatstodynamicrangeencoding, null);
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
    }
}
