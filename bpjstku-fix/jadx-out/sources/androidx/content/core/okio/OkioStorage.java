package androidx.content.core.okio;

import androidx.content.core.InterProcessCoordinator;
import androidx.content.core.Storage;
import androidx.content.core.StorageConnection;
import androidx.exifinterface.media.ExifInterface;
import defpackage.SurfaceViewImplementationExternalSyntheticLambda1;
import defpackage.animateToFullOpacity;
import defpackage.surfaceChanged;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u001f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001fBG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\b8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/datastore/core/okio/OkioStorage;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/Storage;", "LanimateToFullOpacity;", "p0", "Landroidx/datastore/core/okio/OkioSerializer;", "p1", "Lkotlin/Function2;", "LSurfaceViewImplementationExternalSyntheticLambda1;", "Landroidx/datastore/core/InterProcessCoordinator;", "p2", "Lkotlin/Function0;", "p3", "<init>", "(LanimateToFullOpacity;Landroidx/datastore/core/okio/OkioSerializer;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/datastore/core/StorageConnection;", "createConnection", "()Landroidx/datastore/core/StorageConnection;", "canonicalPath$delegate", "Lkotlin/Lazy;", "getCanonicalPath", "()LSurfaceViewImplementationExternalSyntheticLambda1;", "canonicalPath", "coordinatorProducer", "Lkotlin/jvm/functions/Function2;", "fileSystem", "LanimateToFullOpacity;", "producePath", "Lkotlin/jvm/functions/Function0;", "serializer", "Landroidx/datastore/core/okio/OkioSerializer;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkioStorage<T> implements Storage<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Synchronizer activeFilesLock = new Synchronizer();

    /* JADX INFO: renamed from: canonicalPath$delegate, reason: from kotlin metadata */
    private final Lazy canonicalPath;
    private final Function2<SurfaceViewImplementationExternalSyntheticLambda1, animateToFullOpacity, InterProcessCoordinator> coordinatorProducer;
    private final animateToFullOpacity fileSystem;
    private final Function0<SurfaceViewImplementationExternalSyntheticLambda1> producePath;
    private final OkioSerializer<T> serializer;

    /* JADX WARN: Multi-variable type inference failed */
    public OkioStorage(animateToFullOpacity animatetofullopacity, OkioSerializer<T> okioSerializer, Function2<? super SurfaceViewImplementationExternalSyntheticLambda1, ? super animateToFullOpacity, ? extends InterProcessCoordinator> function2, Function0<SurfaceViewImplementationExternalSyntheticLambda1> function0) {
        Intrinsics.checkNotNullParameter(animatetofullopacity, "");
        Intrinsics.checkNotNullParameter(okioSerializer, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.fileSystem = animatetofullopacity;
        this.serializer = okioSerializer;
        this.coordinatorProducer = function2;
        this.producePath = function0;
        this.canonicalPath = LazyKt.lazy(new Function0<SurfaceViewImplementationExternalSyntheticLambda1>(this) { // from class: androidx.datastore.core.okio.OkioStorage$canonicalPath$2
            final /* synthetic */ OkioStorage<T> this$0;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SurfaceViewImplementationExternalSyntheticLambda1 invoke() {
                SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1 = (SurfaceViewImplementationExternalSyntheticLambda1) ((OkioStorage) this.this$0).producePath.invoke();
                boolean z = surfaceChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3(surfaceViewImplementationExternalSyntheticLambda1) != -1;
                OkioStorage<T> okioStorage = this.this$0;
                if (!z) {
                    StringBuilder sb = new StringBuilder("OkioStorage requires absolute paths, but did not get an absolute path from producePath = ");
                    sb.append(((OkioStorage) okioStorage).producePath);
                    sb.append(", instead got ");
                    sb.append(surfaceViewImplementationExternalSyntheticLambda1);
                    throw new IllegalStateException(sb.toString().toString());
                }
                return SurfaceViewImplementationExternalSyntheticLambda1.Companion.TuitionPaymentFragmentbindingInflater1(surfaceViewImplementationExternalSyntheticLambda1.toString(), true);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }
        });
    }

    public /* synthetic */ OkioStorage(animateToFullOpacity animatetofullopacity, OkioSerializer okioSerializer, AnonymousClass1 anonymousClass1, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(animatetofullopacity, okioSerializer, (i & 4) != 0 ? new Function2<SurfaceViewImplementationExternalSyntheticLambda1, animateToFullOpacity, InterProcessCoordinator>() { // from class: androidx.datastore.core.okio.OkioStorage.1
            @Override // kotlin.jvm.functions.Function2
            public final InterProcessCoordinator invoke(SurfaceViewImplementationExternalSyntheticLambda1 surfaceViewImplementationExternalSyntheticLambda1, animateToFullOpacity animatetofullopacity2) {
                Intrinsics.checkNotNullParameter(surfaceViewImplementationExternalSyntheticLambda1, "");
                Intrinsics.checkNotNullParameter(animatetofullopacity2, "");
                return OkioStorageKt.createSingleProcessCoordinator(surfaceViewImplementationExternalSyntheticLambda1);
            }
        } : anonymousClass1, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SurfaceViewImplementationExternalSyntheticLambda1 getCanonicalPath() {
        return (SurfaceViewImplementationExternalSyntheticLambda1) this.canonicalPath.getValue();
    }

    @Override // androidx.content.core.Storage
    public final StorageConnection<T> createConnection() {
        String string = getCanonicalPath().toString();
        synchronized (activeFilesLock) {
            Set<String> set = activeFiles;
            if (set.contains(string)) {
                StringBuilder sb = new StringBuilder("There are multiple DataStores active for the same file: ");
                sb.append(string);
                sb.append(". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).");
                throw new IllegalStateException(sb.toString().toString());
            }
            set.add(string);
        }
        return new OkioStorageConnection(this.fileSystem, getCanonicalPath(), this.serializer, this.coordinatorProducer.invoke(getCanonicalPath(), this.fileSystem), new Function0<Unit>(this) { // from class: androidx.datastore.core.okio.OkioStorage.createConnection.2
            final /* synthetic */ OkioStorage<T> this$0;

            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Synchronizer activeFilesLock2 = OkioStorage.INSTANCE.getActiveFilesLock();
                OkioStorage<T> okioStorage = this.this$0;
                synchronized (activeFilesLock2) {
                    OkioStorage.INSTANCE.getActiveFiles$datastore_core_okio().remove(okioStorage.getCanonicalPath().toString());
                    Unit unit = Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }
        });
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/datastore/core/okio/OkioStorage$Companion;", "", "<init>", "()V", "", "", "activeFiles", "Ljava/util/Set;", "getActiveFiles$datastore_core_okio", "()Ljava/util/Set;", "Landroidx/datastore/core/okio/Synchronizer;", "activeFilesLock", "Landroidx/datastore/core/okio/Synchronizer;", "getActiveFilesLock", "()Landroidx/datastore/core/okio/Synchronizer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Set<String> getActiveFiles$datastore_core_okio() {
            return OkioStorage.activeFiles;
        }

        public final Synchronizer getActiveFilesLock() {
            return OkioStorage.activeFilesLock;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
