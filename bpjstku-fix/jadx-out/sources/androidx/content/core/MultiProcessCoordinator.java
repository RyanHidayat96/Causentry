package androidx.content.core;

import androidx.exifinterface.media.ExifInterface;
import defpackage.VideoEncoderConfig;
import defpackage.clampVideoBitrateIfNotSupported;
import defpackage.toIllegalArgumentException;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 <2\u00020\u0001:\u0001<B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\rJ4\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u001c\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\"\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0015H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J<\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2$\b\u0004\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0015H\u0082H¢\u0006\u0004\b\u001a\u0010\u0018J\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001b*\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\b8\u0002X\u0083D¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\b8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u00048\u0005X\u0085\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00190,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001b\u00101\u001a\u00020\u00048CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b0\u0010(R\u001b\u00106\u001a\u00020\u00198CX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b2\u00103*\u0004\b4\u00105R \u00108\u001a\b\u0012\u0004\u0012\u00020\u001b078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "Lkotlin/coroutines/CoroutineContext;", "p0", "Ljava/io/File;", "p1", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/io/File;)V", "", "fileWithSuffix", "(Ljava/lang/String;)Ljava/io/File;", "", "getVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementAndGetVersion", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "lock", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "tryLock", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/datastore/core/SharedCounter;", "withLazyCounter", "", "createIfNotExists", "(Ljava/io/File;)V", "createParentDirectories", "LOCK_ERROR_MESSAGE", "Ljava/lang/String;", "LOCK_SUFFIX", "VERSION_SUFFIX", "context", "Lkotlin/coroutines/CoroutineContext;", "file", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "LVideoEncoderConfig;", "inMemoryMutex", "LVideoEncoderConfig;", "Lkotlin/Lazy;", "lazySharedCounter", "Lkotlin/Lazy;", "lockFile$delegate", "getLockFile", "lockFile", "getSharedCounter", "()Landroidx/datastore/core/SharedCounter;", "getSharedCounter$delegate", "(Landroidx/datastore/core/MultiProcessCoordinator;)Ljava/lang/Object;", "sharedCounter", "LclampVideoBitrateIfNotSupported;", "updateNotifications", "LclampVideoBitrateIfNotSupported;", "getUpdateNotifications", "()LclampVideoBitrateIfNotSupported;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultiProcessCoordinator implements InterProcessCoordinator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String DEADLOCK_ERROR_MESSAGE = "Resource deadlock would occur";
    private static final long INITIAL_WAIT_MILLIS = 10;
    private static final long MAX_WAIT_MILLIS = 60000;
    private final String LOCK_ERROR_MESSAGE;
    private final String LOCK_SUFFIX;
    private final String VERSION_SUFFIX;
    private final CoroutineContext context;
    private final File file;
    private final VideoEncoderConfig inMemoryMutex;
    private final Lazy<SharedCounter> lazySharedCounter;

    /* JADX INFO: renamed from: lockFile$delegate, reason: from kotlin metadata */
    private final Lazy lockFile;
    private final clampVideoBitrateIfNotSupported<Unit> updateNotifications;

    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$lock$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", i = {0, 0, 0, 1, 1, 2, 2}, l = {211, 47, 48}, m = "lock", n = {"this", "block", "$this$withLock_u24default$iv", "block", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "lock"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$2"})
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiProcessCoordinator.this.lock(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$tryLock$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", i = {0, 0, 1, 1, 1}, l = {62, 87}, m = "tryLock", n = {"$this$withTryLock_u24default$iv", "locked$iv", "$this$withTryLock_u24default$iv", "lock", "locked$iv"}, s = {"L$0", "Z$0", "L$0", "L$2", "Z$0"})
    static final class C06341<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C06341(Continuation<? super C06341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiProcessCoordinator.this.tryLock(null, this);
        }
    }

    public MultiProcessCoordinator(CoroutineContext coroutineContext, File file) {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(file, "");
        this.context = coroutineContext;
        this.file = file;
        this.updateNotifications = MulticastFileObserver.INSTANCE.observe(file);
        this.LOCK_SUFFIX = ".lock";
        this.VERSION_SUFFIX = ".version";
        this.LOCK_ERROR_MESSAGE = "fcntl failed: EAGAIN";
        this.inMemoryMutex = toIllegalArgumentException.b(false);
        this.lockFile = LazyKt.lazy(new Function0<File>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lockFile$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() throws IOException {
                MultiProcessCoordinator multiProcessCoordinator = this.this$0;
                File fileFileWithSuffix = multiProcessCoordinator.fileWithSuffix(multiProcessCoordinator.LOCK_SUFFIX);
                this.this$0.createIfNotExists(fileFileWithSuffix);
                return fileFileWithSuffix;
            }

            {
                super(0);
            }
        });
        this.lazySharedCounter = LazyKt.lazy(new Function0<SharedCounter>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SharedCounter invoke() throws Throwable {
                SharedCounter.INSTANCE.loadLib();
                SharedCounter.Companion companion = SharedCounter.INSTANCE;
                final MultiProcessCoordinator multiProcessCoordinator = this.this$0;
                return companion.create$datastore_core_release(new Function0<File>() { // from class: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final File invoke() throws IOException {
                        MultiProcessCoordinator multiProcessCoordinator2 = multiProcessCoordinator;
                        File fileFileWithSuffix = multiProcessCoordinator2.fileWithSuffix(multiProcessCoordinator2.VERSION_SUFFIX);
                        multiProcessCoordinator.createIfNotExists(fileFileWithSuffix);
                        return fileFileWithSuffix;
                    }

                    {
                        super(0);
                    }
                });
            }

            {
                super(0);
            }
        });
    }

    protected final File getFile() {
        return this.file;
    }

    @Override // androidx.content.core.InterProcessCoordinator
    public final clampVideoBitrateIfNotSupported<Unit> getUpdateNotifications() {
        return this.updateNotifications;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0 A[Catch: all -> 0x00c4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00c4, blocks: (B:40:0x00c0, B:58:0x00e5, B:59:0x00e8), top: B:75:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5 A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #2 {all -> 0x00c4, blocks: (B:40:0x00c0, B:58:0x00e5, B:59:0x00e8), top: B:75:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.MultiProcessCoordinator$lock$1, java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [VideoEncoderConfig] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.content.core.InterProcessCoordinator
    public final <T> Object lock(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) throws Throwable {
        ?? anonymousClass1;
        ?? r11;
        MultiProcessCoordinator multiProcessCoordinator;
        Function1<? super Continuation<? super T>, ? extends Object> function2;
        VideoEncoderConfig videoEncoderConfig;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        Throwable th;
        Closeable closeable;
        Function1<? super Continuation<? super T>, ? extends Object> function3;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        Closeable closeable2;
        VideoEncoderConfig videoEncoderConfig2;
        if (continuation instanceof AnonymousClass1) {
            AnonymousClass1 anonymousClass2 = (AnonymousClass1) continuation;
            if ((anonymousClass2.label & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label -= Integer.MIN_VALUE;
                anonymousClass1 = anonymousClass2;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = ((AnonymousClass1) anonymousClass1).result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = ((AnonymousClass1) anonymousClass1).label;
        try {
            try {
                try {
                    try {
                        try {
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                VideoEncoderConfig videoEncoderConfig3 = this.inMemoryMutex;
                                ((AnonymousClass1) anonymousClass1).L$0 = this;
                                ((AnonymousClass1) anonymousClass1).L$1 = function1;
                                ((AnonymousClass1) anonymousClass1).L$2 = videoEncoderConfig3;
                                ((AnonymousClass1) anonymousClass1).label = 1;
                                if (videoEncoderConfig3.lock(null, (Continuation) anonymousClass1) != coroutine_suspended) {
                                    multiProcessCoordinator = this;
                                    function2 = function1;
                                    videoEncoderConfig = videoEncoderConfig3;
                                }
                                return coroutine_suspended;
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    fileLock = (FileLock) ((AnonymousClass1) anonymousClass1).L$2;
                                    Closeable closeable3 = (Closeable) ((AnonymousClass1) anonymousClass1).L$1;
                                    videoEncoderConfig2 = (VideoEncoderConfig) ((AnonymousClass1) anonymousClass1).L$0;
                                    try {
                                        ResultKt.throwOnFailure(obj);
                                        closeable2 = closeable3;
                                        if (fileLock != null) {
                                            fileLock.release();
                                        }
                                        CloseableKt.closeFinally(closeable2, null);
                                        videoEncoderConfig2.unlock(null);
                                        return obj;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (fileLock != null) {
                                            fileLock.release();
                                        }
                                        throw th;
                                    }
                                }
                                Closeable closeable4 = (Closeable) ((AnonymousClass1) anonymousClass1).L$2;
                                VideoEncoderConfig videoEncoderConfig4 = (VideoEncoderConfig) ((AnonymousClass1) anonymousClass1).L$1;
                                function3 = (Function1) ((AnonymousClass1) anonymousClass1).L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    closeable = closeable4;
                                    videoEncoderConfig = videoEncoderConfig4;
                                    try {
                                        fileLock2 = (FileLock) obj;
                                        try {
                                            ((AnonymousClass1) anonymousClass1).L$0 = videoEncoderConfig;
                                            ((AnonymousClass1) anonymousClass1).L$1 = closeable;
                                            ((AnonymousClass1) anonymousClass1).L$2 = fileLock2;
                                            ((AnonymousClass1) anonymousClass1).label = 3;
                                            objInvoke = function3.invoke((Object) anonymousClass1);
                                            if (objInvoke != coroutine_suspended) {
                                                closeable2 = closeable;
                                                videoEncoderConfig2 = videoEncoderConfig;
                                                fileLock = fileLock2;
                                                obj = objInvoke;
                                                if (fileLock != null) {
                                                    fileLock.release();
                                                }
                                                CloseableKt.closeFinally(closeable2, null);
                                                videoEncoderConfig2.unlock(null);
                                                return obj;
                                            }
                                            return coroutine_suspended;
                                        } catch (Throwable th3) {
                                            fileLock = fileLock2;
                                            th = th3;
                                            if (fileLock != null) {
                                                fileLock.release();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        Closeable closeable5 = closeable;
                                        videoEncoderConfig4 = videoEncoderConfig;
                                        closeable4 = closeable5;
                                        fileLock = null;
                                        if (fileLock != null) {
                                            fileLock.release();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    fileLock = null;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    throw th;
                                }
                            }
                            videoEncoderConfig = (VideoEncoderConfig) ((AnonymousClass1) anonymousClass1).L$2;
                            function2 = (Function1) ((AnonymousClass1) anonymousClass1).L$1;
                            multiProcessCoordinator = (MultiProcessCoordinator) ((AnonymousClass1) anonymousClass1).L$0;
                            ResultKt.throwOnFailure(obj);
                            Companion companion = INSTANCE;
                            ((AnonymousClass1) anonymousClass1).L$0 = function2;
                            ((AnonymousClass1) anonymousClass1).L$1 = videoEncoderConfig;
                            ((AnonymousClass1) anonymousClass1).L$2 = fileOutputStream;
                            ((AnonymousClass1) anonymousClass1).label = 2;
                            Object exclusiveFileLockWithRetryIfDeadlock = companion.getExclusiveFileLockWithRetryIfDeadlock(fileOutputStream2, (Continuation) anonymousClass1);
                            if (exclusiveFileLockWithRetryIfDeadlock != coroutine_suspended) {
                                Function1<? super Continuation<? super T>, ? extends Object> function4 = function2;
                                closeable = fileOutputStream;
                                obj = exclusiveFileLockWithRetryIfDeadlock;
                                function3 = function4;
                                fileLock2 = (FileLock) obj;
                                ((AnonymousClass1) anonymousClass1).L$0 = videoEncoderConfig;
                                ((AnonymousClass1) anonymousClass1).L$1 = closeable;
                                ((AnonymousClass1) anonymousClass1).L$2 = fileLock2;
                                ((AnonymousClass1) anonymousClass1).label = 3;
                                objInvoke = function3.invoke((Object) anonymousClass1);
                                if (objInvoke != coroutine_suspended) {
                                    closeable2 = closeable;
                                    videoEncoderConfig2 = videoEncoderConfig;
                                    fileLock = fileLock2;
                                    obj = objInvoke;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    CloseableKt.closeFinally(closeable2, null);
                                    videoEncoderConfig2.unlock(null);
                                    return obj;
                                }
                            }
                            return coroutine_suspended;
                        } catch (Throwable th6) {
                            th = th6;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                        fileOutputStream2 = fileOutputStream;
                    } catch (Throwable th7) {
                        VideoEncoderConfig videoEncoderConfig5 = videoEncoderConfig;
                        th = th7;
                        anonymousClass1 = videoEncoderConfig5;
                        r11 = fileOutputStream;
                        try {
                            throw th;
                        } catch (Throwable th8) {
                            CloseableKt.closeFinally(r11, th);
                            throw th8;
                        }
                    }
                    fileOutputStream = new FileOutputStream(multiProcessCoordinator.getLockFile());
                } catch (Throwable th9) {
                    anonymousClass1 = videoEncoderConfig;
                    th = th9;
                    anonymousClass1.unlock(null);
                    throw th;
                }
            } catch (Throwable th10) {
                th = th10;
                r11 = coroutine_suspended;
                anonymousClass1 = anonymousClass1;
            }
        } catch (Throwable th11) {
            th = th11;
            anonymousClass1.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e0 A[Catch: all -> 0x00e4, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00e4, blocks: (B:56:0x00e0, B:69:0x00fd, B:70:0x0100), top: B:91:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fd A[Catch: all -> 0x00e4, TRY_ENTER, TryCatch #4 {all -> 0x00e4, blocks: (B:56:0x00e0, B:69:0x00fd, B:70:0x0100), top: B:91:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0112  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v10, types: [VideoEncoderConfig] */
    /* JADX WARN: Type inference failed for: r3v11, types: [VideoEncoderConfig] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.datastore.core.MultiProcessCoordinator$tryLock$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [VideoEncoderConfig] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [VideoEncoderConfig, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    @Override // androidx.content.core.InterProcessCoordinator
    public final <T> Object tryLock(Function2<? super Boolean, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) throws Throwable {
        ?? c06341;
        FileInputStream fileInputStream;
        ?? TryLock;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        ?? r3;
        boolean z;
        ?? r5;
        ?? r4;
        boolean z2;
        ?? r2 = function2;
        if (continuation instanceof C06341) {
            C06341 c06342 = (C06341) continuation;
            if ((c06342.label & Integer.MIN_VALUE) != 0) {
                c06342.label -= Integer.MIN_VALUE;
                c06341 = c06342;
            } else {
                c06341 = new C06341(continuation);
            }
        } else {
            c06341 = new C06341(continuation);
        }
        Object objInvoke = c06341.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r6 = c06341.label;
        try {
            try {
                try {
                    if (r6 != 0) {
                        if (r6 == 1) {
                            z2 = c06341.Z$0;
                            VideoEncoderConfig videoEncoderConfig = (VideoEncoderConfig) c06341.L$0;
                            ResultKt.throwOnFailure(objInvoke);
                            r4 = videoEncoderConfig;
                            if (z2) {
                                r4.unlock(null);
                            }
                            return objInvoke;
                        }
                        if (r6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z = c06341.Z$0;
                        fileLock = (FileLock) c06341.L$2;
                        Closeable closeable = (Closeable) c06341.L$1;
                        VideoEncoderConfig videoEncoderConfig2 = (VideoEncoderConfig) c06341.L$0;
                        try {
                            ResultKt.throwOnFailure(objInvoke);
                            r3 = videoEncoderConfig2;
                            r5 = closeable;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            CloseableKt.closeFinally(r5, null);
                            if (z) {
                                r3.unlock(null);
                            }
                            return objInvoke;
                        } catch (Throwable th) {
                            th = th;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    }
                    ResultKt.throwOnFailure(objInvoke);
                    r6 = this.inMemoryMutex;
                    TryLock = r6.tryLock(null);
                    if (TryLock == 0) {
                        Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                        c06341.L$0 = r6;
                        c06341.Z$0 = TryLock;
                        c06341.label = 1;
                        objInvoke = r2.invoke(boolBoxBoolean, c06341);
                        if (objInvoke != coroutine_suspended) {
                            r4 = r6;
                            z2 = TryLock == true ? 1 : 0;
                            if (z2) {
                                r4.unlock(null);
                            }
                            return objInvoke;
                        }
                    } else {
                        fileInputStream = new FileInputStream(getLockFile());
                        try {
                            try {
                                try {
                                    fileLockTryLock = fileInputStream.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileLock = null;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    throw th;
                                }
                            } catch (IOException e2) {
                                String message2 = e2.getMessage();
                                if ((message2 == null || !StringsKt.startsWith$default(message2, this.LOCK_ERROR_MESSAGE, false, 2, (Object) null)) && ((message = e2.getMessage()) == null || !StringsKt.startsWith$default(message, DEADLOCK_ERROR_MESSAGE, false, 2, (Object) null))) {
                                    throw e2;
                                }
                                fileLockTryLock = null;
                            }
                            try {
                                Boolean boolBoxBoolean2 = Boxing.boxBoolean(fileLockTryLock != null);
                                c06341.L$0 = r6;
                                c06341.L$1 = fileInputStream;
                                c06341.L$2 = fileLockTryLock;
                                c06341.Z$0 = TryLock;
                                c06341.label = 2;
                                objInvoke = r2.invoke(boolBoxBoolean2, c06341);
                                if (objInvoke != coroutine_suspended) {
                                    r3 = r6;
                                    z = TryLock == true ? 1 : 0;
                                    r5 = fileInputStream;
                                    fileLock = fileLockTryLock;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    CloseableKt.closeFinally(r5, null);
                                    if (z) {
                                        r3.unlock(null);
                                    }
                                    return objInvoke;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            Throwable th5 = th;
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                CloseableKt.closeFinally(fileInputStream, th5);
                                throw th6;
                            }
                        }
                    }
                    return coroutine_suspended;
                } catch (Throwable th7) {
                    th = th7;
                    fileInputStream = r6;
                    TryLock = r2;
                    r6 = c06341;
                }
            } catch (Throwable th8) {
                th = th8;
                if (r2 != 0) {
                    c06341.unlock(null);
                }
                throw th;
            }
        } catch (Throwable th9) {
            th = th9;
            c06341 = r6;
            r2 = TryLock;
            if (r2 != 0) {
                c06341.unlock(null);
            }
            throw th;
        }
    }

    private final File getLockFile() {
        return (File) this.lockFile.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedCounter getSharedCounter() {
        return this.lazySharedCounter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File fileWithSuffix(String p0) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.file.getAbsolutePath());
        sb.append(p0);
        return new File(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createIfNotExists(File file) throws IOException {
        createParentDirectories(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    private final void createParentDirectories(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of ".concat(String.valueOf(file)));
            }
        }
    }

    private final <T> Object withLazyCounter(Function2<? super SharedCounter, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return function2.invoke(getSharedCounter(), continuation);
        }
        return BuildersKt.TuitionPaymentFragmentbindingInflater1(this.context, new AnonymousClass2(function2, this, null), continuation);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2", f = "MultiProcessCoordinator.android.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function2<SharedCounter, Continuation<? super T>, Object> $block;
        int label;
        final /* synthetic */ MultiProcessCoordinator this$0;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Function2<SharedCounter, Continuation<? super T>, Object> function2 = this.$block;
            SharedCounter sharedCounter = this.this$0.getSharedCounter();
            this.label = 1;
            Object objInvoke = function2.invoke(sharedCounter, this);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            return this.$block.invoke(this.this$0.getSharedCounter(), this);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function2<? super SharedCounter, ? super Continuation<? super T>, ? extends Object> function2, MultiProcessCoordinator multiProcessCoordinator, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.this$0 = multiProcessCoordinator;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$block, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator$Companion;", "", "<init>", "()V", "Ljava/io/FileOutputStream;", "p0", "Ljava/nio/channels/FileLock;", "getExclusiveFileLockWithRetryIfDeadlock", "(Ljava/io/FileOutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "DEADLOCK_ERROR_MESSAGE", "Ljava/lang/String;", "", "INITIAL_WAIT_MILLIS", "J", "MAX_WAIT_MILLIS"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(3:31|17|18) */
        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        
            r14 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        
            r2 = r14.getMessage();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        
            if (r2 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        
            r0.L$0 = r13;
            r0.J$0 = r4;
            r0.label = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
        
            if (defpackage.AudioEncoderConfigAudioProfileResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r4, r0) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
        
            throw r14;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007f -> B:27:0x0082). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object getExclusiveFileLockWithRetryIfDeadlock(java.io.FileOutputStream r13, kotlin.coroutines.Continuation<? super java.nio.channels.FileLock> r14) throws java.io.IOException {
            /*
                r12 = this;
                boolean r0 = r14 instanceof androidx.content.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1
                if (r0 == 0) goto L14
                r0 = r14
                androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 r0 = (androidx.content.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r14 = r0.label
                int r14 = r14 + r2
                r0.label = r14
                goto L19
            L14:
                androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 r0 = new androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1
                r0.<init>(r12, r14)
            L19:
                java.lang.Object r14 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L38
                if (r2 != r3) goto L30
                long r4 = r0.J$0
                java.lang.Object r13 = r0.L$0
                java.io.FileOutputStream r13 = (java.io.FileOutputStream) r13
                kotlin.ResultKt.throwOnFailure(r14)
                goto L82
            L30:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L38:
                kotlin.ResultKt.throwOnFailure(r14)
                long r4 = androidx.content.core.MultiProcessCoordinator.access$getINITIAL_WAIT_MILLIS$cp()
            L3f:
                long r6 = androidx.content.core.MultiProcessCoordinator.access$getMAX_WAIT_MILLIS$cp()
                int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                java.lang.String r2 = ""
                if (r14 > 0) goto L87
                java.nio.channels.FileChannel r6 = r13.getChannel()     // Catch: java.io.IOException -> L5d
                r7 = 0
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r11 = 0
                java.nio.channels.FileLock r14 = r6.lock(r7, r9, r11)     // Catch: java.io.IOException -> L5d
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r2)     // Catch: java.io.IOException -> L5d
                return r14
            L5d:
                r14 = move-exception
                java.lang.String r2 = r14.getMessage()
                if (r2 == 0) goto L86
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.String r6 = androidx.content.core.MultiProcessCoordinator.access$getDEADLOCK_ERROR_MESSAGE$cp()
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                r7 = 2
                r8 = 0
                r9 = 0
                boolean r2 = kotlin.text.StringsKt.contains$default(r2, r6, r9, r7, r8)
                if (r2 != r3) goto L86
                r0.L$0 = r13
                r0.J$0 = r4
                r0.label = r3
                java.lang.Object r14 = defpackage.AudioEncoderConfigAudioProfileResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r4, r0)
                if (r14 != r1) goto L82
                return r1
            L82:
                r6 = 2
                long r4 = r4 * r6
                goto L3f
            L86:
                throw r14
            L87:
                java.nio.channels.FileChannel r6 = r13.getChannel()
                r7 = 0
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r11 = 0
                java.nio.channels.FileLock r13 = r6.lock(r7, r9, r11)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r2)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.content.core.MultiProcessCoordinator.Companion.getExclusiveFileLockWithRetryIfDeadlock(java.io.FileOutputStream, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.content.core.InterProcessCoordinator
    public final Object getVersion(Continuation<? super Integer> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return Boxing.boxInt(getSharedCounter().getValue());
        }
        return BuildersKt.TuitionPaymentFragmentbindingInflater1(this.context, new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, null), continuation);
    }

    @Override // androidx.content.core.InterProcessCoordinator
    public final Object incrementAndGetVersion(Continuation<? super Integer> continuation) {
        if (this.lazySharedCounter.isInitialized()) {
            return Boxing.boxInt(getSharedCounter().incrementAndGetValue());
        }
        return BuildersKt.TuitionPaymentFragmentbindingInflater1(this.context, new MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(this, null), continuation);
    }
}
