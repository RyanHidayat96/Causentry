package defpackage;

import android.content.Context;
import com.bpjstku.domain.general.model.CodeNamePair;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0005\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"LTrustedWebActivityServiceConnectionPoolBindToServiceAsyncTask;", "LMediaSessionCompatMediaSessionImplApi28;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "Landroid/content/Context;", "p0", "", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TrustedWebActivityServiceConnectionPoolBindToServiceAsyncTask extends MediaSessionCompatMediaSessionImplApi28<CodeNamePair> {
    @Override // defpackage.MediaSessionCompatMediaSessionImplApi28
    public final /* synthetic */ String TuitionPaymentFragmentbindingInflater1(CodeNamePair codeNamePair) {
        CodeNamePair codeNamePair2 = codeNamePair;
        Intrinsics.checkNotNullParameter(codeNamePair2, "");
        return codeNamePair2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi28
    public final /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, CodeNamePair codeNamePair) {
        CodeNamePair codeNamePair2 = codeNamePair;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(codeNamePair2, "");
        return StringsKt.contains((CharSequence) codeNamePair2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (CharSequence) str, true);
    }

    public /* synthetic */ TrustedWebActivityServiceConnectionPoolBindToServiceAsyncTask(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private TrustedWebActivityServiceConnectionPoolBindToServiceAsyncTask(Context context, List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<CodeNamePair>> list, Function1<? super CodeNamePair, Unit> function1) {
        super(context, list, function1);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
    }
}
