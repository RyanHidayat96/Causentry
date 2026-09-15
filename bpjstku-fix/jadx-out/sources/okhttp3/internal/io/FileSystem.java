package okhttp3.internal.io;

import com.google.android.gms.internal.mlkit_vision_face.zzee;
import defpackage.SurfaceViewImplementation;
import defpackage.SurfaceViewImplementationApi24Impl;
import defpackage.tryToComplete;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lokhttp3/internal/io/FileSystem;", "", "Ljava/io/File;", "p0", "LSurfaceViewImplementationApi24Impl;", "appendingSink", "(Ljava/io/File;)LSurfaceViewImplementationApi24Impl;", "", "delete", "(Ljava/io/File;)V", "deleteContents", "", "exists", "(Ljava/io/File;)Z", "p1", "rename", "(Ljava/io/File;Ljava/io/File;)V", "sink", "", "size", "(Ljava/io/File;)J", "LtryToComplete;", "source", "(Ljava/io/File;)LtryToComplete;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface FileSystem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    SurfaceViewImplementationApi24Impl appendingSink(File p0) throws FileNotFoundException;

    void delete(File p0) throws IOException;

    void deleteContents(File p0) throws IOException;

    boolean exists(File p0);

    void rename(File p0, File p1) throws IOException;

    SurfaceViewImplementationApi24Impl sink(File p0) throws FileNotFoundException;

    long size(File p0);

    tryToComplete source(File p0) throws FileNotFoundException;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001"}, d2 = {"Lokhttp3/internal/io/FileSystem$Companion;", "", "<init>", "()V", "Lokhttp3/internal/io/FileSystem;", "SYSTEM", "Lokhttp3/internal/io/FileSystem;", "SystemFileSystem"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Lokhttp3/internal/io/FileSystem$Companion$SystemFileSystem;", "Lokhttp3/internal/io/FileSystem;", "<init>", "()V", "Ljava/io/File;", "p0", "LSurfaceViewImplementationApi24Impl;", "appendingSink", "(Ljava/io/File;)LSurfaceViewImplementationApi24Impl;", "", "delete", "(Ljava/io/File;)V", "deleteContents", "", "exists", "(Ljava/io/File;)Z", "p1", "rename", "(Ljava/io/File;Ljava/io/File;)V", "sink", "", "size", "(Ljava/io/File;)J", "LtryToComplete;", "source", "(Ljava/io/File;)LtryToComplete;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            public final tryToComplete source(File p0) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(p0, "");
                return SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
            }

            @Override // okhttp3.internal.io.FileSystem
            public final SurfaceViewImplementationApi24Impl sink(File p0) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    int iB = zzee.b();
                    int iB2 = zzee.b();
                    return (SurfaceViewImplementationApi24Impl) SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzee.b(), 892870984, iB2, zzee.b(), -892870984, iB, new Object[]{p0});
                } catch (FileNotFoundException unused) {
                    p0.getParentFile().mkdirs();
                    int iB3 = zzee.b();
                    int iB4 = zzee.b();
                    return (SurfaceViewImplementationApi24Impl) SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzee.b(), 892870984, iB4, zzee.b(), -892870984, iB3, new Object[]{p0});
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public final SurfaceViewImplementationApi24Impl appendingSink(File p0) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(p0, "");
                try {
                    return SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0);
                } catch (FileNotFoundException unused) {
                    p0.getParentFile().mkdirs();
                    return SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public final void delete(File p0) throws IOException {
                Intrinsics.checkNotNullParameter(p0, "");
                if (!p0.delete() && p0.exists()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(p0)));
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public final boolean exists(File p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                return p0.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public final long size(File p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                return p0.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            public final void rename(File p0, File p1) throws IOException {
                Intrinsics.checkNotNullParameter(p0, "");
                Intrinsics.checkNotNullParameter(p1, "");
                delete(p1);
                if (p0.renameTo(p1)) {
                    return;
                }
                StringBuilder sb = new StringBuilder("failed to rename ");
                sb.append(p0);
                sb.append(" to ");
                sb.append(p1);
                throw new IOException(sb.toString());
            }

            @Override // okhttp3.internal.io.FileSystem
            public final void deleteContents(File p0) throws IOException {
                Intrinsics.checkNotNullParameter(p0, "");
                File[] fileArrListFiles = p0.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: ".concat(String.valueOf(p0)));
                }
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        Intrinsics.checkNotNullExpressionValue(file, "");
                        deleteContents(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete ".concat(String.valueOf(file)));
                    }
                }
            }

            public final String toString() {
                return "FileSystem.SYSTEM";
            }
        }
    }
}
