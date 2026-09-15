package androidx.content;

import android.content.Context;
import androidx.content.core.DataMigration;
import androidx.content.core.DataStore;
import androidx.content.core.DataStoreFactory;
import androidx.content.core.handlers.ReplaceFileCorruptionHandler;
import androidx.content.core.okio.OkioSerializer;
import androidx.content.core.okio.OkioStorage;
import androidx.exifinterface.media.ExifInterface;
import defpackage.SurfaceViewImplementationExternalSyntheticLambda1;
import defpackage.animateToFullOpacity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002BW\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\u0012\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0097\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR,\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f0\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Landroidx/datastore/DataStoreSingletonDelegate;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "", "p0", "Landroidx/datastore/core/okio/OkioSerializer;", "p1", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "p2", "Lkotlin/Function1;", "", "Landroidx/datastore/core/DataMigration;", "p3", "Lkotlinx/coroutines/CoroutineScope;", "p4", "<init>", "(Ljava/lang/String;Landroidx/datastore/core/okio/OkioSerializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;)V", "Lkotlin/reflect/KProperty;", "getValue", "(Landroid/content/Context;Lkotlin/reflect/KProperty;)Landroidx/datastore/core/DataStore;", "INSTANCE", "Landroidx/datastore/core/DataStore;", "corruptionHandler", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "fileName", "Ljava/lang/String;", "", "lock", "Ljava/lang/Object;", "produceMigrations", "Lkotlin/jvm/functions/Function1;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "serializer", "Landroidx/datastore/core/okio/OkioSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataStoreSingletonDelegate<T> implements ReadOnlyProperty<Context, DataStore<T>> {
    private volatile DataStore<T> INSTANCE;
    private final ReplaceFileCorruptionHandler<T> corruptionHandler;
    private final String fileName;
    private final Object lock;
    private final Function1<Context, List<DataMigration<T>>> produceMigrations;
    private final CoroutineScope scope;
    private final OkioSerializer<T> serializer;

    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreSingletonDelegate(String str, OkioSerializer<T> okioSerializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, Function1<? super Context, ? extends List<? extends DataMigration<T>>> function1, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(okioSerializer, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.fileName = str;
        this.serializer = okioSerializer;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = function1;
        this.scope = coroutineScope;
        this.lock = new Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final /* bridge */ /* synthetic */ Object getValue(Context context, KProperty kProperty) {
        return getValue2(context, (KProperty<?>) kProperty);
    }

    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public final DataStore<T> getValue2(Context p0, KProperty<?> p1) {
        DataStore<T> dataStore;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        DataStore<T> dataStore2 = this.INSTANCE;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.lock) {
            if (this.INSTANCE == null) {
                final Context applicationContext = p0.getApplicationContext();
                DataStoreFactory dataStoreFactory = DataStoreFactory.INSTANCE;
                OkioStorage okioStorage = new OkioStorage(animateToFullOpacity.TuitionPaymentFragmentbindingInflater1, this.serializer, null, new Function0<SurfaceViewImplementationExternalSyntheticLambda1>() { // from class: androidx.datastore.DataStoreSingletonDelegate$getValue$1$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final SurfaceViewImplementationExternalSyntheticLambda1 invoke() {
                        SurfaceViewImplementationExternalSyntheticLambda1.Companion companion = SurfaceViewImplementationExternalSyntheticLambda1.INSTANCE;
                        Context context = applicationContext;
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        String absolutePath = Context.dataStoreFile(context, ((DataStoreSingletonDelegate) this).fileName).getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
                        return SurfaceViewImplementationExternalSyntheticLambda1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(absolutePath);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, 4, null);
                ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler = this.corruptionHandler;
                Function1<Context, List<DataMigration<T>>> function1 = this.produceMigrations;
                Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                this.INSTANCE = dataStoreFactory.create(okioStorage, replaceFileCorruptionHandler, function1.invoke(applicationContext), this.scope);
            }
            dataStore = this.INSTANCE;
            Intrinsics.checkNotNull(dataStore);
        }
        return dataStore;
    }
}
