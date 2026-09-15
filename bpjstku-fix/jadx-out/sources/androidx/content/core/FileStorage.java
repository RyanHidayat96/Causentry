package androidx.content.core;

import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0016B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/datastore/core/FileStorage;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/Storage;", "Landroidx/datastore/core/Serializer;", "p0", "Lkotlin/Function1;", "Ljava/io/File;", "Landroidx/datastore/core/InterProcessCoordinator;", "p1", "Lkotlin/Function0;", "p2", "<init>", "(Landroidx/datastore/core/Serializer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Landroidx/datastore/core/StorageConnection;", "createConnection", "()Landroidx/datastore/core/StorageConnection;", "coordinatorProducer", "Lkotlin/jvm/functions/Function1;", "produceFile", "Lkotlin/jvm/functions/Function0;", "serializer", "Landroidx/datastore/core/Serializer;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileStorage<T> implements Storage<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Object activeFilesLock = new Object();
    private final Function1<File, InterProcessCoordinator> coordinatorProducer;
    private final Function0<File> produceFile;
    private final Serializer<T> serializer;

    /* JADX WARN: Multi-variable type inference failed */
    public FileStorage(Serializer<T> serializer, Function1<? super File, ? extends InterProcessCoordinator> function1, Function0<? extends File> function0) {
        Intrinsics.checkNotNullParameter(serializer, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.serializer = serializer;
        this.coordinatorProducer = function1;
        this.produceFile = function0;
    }

    public /* synthetic */ FileStorage(Serializer serializer, AnonymousClass1 anonymousClass1, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(serializer, (i & 2) != 0 ? new Function1<File, InterProcessCoordinator>() { // from class: androidx.datastore.core.FileStorage.1
            @Override // kotlin.jvm.functions.Function1
            public final InterProcessCoordinator invoke(File file) {
                Intrinsics.checkNotNullParameter(file, "");
                return InterProcessCoordinator_jvmKt.createSingleProcessCoordinator(file);
            }
        } : anonymousClass1, function0);
    }

    @Override // androidx.content.core.Storage
    public final StorageConnection<T> createConnection() throws IOException {
        final File canonicalFile = this.produceFile.invoke().getCanonicalFile();
        synchronized (activeFilesLock) {
            String absolutePath = canonicalFile.getAbsolutePath();
            Set<String> set = activeFiles;
            if (set.contains(absolutePath)) {
                StringBuilder sb = new StringBuilder("There are multiple DataStores active for the same file: ");
                sb.append(absolutePath);
                sb.append(". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).");
                throw new IllegalStateException(sb.toString().toString());
            }
            Intrinsics.checkNotNullExpressionValue(absolutePath, "");
            set.add(absolutePath);
        }
        Intrinsics.checkNotNullExpressionValue(canonicalFile, "");
        return new FileStorageConnection(canonicalFile, this.serializer, this.coordinatorProducer.invoke(canonicalFile), new Function0<Unit>() { // from class: androidx.datastore.core.FileStorage.createConnection.2
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Object activeFilesLock$datastore_core_release = FileStorage.INSTANCE.getActiveFilesLock$datastore_core_release();
                File file = canonicalFile;
                synchronized (activeFilesLock$datastore_core_release) {
                    FileStorage.INSTANCE.getActiveFiles$datastore_core_release().remove(file.getAbsolutePath());
                    Unit unit = Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00018\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/datastore/core/FileStorage$Companion;", "", "<init>", "()V", "", "", "activeFiles", "Ljava/util/Set;", "getActiveFiles$datastore_core_release", "()Ljava/util/Set;", "activeFilesLock", "Ljava/lang/Object;", "getActiveFilesLock$datastore_core_release", "()Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Set<String> getActiveFiles$datastore_core_release() {
            return FileStorage.activeFiles;
        }

        public final Object getActiveFilesLock$datastore_core_release() {
            return FileStorage.activeFilesLock;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
