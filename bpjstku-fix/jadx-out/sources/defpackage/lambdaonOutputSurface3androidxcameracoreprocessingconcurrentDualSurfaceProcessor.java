package defpackage;

import com.lyft.kronos.internal.ntp.SntpClient;
import com.lyft.kronos.internal.ntp.SntpServiceImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"LlambdaonOutputSurface3androidxcameracoreprocessingconcurrentDualSurfaceProcessor;", "", "<init>", "()V", "LlambdainitGlRenderer5androidxcameracoreprocessingconcurrentDualSurfaceProcessor;", "p0", "LDualSurfaceProcessorExternalSyntheticLambda2;", "p1", "LlambdaonOutputSurface2androidxcameracoreprocessingconcurrentDualSurfaceProcessor;", "p2", "", "", "p3", "", "p4", "p5", "p6", "p7", "LDualSurfaceProcessorExternalSyntheticLambda0;", "b", "(LlambdainitGlRenderer5androidxcameracoreprocessingconcurrentDualSurfaceProcessor;LDualSurfaceProcessorExternalSyntheticLambda2;LlambdaonOutputSurface2androidxcameracoreprocessingconcurrentDualSurfaceProcessor;Ljava/util/List;JJJJ)LDualSurfaceProcessorExternalSyntheticLambda0;"}, k = 1, mv = {1, 4, 0})
public final class lambdaonOutputSurface3androidxcameracoreprocessingconcurrentDualSurfaceProcessor {
    public static final lambdaonOutputSurface3androidxcameracoreprocessingconcurrentDualSurfaceProcessor INSTANCE = new lambdaonOutputSurface3androidxcameracoreprocessingconcurrentDualSurfaceProcessor();

    private lambdaonOutputSurface3androidxcameracoreprocessingconcurrentDualSurfaceProcessor() {
    }

    @JvmStatic
    public static final DualSurfaceProcessorExternalSyntheticLambda0 b(lambdainitGlRenderer5androidxcameracoreprocessingconcurrentDualSurfaceProcessor p0, DualSurfaceProcessorExternalSyntheticLambda2 p1, lambdaonOutputSurface2androidxcameracoreprocessingconcurrentDualSurfaceProcessor p2, List<String> p3, long p4, long p5, long p6, long p7) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p3, "");
        if (p0 instanceof DualSurfaceProcessorExternalSyntheticLambda0) {
            throw new IllegalArgumentException("Local clock should implement Clock instead of KronosClock");
        }
        return new DualSurfaceProcessorExternalSyntheticLambda4(new SntpServiceImpl(new SntpClient(p0, new DualSurfaceProcessorFactory(), new DualSurfaceProcessorExternalSyntheticLambda8()), p0, new DualSurfaceProcessorFactoryExternalSyntheticLambda0(p1, p0), p2, p3, p4, p5, p6, p7), p0);
    }
}
