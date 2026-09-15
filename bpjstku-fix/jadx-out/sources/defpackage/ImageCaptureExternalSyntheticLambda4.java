package defpackage;

import com.datadog.android.core.internal.logger.LogcatLogHandler$1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B*\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0019\b\u0002\u0010\b\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nR%\u0010\r\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"LImageCaptureExternalSyntheticLambda4;", "", "", "p0", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "", "p1", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "b", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ImageCaptureExternalSyntheticLambda4 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    final Function1<Integer, Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX WARN: Multi-variable type inference failed */
    public ImageCaptureExternalSyntheticLambda4(String str, Function1<? super Integer, Boolean> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
    }

    public /* synthetic */ ImageCaptureExternalSyntheticLambda4(String str, LogcatLogHandler$1 logcatLogHandler$1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new Function1<Integer, Boolean>() { // from class: com.datadog.android.core.internal.logger.LogcatLogHandler$1
            public final Boolean b(int i2) {
                return Boolean.TRUE;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Boolean invoke(Integer num) {
                return b(num.intValue());
            }
        } : logcatLogHandler$1);
    }
}
