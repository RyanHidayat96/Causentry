package androidx.compose.ui.autofill;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"", "p0", "Landroidx/compose/ui/autofill/ContentDataType;", "ContentDataType", "(I)Landroidx/compose/ui/autofill/ContentDataType;", "getDataType", "(Landroidx/compose/ui/autofill/ContentDataType;)I", "dataType"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ContentDataType_androidKt {
    public static final ContentDataType ContentDataType(int i) {
        return AndroidContentDataType.m3720boximpl(AndroidContentDataType.m3721constructorimpl(i));
    }

    public static final int getDataType(ContentDataType contentDataType) {
        Intrinsics.checkNotNull(contentDataType, "");
        return ((AndroidContentDataType) contentDataType).m3726unboximpl();
    }
}
