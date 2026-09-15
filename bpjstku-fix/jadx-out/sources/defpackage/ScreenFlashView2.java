package defpackage;

import com.google.android.gms.internal.mlkit_vision_face.zzee;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class ScreenFlashView2 extends animateToFullOpacity {
    @Override // defpackage.animateToFullOpacity
    public final orientationToSurfaceRotation TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        return new ScreenFlashView1ExternalSyntheticLambda0(false, new RandomAccessFile(new File(surfaceViewImplementationExternalSyntheticLambda1.toString()), "r"));
    }

    @Override // defpackage.animateToFullOpacity
    public final orientationToSurfaceRotation TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, boolean z, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        if (z && z2) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.".toString());
        }
        if (z) {
            a(surfaceViewImplementationExternalSyntheticLambda1);
        }
        if (z2) {
            d(surfaceViewImplementationExternalSyntheticLambda1);
        }
        return new ScreenFlashView1ExternalSyntheticLambda0(true, new RandomAccessFile(new File(surfaceViewImplementationExternalSyntheticLambda1.toString()), "rw"));
    }

    @Override // defpackage.animateToFullOpacity
    public final SurfaceViewImplementationApi24Impl TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        if (z) {
            a(surfaceViewImplementationExternalSyntheticLambda1);
        }
        Object[] objArr = {new File(surfaceViewImplementationExternalSyntheticLambda1.toString())};
        int iB = zzee.b();
        return (SurfaceViewImplementationApi24Impl) SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzee.b(), 892870984, zzee.b(), zzee.b(), -892870984, iB, objArr);
    }

    @Override // defpackage.animateToFullOpacity
    public final SurfaceViewImplementationApi24Impl TuitionPaymentFragmentspecialinlinedviewModeldefault1(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        if (z) {
            d(surfaceViewImplementationExternalSyntheticLambda1);
        }
        return SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new File(surfaceViewImplementationExternalSyntheticLambda1.toString()), true);
    }

    @Override // defpackage.animateToFullOpacity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = new File(surfaceViewImplementationExternalSyntheticLambda1.toString());
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete ".concat(String.valueOf(surfaceViewImplementationExternalSyntheticLambda1)));
        }
        if (z) {
            throw new FileNotFoundException("no such file: ".concat(String.valueOf(surfaceViewImplementationExternalSyntheticLambda1)));
        }
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    private final void d(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1) throws IOException {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(surfaceViewImplementationExternalSyntheticLambda1)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(surfaceViewImplementationExternalSyntheticLambda1);
        sb.append(" doesn't exist.");
        throw new IOException(sb.toString());
    }

    private final void a(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1) throws IOException {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(surfaceViewImplementationExternalSyntheticLambda1)) {
            StringBuilder sb = new StringBuilder();
            sb.append(surfaceViewImplementationExternalSyntheticLambda1);
            sb.append(" already exists.");
            throw new IOException(sb.toString());
        }
    }

    @Override // defpackage.animateToFullOpacity
    public void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda2) throws IOException {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda2, "");
        if (new File(surfaceViewImplementationExternalSyntheticLambda1.toString()).renameTo(new File(surfaceViewImplementationExternalSyntheticLambda2.toString()))) {
            return;
        }
        StringBuilder sb = new StringBuilder("failed to move ");
        sb.append(surfaceViewImplementationExternalSyntheticLambda1);
        sb.append(" to ");
        sb.append(surfaceViewImplementationExternalSyntheticLambda2);
        throw new IOException(sb.toString());
    }

    @Override // defpackage.animateToFullOpacity
    public final void TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        if (new File(surfaceViewImplementationExternalSyntheticLambda1.toString()).mkdir()) {
            return;
        }
        lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper lambdaonrotationchanged0androidxcameraviewrotationproviderlistenerwrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationExternalSyntheticLambda1);
        if (lambdaonrotationchanged0androidxcameraviewrotationproviderlistenerwrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || !lambdaonrotationchanged0androidxcameraviewrotationproviderlistenerwrapperTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            throw new IOException("failed to create directory: ".concat(String.valueOf(surfaceViewImplementationExternalSyntheticLambda1)));
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(surfaceViewImplementationExternalSyntheticLambda1);
            sb.append(" already exists.");
            throw new IOException(sb.toString());
        }
    }

    @Override // defpackage.animateToFullOpacity
    public final List<SurfaceViewImplementationExternalSyntheticLambda1> b(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1) throws IOException {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        File file = new File(surfaceViewImplementationExternalSyntheticLambda1.toString());
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                throw new IOException("failed to list ".concat(String.valueOf(surfaceViewImplementationExternalSyntheticLambda1)));
            }
            throw new FileNotFoundException("no such file: ".concat(String.valueOf(surfaceViewImplementationExternalSyntheticLambda1)));
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Intrinsics.checkNotNull(str);
            Intrinsics.checkNotNullParameter(str, "");
            RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
            Intrinsics.checkNotNullParameter(str, "");
            arrayList.add(surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(surfaceViewImplementationExternalSyntheticLambda1, surfaceChanged.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper.b(str, 0, str.length()), false), false));
        }
        ArrayList arrayList2 = arrayList;
        CollectionsKt.sort(arrayList2);
        Intrinsics.checkNotNull(arrayList2);
        return arrayList2;
    }

    @Override // defpackage.animateToFullOpacity
    public lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        File file = new File(surfaceViewImplementationExternalSyntheticLambda1.toString());
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // defpackage.animateToFullOpacity
    public final tryToComplete TuitionPaymentFragmentspecialinlinedviewModeldefault2(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        return SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new File(surfaceViewImplementationExternalSyntheticLambda1.toString()));
    }
}
