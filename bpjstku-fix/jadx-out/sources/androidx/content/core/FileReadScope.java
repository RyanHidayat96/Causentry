package androidx.content.core;

import androidx.exifinterface.media.ExifInterface;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00038\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/datastore/core/FileReadScope;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/ReadScope;", "Ljava/io/File;", "p0", "Landroidx/datastore/core/Serializer;", "p1", "<init>", "(Ljava/io/File;Landroidx/datastore/core/Serializer;)V", "", "checkNotClosed", "()V", "close", "readData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "file", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "serializer", "Landroidx/datastore/core/Serializer;", "getSerializer", "()Landroidx/datastore/core/Serializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class FileReadScope<T> implements ReadScope<T> {
    private final AtomicBoolean closed;
    private final File file;
    private final Serializer<T> serializer;

    /* JADX INFO: renamed from: androidx.datastore.core.FileReadScope$readData$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.FileReadScope", f = "FileStorage.kt", i = {0}, l = {169, 178}, m = "readData$suspendImpl", n = {"$this"}, s = {"L$0"})
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FileReadScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FileReadScope<T> fileReadScope, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = fileReadScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileReadScope.readData$suspendImpl(this.this$0, this);
        }
    }

    public FileReadScope(File file, Serializer<T> serializer) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(serializer, "");
        this.file = file;
        this.serializer = serializer;
        this.closed = new AtomicBoolean(false);
    }

    protected final File getFile() {
        return this.file;
    }

    protected final Serializer<T> getSerializer() {
        return this.serializer;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    static /* synthetic */ <T> Object readData$suspendImpl(FileReadScope<T> fileReadScope, Continuation<? super T> continuation) {
        AnonymousClass1 anonymousClass1;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        FileReadScope<T> fileReadScope2;
        Closeable closeable2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fileReadScope, continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fileReadScope, continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                fileReadScope.checkNotClosed();
                fileInputStream = new FileInputStream(((FileReadScope) fileReadScope).file);
                try {
                    anonymousClass1.L$0 = fileReadScope;
                    anonymousClass1.L$1 = fileInputStream;
                    anonymousClass1.label = 1;
                    Object from = ((FileReadScope) fileReadScope).serializer.readFrom(fileInputStream, anonymousClass1);
                    if (from != coroutine_suspended) {
                        fileReadScope2 = fileReadScope;
                        closeable2 = fileInputStream;
                        obj = from;
                        CloseableKt.closeFinally(closeable2, null);
                        return obj;
                    }
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) anonymousClass1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    CloseableKt.closeFinally(closeable, null);
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(closeable, th);
                        throw th4;
                    }
                }
            }
            closeable2 = (Closeable) anonymousClass1.L$1;
            fileReadScope2 = (FileReadScope) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                try {
                    CloseableKt.closeFinally(closeable2, null);
                    return obj;
                } catch (FileNotFoundException unused) {
                    fileReadScope = fileReadScope2;
                }
            } catch (Throwable th5) {
                fileInputStream = closeable2;
                fileReadScope = fileReadScope2;
                th = th5;
                try {
                    throw th;
                } catch (Throwable th6) {
                    CloseableKt.closeFinally(fileInputStream, th);
                    throw th6;
                }
            }
        } catch (FileNotFoundException unused2) {
        }
        if (((FileReadScope) fileReadScope).file.exists()) {
            FileInputStream fileInputStream2 = new FileInputStream(((FileReadScope) fileReadScope).file);
            try {
                anonymousClass1.L$0 = fileInputStream2;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 2;
                Object from2 = ((FileReadScope) fileReadScope).serializer.readFrom(fileInputStream2, anonymousClass1);
                if (from2 != coroutine_suspended) {
                    obj = from2;
                    closeable = fileInputStream2;
                    CloseableKt.closeFinally(closeable, null);
                    return obj;
                }
                return coroutine_suspended;
            } catch (Throwable th7) {
                th = th7;
                closeable = fileInputStream2;
                throw th;
            }
        }
        return ((FileReadScope) fileReadScope).serializer.getDefaultValue();
    }

    @Override // androidx.content.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    protected final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.".toString());
        }
    }

    @Override // androidx.content.core.ReadScope
    public Object readData(Continuation<? super T> continuation) {
        return readData$suspendImpl(this, continuation);
    }
}
