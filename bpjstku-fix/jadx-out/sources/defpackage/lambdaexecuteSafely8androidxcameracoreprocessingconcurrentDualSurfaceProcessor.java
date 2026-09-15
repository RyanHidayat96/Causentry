package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LlambdaexecuteSafely8androidxcameracoreprocessingconcurrentDualSurfaceProcessor;", "", "<init>", "()V"}, k = 1, mv = {1, 4, 0})
public final class lambdaexecuteSafely8androidxcameracoreprocessingconcurrentDualSurfaceProcessor {
    public static final lambdaexecuteSafely8androidxcameracoreprocessingconcurrentDualSurfaceProcessor INSTANCE = new lambdaexecuteSafely8androidxcameracoreprocessingconcurrentDualSurfaceProcessor();

    private lambdaexecuteSafely8androidxcameracoreprocessingconcurrentDualSurfaceProcessor() {
    }

    public static /* synthetic */ DualSurfaceProcessorExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, lambdaonOutputSurface2androidxcameracoreprocessingconcurrentDualSurfaceProcessor lambdaonoutputsurface2androidxcameracoreprocessingconcurrentdualsurfaceprocessor, List list, long j, long j2) {
        lambdarelease4androidxcameracoreprocessingconcurrentDualSurfaceProcessor lambdarelease4androidxcameracoreprocessingconcurrentdualsurfaceprocessor = lambdarelease4androidxcameracoreprocessingconcurrentDualSurfaceProcessor.INSTANCE;
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdarelease4androidxcameracoreprocessingconcurrentDualSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        lambdarelease4androidxcameracoreprocessingconcurrentDualSurfaceProcessor lambdarelease4androidxcameracoreprocessingconcurrentdualsurfaceprocessor2 = lambdarelease4androidxcameracoreprocessingconcurrentDualSurfaceProcessor.INSTANCE;
        long jTuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdarelease4androidxcameracoreprocessingconcurrentDualSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        DualSurfaceProcessorExternalSyntheticLambda6 dualSurfaceProcessorExternalSyntheticLambda6 = new DualSurfaceProcessorExternalSyntheticLambda6();
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.lyft.kronos.shared_preferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        return lambdaonOutputSurface3androidxcameracoreprocessingconcurrentDualSurfaceProcessor.b(dualSurfaceProcessorExternalSyntheticLambda6, new DualSurfaceProcessorExternalSyntheticLambda5(sharedPreferences), lambdaonoutputsurface2androidxcameracoreprocessingconcurrentdualsurfaceprocessor, list, jTuitionPaymentFragmentspecialinlinedviewModeldefault2, j, j2, jTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }
}
