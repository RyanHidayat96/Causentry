package okhttp3;

import RotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.collection.SieveCacheKt;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.android.gms.common.internal.ImagesContract;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListener;
import defpackage.RotationProviderListenerWrapper;
import defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0;
import defpackage.SurfaceViewImplementation;
import defpackage.SurfaceViewImplementationApi24Impl;
import defpackage.getBrightness;
import defpackage.tryToComplete;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0004EDFGB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0018\u00010\fR\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0004\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\u0012J\r\u0010 \u001a\u00020\u0005¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010\u001eJ\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0004\u001a\u00020\u0019H\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0018H\u0000¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u001c¢\u0006\u0004\b(\u0010\u001eJ\r\u0010)\u001a\u00020\u0005¢\u0006\u0004\b)\u0010!J\u000f\u0010*\u001a\u00020\u000eH\u0000¢\u0006\u0004\b*\u0010\u0012J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020+H\u0000¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0019H\u0000¢\u0006\u0004\b.\u0010/J\u0015\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0007¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u001c¢\u0006\u0004\b4\u0010\u001eJ\r\u00105\u001a\u00020\u001c¢\u0006\u0004\b5\u0010\u001eR\u001a\u00106\u001a\u00020\r8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0011\u0010:\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b:\u0010\u0015R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010;R\u0011\u0010=\u001a\u00020<8G¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0016\u0010\"\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010;R\u0016\u0010(\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010;R\"\u00104\u001a\u00020\u001c8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b4\u0010;\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u0010AR\"\u00105\u001a\u00020\u001c8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b5\u0010;\u001a\u0004\bB\u0010\u001e\"\u0004\bC\u0010A"}, d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Ljava/io/File;", "p0", "", "p1", "<init>", "(Ljava/io/File;J)V", "Lokhttp3/internal/io/FileSystem;", "p2", "(Ljava/io/File;JLokhttp3/internal/io/FileSystem;)V", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "", "abortQuietly", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "close", "()V", "delete", "-deprecated_directory", "()Ljava/io/File;", "evictAll", "flush", "Lokhttp3/Request;", "Lokhttp3/Response;", "get$okhttp", "(Lokhttp3/Request;)Lokhttp3/Response;", "", "hitCount", "()I", "initialize", "maxSize", "()J", "networkCount", "Lokhttp3/internal/cache/CacheRequest;", "put$okhttp", "(Lokhttp3/Response;)Lokhttp3/internal/cache/CacheRequest;", "remove$okhttp", "(Lokhttp3/Request;)V", "requestCount", "size", "trackConditionalCacheHit$okhttp", "Lokhttp3/internal/cache/CacheStrategy;", "trackResponse$okhttp", "(Lokhttp3/internal/cache/CacheStrategy;)V", "update$okhttp", "(Lokhttp3/Response;Lokhttp3/Response;)V", "", "", "urls", "()Ljava/util/Iterator;", "writeAbortCount", "writeSuccessCount", "cache", "Lokhttp3/internal/cache/DiskLruCache;", "getCache$okhttp", "()Lokhttp3/internal/cache/DiskLruCache;", "directory", "I", "", "isClosed", "()Z", "getWriteAbortCount$okhttp", "setWriteAbortCount$okhttp", "(I)V", "getWriteSuccessCount$okhttp", "setWriteSuccessCount$okhttp", "Companion", "CacheResponseBody", "Entry", "RealCacheRequest"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Cache implements Closeable, Flushable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    public Cache(File file, long j, FileSystem fileSystem) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(fileSystem, "");
        this.cache = new DiskLruCache(fileSystem, file, VERSION, 2, j, TaskRunner.INSTANCE);
    }

    /* JADX INFO: renamed from: getCache$okhttp, reason: from getter */
    public final DiskLruCache getCache() {
        return this.cache;
    }

    /* JADX INFO: renamed from: getWriteSuccessCount$okhttp, reason: from getter */
    public final int getWriteSuccessCount() {
        return this.writeSuccessCount;
    }

    public final void setWriteSuccessCount$okhttp(int i) {
        this.writeSuccessCount = i;
    }

    /* JADX INFO: renamed from: getWriteAbortCount$okhttp, reason: from getter */
    public final int getWriteAbortCount() {
        return this.writeAbortCount;
    }

    public final void setWriteAbortCount$okhttp(int i) {
        this.writeAbortCount = i;
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(File file, long j) {
        this(file, j, FileSystem.SYSTEM);
        Intrinsics.checkNotNullParameter(file, "");
    }

    public final Response get$okhttp(Request p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(INSTANCE.key(p0.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (entry.matches(p0, response)) {
                    return response;
                }
                ResponseBody responseBodyBody = response.body();
                if (responseBodyBody != null) {
                    Util.closeQuietly(responseBodyBody);
                }
                return null;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final CacheRequest put$okhttp(Response p0) {
        DiskLruCache.Editor editorEdit$default;
        Intrinsics.checkNotNullParameter(p0, "");
        String strMethod = p0.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(p0.request().method())) {
            try {
                remove$okhttp(p0.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!Intrinsics.areEqual(strMethod, ShareTarget.METHOD_GET)) {
            return null;
        }
        Companion companion = INSTANCE;
        if (companion.hasVaryAll(p0)) {
            return null;
        }
        Entry entry = new Entry(p0);
        try {
            editorEdit$default = DiskLruCache.edit$default(this.cache, companion.key(p0.request().url()), 0L, 2, null);
            if (editorEdit$default == null) {
                return null;
            }
            try {
                entry.writeTo(editorEdit$default);
                return new RealCacheRequest(this, editorEdit$default);
            } catch (IOException unused2) {
                abortQuietly(editorEdit$default);
                return null;
            }
        } catch (IOException unused3) {
            editorEdit$default = null;
        }
    }

    public final void remove$okhttp(Request p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        this.cache.remove(INSTANCE.key(p0.url()));
    }

    public final void update$okhttp(Response p0, Response p1) {
        DiskLruCache.Editor editorEdit;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Entry entry = new Entry(p1);
        ResponseBody responseBodyBody = p0.body();
        Intrinsics.checkNotNull(responseBodyBody, "");
        try {
            editorEdit = ((CacheResponseBody) responseBodyBody).getSnapshot().edit();
            if (editorEdit != null) {
                try {
                    entry.writeTo(editorEdit);
                    editorEdit.commit();
                } catch (IOException unused) {
                    abortQuietly(editorEdit);
                }
            }
        } catch (IOException unused2) {
            editorEdit = null;
        }
    }

    private final void abortQuietly(DiskLruCache.Editor p0) {
        if (p0 != null) {
            try {
                p0.abort();
            } catch (IOException unused) {
            }
        }
    }

    public final void initialize() throws IOException {
        this.cache.initialize();
    }

    public final void delete() throws IOException {
        this.cache.delete();
    }

    public final void evictAll() throws IOException {
        this.cache.evictAll();
    }

    /* JADX INFO: renamed from: okhttp3.Cache$urls$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0097\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\f\u0012\b\u0012\u00060\rR\u00020\u000e0\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lokhttp3/Cache$urls$1;", "", "", "", "hasNext", "()Z", "next", "()Ljava/lang/String;", "", "remove", "()V", "canRemove", "Z", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "delegate", "Ljava/util/Iterator;", "nextUrl", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterator<String>, KMutableIterator {
        private boolean canRemove;
        private final Iterator<DiskLruCache.Snapshot> delegate;
        private String nextUrl;

        AnonymousClass1(Cache cache) {
            this.delegate = cache.getCache().snapshots();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.nextUrl != null) {
                return true;
            }
            this.canRemove = false;
            while (this.delegate.hasNext()) {
                try {
                    DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        continue;
                        this.nextUrl = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(next.getSource(0)).IconCompatParcelizer();
                        CloseableKt.closeFinally(next, null);
                        return true;
                    } catch (Throwable th) {
                        try {
                            continue;
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(next, th);
                            throw th2;
                        }
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public final String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.nextUrl;
            Intrinsics.checkNotNull(str);
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.canRemove) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            this.delegate.remove();
        }
    }

    public final Iterator<String> urls() throws IOException {
        return new AnonymousClass1(this);
    }

    public final int writeAbortCount() {
        int i;
        synchronized (this) {
            i = this.writeAbortCount;
        }
        return i;
    }

    public final int writeSuccessCount() {
        int i;
        synchronized (this) {
            i = this.writeSuccessCount;
        }
        return i;
    }

    public final long size() throws IOException {
        return this.cache.size();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        this.cache.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.cache.close();
    }

    public final File directory() {
        return this.cache.getDirectory();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "directory", imports = {}))
    /* JADX INFO: renamed from: -deprecated_directory, reason: not valid java name */
    public final File m9527deprecated_directory() {
        return this.cache.getDirectory();
    }

    public final void trackResponse$okhttp(CacheStrategy p0) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.requestCount++;
            if (p0.getNetworkRequest() != null) {
                this.networkCount++;
            } else if (p0.getCacheResponse() != null) {
                this.hitCount++;
            }
        }
    }

    public final void trackConditionalCacheHit$okhttp() {
        synchronized (this) {
            this.hitCount++;
        }
    }

    public final int networkCount() {
        int i;
        synchronized (this) {
            i = this.networkCount;
        }
        return i;
    }

    public final int hitCount() {
        int i;
        synchronized (this) {
            i = this.hitCount;
        }
        return i;
    }

    public final int requestCount() {
        int i;
        synchronized (this) {
            i = this.requestCount;
        }
        return i;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\"\u0010\u0010\u001a\u00020\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u00060\u0002R\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lokhttp3/internal/cache/CacheRequest;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "p0", "<init>", "(Lokhttp3/Cache;Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "", "abort", "()V", "LSurfaceViewImplementationApi24Impl;", "body", "()LSurfaceViewImplementationApi24Impl;", "LSurfaceViewImplementationApi24Impl;", "cacheOut", "", "done", "Z", "getDone", "()Z", "setDone", "(Z)V", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class RealCacheRequest implements CacheRequest {
        private final SurfaceViewImplementationApi24Impl body;
        private final SurfaceViewImplementationApi24Impl cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;
        final /* synthetic */ Cache this$0;

        public RealCacheRequest(final Cache cache, DiskLruCache.Editor editor) {
            Intrinsics.checkNotNullParameter(editor, "");
            this.this$0 = cache;
            this.editor = editor;
            SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24ImplNewSink = editor.newSink(1);
            this.cacheOut = surfaceViewImplementationApi24ImplNewSink;
            this.body = new getBrightness(surfaceViewImplementationApi24ImplNewSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // defpackage.getBrightness, defpackage.SurfaceViewImplementationApi24Impl, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
                    Cache cache2 = cache;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.getDone()) {
                            return;
                        }
                        realCacheRequest.setDone(true);
                        cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount() + 1);
                        super.close();
                        this.editor.commit();
                    }
                }
            };
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z) {
            this.done = z;
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public final void abort() {
            Cache cache = this.this$0;
            synchronized (cache) {
                if (this.done) {
                    return;
                }
                this.done = true;
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount() + 1);
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        /* JADX INFO: renamed from: body, reason: from getter */
        public final SurfaceViewImplementationApi24Impl getBody() {
            return this.body;
        }
    }

    @JvmStatic
    public static final String key(HttpUrl httpUrl) {
        return INSTANCE.key(httpUrl);
    }

    @Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 72\u00020\u0001:\u00017B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u00062\n\u0010\u0003\u001a\u00060\u0012R\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00162\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00172\n\u0010\u0003\u001a\u00060\u001aR\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u0004\u0018\u00010 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\n8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010'R\u0014\u00100\u001a\u00020/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u0010-R\u0014\u00104\u001a\u0002038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00101"}, d2 = {"Lokhttp3/Cache$Entry;", "", "LtryToComplete;", "p0", "<init>", "(LtryToComplete;)V", "Lokhttp3/Response;", "(Lokhttp3/Response;)V", "Lokhttp3/Request;", "p1", "", "matches", "(Lokhttp3/Request;Lokhttp3/Response;)Z", "LRotationProvider1;", "", "Ljava/security/cert/Certificate;", "readCertificateList", "(LRotationProvider1;)Ljava/util/List;", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "response", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;)Lokhttp3/Response;", "LRotationProviderListener;", "", "writeCertList", "(LRotationProviderListener;Ljava/util/List;)V", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "writeTo", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "", "code", "I", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Handshake;", "isHttps", "()Z", "", "message", "Ljava/lang/String;", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/Protocol;", "", "receivedResponseMillis", "J", "requestMethod", "Lokhttp3/Headers;", "responseHeaders", "Lokhttp3/Headers;", "sentRequestMillis", "Lokhttp3/HttpUrl;", ImagesContract.URL, "Lokhttp3/HttpUrl;", "varyHeaders", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Entry {
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final HttpUrl url;
        private final Headers varyHeaders;

        private final boolean isHttps() {
            return Intrinsics.areEqual(this.url.scheme(), "https");
        }

        public Entry(tryToComplete trytocomplete) throws IOException {
            TlsVersion tlsVersionForJavaName;
            Intrinsics.checkNotNullParameter(trytocomplete, "");
            tryToComplete trytocomplete2 = trytocomplete;
            try {
                RotationProvider1 rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(trytocomplete);
                String strIconCompatParcelizer = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer();
                HttpUrl httpUrl = HttpUrl.INSTANCE.parse(strIconCompatParcelizer);
                if (httpUrl == null) {
                    StringBuilder sb = new StringBuilder("Cache corruption for ");
                    sb.append(strIconCompatParcelizer);
                    IOException iOException = new IOException(sb.toString());
                    Platform.INSTANCE.get().log("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.url = httpUrl;
                this.requestMethod = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer();
                Headers.Builder builder = new Headers.Builder();
                int int$okhttp = Cache.INSTANCE.readInt$okhttp(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                for (int i = 0; i < int$okhttp; i++) {
                    builder.addLenient$okhttp(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer());
                }
                this.varyHeaders = builder.build();
                StatusLine statusLine = StatusLine.INSTANCE.parse(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer());
                this.protocol = statusLine.protocol;
                this.code = statusLine.code;
                this.message = statusLine.message;
                Headers.Builder builder2 = new Headers.Builder();
                int int$okhttp2 = Cache.INSTANCE.readInt$okhttp(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                for (int i2 = 0; i2 < int$okhttp2; i2++) {
                    builder2.addLenient$okhttp(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer());
                }
                String str = SENT_MILLIS;
                String str2 = builder2.get(str);
                String str3 = RECEIVED_MILLIS;
                String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0L;
                this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : 0L;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String strIconCompatParcelizer2 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer();
                    if (strIconCompatParcelizer2.length() > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("expected \"\" but was \"");
                        sb2.append(strIconCompatParcelizer2);
                        sb2.append(Typography.quote);
                        throw new IOException(sb2.toString());
                    }
                    CipherSuite cipherSuiteForJavaName = CipherSuite.INSTANCE.forJavaName(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer());
                    List<Certificate> certificateList = readCertificateList(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    List<Certificate> certificateList2 = readCertificateList(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    if (!rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.d()) {
                        tlsVersionForJavaName = TlsVersion.INSTANCE.forJavaName(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.IconCompatParcelizer());
                    } else {
                        tlsVersionForJavaName = TlsVersion.SSL_3_0;
                    }
                    this.handshake = Handshake.INSTANCE.get(tlsVersionForJavaName, cipherSuiteForJavaName, certificateList, certificateList2);
                } else {
                    this.handshake = null;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(trytocomplete2, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(trytocomplete2, th);
                    throw th2;
                }
            }
        }

        public Entry(Response response) {
            Intrinsics.checkNotNullParameter(response, "");
            this.url = response.request().url();
            this.varyHeaders = Cache.INSTANCE.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }

        public final void writeTo(DiskLruCache.Editor p0) throws IOException {
            Intrinsics.checkNotNullParameter(p0, "");
            RotationProviderListener rotationProviderListenerTuitionPaymentFragmentbindingInflater1 = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(p0.newSink(0));
            try {
                RotationProviderListener rotationProviderListener = rotationProviderListenerTuitionPaymentFragmentbindingInflater1;
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.url.toString()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.requestMethod).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                rotationProviderListener.a(this.varyHeaders.size()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                int size = this.varyHeaders.size();
                for (int i = 0; i < size; i++) {
                    rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.varyHeaders.name(i)).TuitionPaymentFragmentspecialinlinedviewModeldefault1(": ").TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.varyHeaders.value(i)).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                }
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new StatusLine(this.protocol, this.code, this.message).toString()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                rotationProviderListener.a(this.responseHeaders.size() + 2).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                int size2 = this.responseHeaders.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.responseHeaders.name(i2)).TuitionPaymentFragmentspecialinlinedviewModeldefault1(": ").TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.responseHeaders.value(i2)).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                }
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SENT_MILLIS).TuitionPaymentFragmentspecialinlinedviewModeldefault1(": ").a(this.sentRequestMillis).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(RECEIVED_MILLIS).TuitionPaymentFragmentspecialinlinedviewModeldefault1(": ").a(this.receivedResponseMillis).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                if (isHttps()) {
                    rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                    Handshake handshake = this.handshake;
                    Intrinsics.checkNotNull(handshake);
                    rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(handshake.cipherSuite().javaName()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                    writeCertList(rotationProviderListener, this.handshake.peerCertificates());
                    writeCertList(rotationProviderListener, this.handshake.localCertificates());
                    rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.handshake.tlsVersion().javaName()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(rotationProviderListenerTuitionPaymentFragmentbindingInflater1, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(rotationProviderListenerTuitionPaymentFragmentbindingInflater1, th);
                    throw th2;
                }
            }
        }

        private final List<Certificate> readCertificateList(RotationProvider1 p0) throws IOException {
            int int$okhttp = Cache.INSTANCE.readInt$okhttp(p0);
            if (int$okhttp == -1) {
                return CollectionsKt.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(int$okhttp);
                for (int i = 0; i < int$okhttp; i++) {
                    String strIconCompatParcelizer = p0.IconCompatParcelizer();
                    RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
                    ByteString.Companion companion = ByteString.INSTANCE;
                    ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strIconCompatParcelizer);
                    if (byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    Intrinsics.checkNotNullParameter(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                    byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper, 0, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                    arrayList.add(certificateFactory.generateCertificate(rotationProviderListenerWrapper.new TuitionPaymentFragmentspecialinlinedviewModeldefault1()));
                }
                return arrayList;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        private final void writeCertList(RotationProviderListener p0, List<? extends Certificate> p1) throws IOException {
            try {
                p0.a(p1.size()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                Iterator<? extends Certificate> it = p1.iterator();
                while (it.hasNext()) {
                    byte[] encoded = it.next().getEncoded();
                    ByteString.Companion companion = ByteString.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(encoded, "");
                    p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ByteString.Companion.b(encoded).b()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public final boolean matches(Request p0, Response p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            return Intrinsics.areEqual(this.url, p0.url()) && Intrinsics.areEqual(this.requestMethod, p0.method()) && Cache.INSTANCE.varyMatches(p1, this.varyHeaders, p0);
        }

        public final Response response(DiskLruCache.Snapshot p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            String str = this.responseHeaders.get(HttpHeaderParser.HEADER_CONTENT_TYPE);
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(p0, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        static {
            StringBuilder sb = new StringBuilder();
            sb.append(Platform.INSTANCE.get().getPrefix());
            sb.append("-Sent-Millis");
            SENT_MILLIS = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Platform.INSTANCE.get().getPrefix());
            sb2.append("-Received-Millis");
            RECEIVED_MILLIS = sb2.toString();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u001e\u0010\u0016\u001a\u00060\u0002R\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "p0", "", "p1", "p2", "<init>", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;Ljava/lang/String;Ljava/lang/String;)V", "", "contentLength", "()J", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "LRotationProvider1;", "source", "()LRotationProvider1;", "bodySource", "LRotationProvider1;", "Ljava/lang/String;", "snapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "getSnapshot", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class CacheResponseBody extends ResponseBody {
        private final RotationProvider1 bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            Intrinsics.checkNotNullParameter(snapshot, "");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new RotationProviderListenerWrapperExternalSyntheticLambda0(snapshot.getSource(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0, defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
                    this.getSnapshot().close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public final MediaType get$contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.INSTANCE.parse(str);
            }
            return null;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public final long getContentLength() {
            String str = this.contentLength;
            if (str != null) {
                return Util.toLongOrDefault(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source, reason: from getter */
        public final RotationProvider1 getSource() {
            return this.bodySource;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0014*\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019*\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u000f\u001a\u00020\r*\u00020\u0011H\u0007¢\u0006\u0004\b\u000f\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001e"}, d2 = {"Lokhttp3/Cache$Companion;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "p0", "", "key", "(Lokhttp3/HttpUrl;)Ljava/lang/String;", "LRotationProvider1;", "", "readInt$okhttp", "(LRotationProvider1;)I", "Lokhttp3/Headers;", "p1", "varyHeaders", "(Lokhttp3/Headers;Lokhttp3/Headers;)Lokhttp3/Headers;", "Lokhttp3/Response;", "Lokhttp3/Request;", "p2", "", "varyMatches", "(Lokhttp3/Response;Lokhttp3/Headers;Lokhttp3/Request;)Z", "hasVaryAll", "(Lokhttp3/Response;)Z", "", "varyFields", "(Lokhttp3/Headers;)Ljava/util/Set;", "(Lokhttp3/Response;)Lokhttp3/Headers;", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final String key(HttpUrl p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            ByteString.Companion companion = ByteString.INSTANCE;
            return ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0.toString()).b("MD5").TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }

        public final int readInt$okhttp(RotationProvider1 p0) throws IOException {
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                long jINotificationSideChannel = p0.INotificationSideChannel();
                String strIconCompatParcelizer = p0.IconCompatParcelizer();
                if (jINotificationSideChannel >= 0 && jINotificationSideChannel <= SieveCacheKt.NodeLinkMask && strIconCompatParcelizer.length() <= 0) {
                    return (int) jINotificationSideChannel;
                }
                StringBuilder sb = new StringBuilder("expected an int but was \"");
                sb.append(jINotificationSideChannel);
                sb.append(strIconCompatParcelizer);
                sb.append(Typography.quote);
                throw new IOException(sb.toString());
            } catch (NumberFormatException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public final boolean varyMatches(Response p0, Headers p1, Request p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Set<String> setVaryFields = varyFields(p0.headers());
            if ((setVaryFields instanceof Collection) && setVaryFields.isEmpty()) {
                return true;
            }
            for (String str : setVaryFields) {
                if (!Intrinsics.areEqual(p1.values(str), p2.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        public final boolean hasVaryAll(Response response) {
            Intrinsics.checkNotNullParameter(response, "");
            return varyFields(response.headers()).contains("*");
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if (StringsKt.equals("Vary", headers.name(i), true)) {
                    String strValue = headers.value(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
                    }
                    Iterator it = StringsKt.split$default((CharSequence) strValue, new char[]{','}, false, 0, 6, (Object) null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(StringsKt.trim((CharSequence) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? SetsKt.emptySet() : treeSet;
        }

        public final Headers varyHeaders(Response response) {
            Intrinsics.checkNotNullParameter(response, "");
            Response responseNetworkResponse = response.networkResponse();
            Intrinsics.checkNotNull(responseNetworkResponse);
            return varyHeaders(responseNetworkResponse.request().headers(), response.headers());
        }

        private final Headers varyHeaders(Headers p0, Headers p1) {
            Set<String> setVaryFields = varyFields(p1);
            if (setVaryFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = p0.size();
            for (int i = 0; i < size; i++) {
                String strName = p0.name(i);
                if (setVaryFields.contains(strName)) {
                    builder.add(strName, p0.value(i));
                }
            }
            return builder.build();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
