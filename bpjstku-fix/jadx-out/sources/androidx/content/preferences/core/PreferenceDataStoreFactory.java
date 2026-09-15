package androidx.content.preferences.core;

import androidx.content.core.DataMigration;
import androidx.content.core.DataStore;
import androidx.content.core.DataStoreFactory;
import androidx.content.core.Storage;
import androidx.content.core.handlers.ReplaceFileCorruptionHandler;
import androidx.content.core.okio.OkioStorage;
import defpackage.SurfaceViewImplementationExternalSyntheticLambda1;
import defpackage.animateToFullOpacity;
import defpackage.getDataSpace;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010JU\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0004\b\u000f\u0010\u0013JU\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0013"}, d2 = {"Landroidx/datastore/preferences/core/PreferenceDataStoreFactory;", "", "<init>", "()V", "Landroidx/datastore/core/Storage;", "Landroidx/datastore/preferences/core/Preferences;", "p0", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "p1", "", "Landroidx/datastore/core/DataMigration;", "p2", "Lkotlinx/coroutines/CoroutineScope;", "p3", "Landroidx/datastore/core/DataStore;", "create", "(Landroidx/datastore/core/Storage;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;)Landroidx/datastore/core/DataStore;", "Lkotlin/Function0;", "Ljava/io/File;", "(Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)Landroidx/datastore/core/DataStore;", "LSurfaceViewImplementationExternalSyntheticLambda1;", "createWithPath"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreferenceDataStoreFactory {
    public static final PreferenceDataStoreFactory INSTANCE = new PreferenceDataStoreFactory();

    private PreferenceDataStoreFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, CoroutineScope coroutineScope, int i, Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 8) != 0) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(Actual_jvmKt.ioDispatcher().plus(new getDataSpace(null)));
        }
        return preferenceDataStoreFactory.create((Storage<Preferences>) storage, (ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, coroutineScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, CoroutineScope coroutineScope, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(new getDataSpace(null)));
        }
        return preferenceDataStoreFactory.create((ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, coroutineScope, (Function0<? extends File>) function0);
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> p0, List<? extends DataMigration<Preferences>> p1, CoroutineScope p2, final Function0<? extends File> p3) {
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return new PreferenceDataStore(create(new OkioStorage(animateToFullOpacity.TuitionPaymentFragmentbindingInflater1, PreferencesSerializer.INSTANCE, null, new Function0<SurfaceViewImplementationExternalSyntheticLambda1>() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$create$delegate$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SurfaceViewImplementationExternalSyntheticLambda1 invoke() {
                File fileInvoke = p3.invoke();
                if (!Intrinsics.areEqual(FilesKt.getExtension(fileInvoke), PreferencesSerializer.fileExtension)) {
                    StringBuilder sb = new StringBuilder("File extension for file: ");
                    sb.append(fileInvoke);
                    sb.append(" does not match required extension for Preferences file: preferences_pb");
                    throw new IllegalStateException(sb.toString().toString());
                }
                SurfaceViewImplementationExternalSyntheticLambda1.Companion companion = SurfaceViewImplementationExternalSyntheticLambda1.INSTANCE;
                File absoluteFile = fileInvoke.getAbsoluteFile();
                Intrinsics.checkNotNullExpressionValue(absoluteFile, "");
                return SurfaceViewImplementationExternalSyntheticLambda1.Companion.b(companion, absoluteFile);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }
        }, 4, null), p0, p1, p2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore createWithPath$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, CoroutineScope coroutineScope, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(Actual_jvmKt.ioDispatcher().plus(new getDataSpace(null)));
        }
        return preferenceDataStoreFactory.createWithPath(replaceFileCorruptionHandler, list, coroutineScope, function0);
    }

    public final DataStore<Preferences> create(Storage<Preferences> p0, ReplaceFileCorruptionHandler<Preferences> p1, List<? extends DataMigration<Preferences>> p2, CoroutineScope p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return new PreferenceDataStore(DataStoreFactory.INSTANCE.create(p0, p1, p2, p3));
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> p0, List<? extends DataMigration<Preferences>> p1, CoroutineScope p2, final Function0<SurfaceViewImplementationExternalSyntheticLambda1> p3) {
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return create(p0, p1, p2, new Function0<File>() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory.createWithPath.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                return new File(p3.invoke().toString());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage) {
        Intrinsics.checkNotNullParameter(storage, "");
        return create$default(this, storage, (ReplaceFileCorruptionHandler) null, (List) null, (CoroutineScope) null, 14, (Object) null);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler) {
        Intrinsics.checkNotNullParameter(storage, "");
        return create$default(this, storage, replaceFileCorruptionHandler, (List) null, (CoroutineScope) null, 12, (Object) null);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> list) {
        Intrinsics.checkNotNullParameter(storage, "");
        Intrinsics.checkNotNullParameter(list, "");
        return create$default(this, storage, replaceFileCorruptionHandler, list, (CoroutineScope) null, 8, (Object) null);
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> list, Function0<? extends File> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        return create$default(this, replaceFileCorruptionHandler, list, (CoroutineScope) null, function0, 4, (Object) null);
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, Function0<? extends File> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        return create$default(this, replaceFileCorruptionHandler, (List) null, (CoroutineScope) null, function0, 6, (Object) null);
    }

    public final DataStore<Preferences> create(Function0<? extends File> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        return create$default(this, (ReplaceFileCorruptionHandler) null, (List) null, (CoroutineScope) null, function0, 7, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> list, Function0<SurfaceViewImplementationExternalSyntheticLambda1> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        return createWithPath$default(this, replaceFileCorruptionHandler, list, null, function0, 4, null);
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, Function0<SurfaceViewImplementationExternalSyntheticLambda1> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        return createWithPath$default(this, replaceFileCorruptionHandler, null, null, function0, 6, null);
    }

    public final DataStore<Preferences> createWithPath(Function0<SurfaceViewImplementationExternalSyntheticLambda1> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        return createWithPath$default(this, null, null, null, function0, 7, null);
    }
}
