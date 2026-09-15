package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ScreenFlashView1 extends ScreenFlashView2 {
    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    private static lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper Q_(Path path) {
        Long lValueOf;
        Long l;
        Intrinsics.checkNotNullParameter(path, "");
        Long l2 = null;
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1R_ = symbolicLink != null ? SurfaceViewImplementationExternalSyntheticLambda1.Companion.R_(SurfaceViewImplementationExternalSyntheticLambda1.INSTANCE, symbolicLink) : null;
            long size = attributes.size();
            FileTime fileTimeCreationTime = attributes.creationTime();
            if (fileTimeCreationTime != null) {
                lValueOf = Long.valueOf(fileTimeCreationTime.toMillis());
                if (lValueOf.longValue() == 0) {
                    lValueOf = null;
                }
            } else {
                lValueOf = null;
            }
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            if (fileTimeLastModifiedTime != null) {
                Long lValueOf2 = Long.valueOf(fileTimeLastModifiedTime.toMillis());
                if (lValueOf2.longValue() == 0) {
                    lValueOf2 = null;
                }
                l = lValueOf2;
            } else {
                l = null;
            }
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            if (fileTimeLastAccessTime != null) {
                Long lValueOf3 = Long.valueOf(fileTimeLastAccessTime.toMillis());
                if (lValueOf3.longValue() != 0) {
                    l2 = lValueOf3;
                }
            }
            return new lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper(zIsRegularFile, zIsDirectory, surfaceViewImplementationExternalSyntheticLambda1R_, Long.valueOf(size), lValueOf, l, l2, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // defpackage.ScreenFlashView2
    public final String toString() {
        return "NioSystemFileSystem";
    }

    @Override // defpackage.ScreenFlashView2, defpackage.animateToFullOpacity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda2) throws IOException {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda2, "");
        try {
            Path path = Paths.get(surfaceViewImplementationExternalSyntheticLambda1.toString(), new String[0]);
            Intrinsics.checkNotNullExpressionValue(path, "");
            Path path2 = Paths.get(surfaceViewImplementationExternalSyntheticLambda2.toString(), new String[0]);
            Intrinsics.checkNotNullExpressionValue(path2, "");
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e2) {
            throw new FileNotFoundException(e2.getMessage());
        }
    }

    @Override // defpackage.ScreenFlashView2, defpackage.animateToFullOpacity
    public final lambdaonRotationChanged0androidxcameraviewRotationProviderListenerWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
        Path path = Paths.get(surfaceViewImplementationExternalSyntheticLambda1.toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "");
        return Q_(path);
    }
}
