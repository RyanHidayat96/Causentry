package defpackage;

import android.content.Context;
import com.bpjstku.domain.vocation.model.TrainingField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0005\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"LexcludeProblematicOutputSizesByClass;", "LsendQueue;", "Lcom/bpjstku/domain/vocation/model/TrainingField;", "Landroid/content/Context;", "p0", "", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class excludeProblematicOutputSizesByClass extends sendQueue<TrainingField> {
    @Override // defpackage.sendQueue
    public final /* synthetic */ String b(TrainingField trainingField) {
        TrainingField trainingField2 = trainingField;
        Intrinsics.checkNotNullParameter(trainingField2, "");
        return trainingField2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public /* synthetic */ excludeProblematicOutputSizesByClass(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private excludeProblematicOutputSizesByClass(Context context, List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<TrainingField>> list, Function1<? super TrainingField, Unit> function1) {
        super(context, list, function1);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
    }
}
